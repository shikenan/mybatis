package com.bjsxt.controller;

import com.bjsxt.pojo.Teacher;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/show")
    public List<Teacher> selectAll(){
        return service.selectTea();
    }

}
