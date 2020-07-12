package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.Teacher;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<Teacher> selectTea() {
        Logger logger =Logger.getLogger(UserServiceImpl.class);
        logger.debug("普通日志信息");
        return userMapper.selectTea();
    }
}
