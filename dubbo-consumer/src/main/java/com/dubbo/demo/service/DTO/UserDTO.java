package com.dubbo.demo.service.DTO;

import java.io.Serializable;

/**
 * Created by wangc on 2017/3/1.
 */
public class UserDTO implements Serializable {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
