package com.bjsxt.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class OriginPojo {

    public void testTea(){
        System.out.println("我是教师类");
    }

    public void testStu(){
        System.out.println("我是学生类");
    }



}
