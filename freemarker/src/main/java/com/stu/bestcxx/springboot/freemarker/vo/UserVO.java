package com.stu.bestcxx.springboot.freemarker.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class UserVO {
    private Long id;
    private String userName;
    private String password;
}