package com.bjsxt.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private Long userId;

    @Override
    public String toString() {
        return "User{" +
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User() {
    }

    public User(String userName, Long userId) {
        this.userName = userName;
        this.userId = userId;
    }
}
