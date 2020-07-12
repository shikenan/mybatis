package com.bjsxt.pojo;

import java.io.Serializable;

public class Template implements Serializable {
    private String userName;
    private Integer userId;

    @Override
    public String toString() {
        return "Template{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Template() {
    }

    public Template(String userName, Integer userId) {
        this.userName = userName;
        this.userId = userId;
    }
}
