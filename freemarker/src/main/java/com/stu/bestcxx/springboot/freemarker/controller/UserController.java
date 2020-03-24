package com.stu.bestcxx.springboot.freemarker.controller;

import com.google.common.collect.Lists;
import com.stu.bestcxx.springboot.freemarker.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * WebMvcConfigurer.addViewControllers 用于 / 直接映射到某页面或者新路径
 * 本例子为跳转 新路径
 */
@Controller
public class UserController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //重定向要 /users
        registry.addRedirectViewController("/","/users");

        //如果直接跳转到 某 页面
        //registry.addRedirectViewController("/","/页面名称");
    }

    @GetMapping(value={"/","/users"})
    public ModelAndView users(){
        List list = Lists.newArrayList(
                UserVO.builder().id(1L).userName("Jecket").build(),
                UserVO.builder().id(2L).userName("Wujie").build());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users",list);
        modelAndView.setViewName("users");

        return modelAndView;
    }
}
