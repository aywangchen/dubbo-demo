package com.dubbo.demo.service;

import com.dubbo.demo.service.DTO.UserDTO;

/**
 * Created by wangc on 2017/3/1.
 */
public interface ITest {
    public void sayHello(String message);

    public UserDTO getUser(String userName);

    public String addUser(UserDTO user);
}
