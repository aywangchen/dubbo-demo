package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.DTO.UserDTO;
import com.dubbo.demo.service.ITest;

/**
 * Created by wangc on 2017/3/1.
 */
public class TestImpl implements ITest {

    public void sayHello(String message) {
        System.out.println("service say:" +message);
    }

    public UserDTO getUser(String userName) {
        UserDTO user = new UserDTO();
        user.setUserName("wangchen");
        user.setPassword("123456");

        return user;
    }

    public String addUser(UserDTO user) {
        System.out.println("userName:" + user.getUserName());
        System.out.println("password:" + user.getPassword());
        return "添加用户成功";
    }
}
