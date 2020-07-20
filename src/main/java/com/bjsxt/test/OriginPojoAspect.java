package com.bjsxt.test;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OriginPojoAspect {
    @Pointcut("execution(* com.bjsxt.test.*.*(..))")
    public void test1(){
    }
    @After("test1()")
    public void after(){
        System.out.println("我是后置通知");
    }
    @Before("test1()")
    public void before(){
        System.out.println("我是迁址通知");
    }


}
