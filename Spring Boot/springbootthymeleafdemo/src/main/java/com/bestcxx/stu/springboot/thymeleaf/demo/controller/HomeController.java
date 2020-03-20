package com.bestcxx.stu.springboot.thymeleaf.demo.controller;

import com.bestcxx.stu.springboot.thymeleaf.demo.common.util.IPAddrUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
	
	@RequestMapping(value={"/","/login"})
	public ModelAndView index(Model model, HttpServletRequest request){
		System.out.println("用户访问ip:"+ IPAddrUtils.getIpAddr(request));
		return new ModelAndView("login").addObject("ip",IPAddrUtils.getIpAddr(request));
		
	}
}
