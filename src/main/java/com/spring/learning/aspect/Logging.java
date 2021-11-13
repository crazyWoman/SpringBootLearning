package com.spring.learning.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logging {

    @Pointcut("execution(* *..calculate*())")
    private void selectAll(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to beforeAdvice Employee Account.");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Going to afterAdvice Employee Account.");
    }
}
