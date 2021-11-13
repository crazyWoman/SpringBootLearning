package com.spring.learning.aspect;

import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logging {

    @Pointcut("execution(* *..calculate*())")
    private void selectAll(){}


    @Pointcut("within(com.spring.learning.aspect.test.*)")
    private void select(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to beforeAdvice Employee Account.");
    }

    @AfterReturning("select()")
    public void afterReturnAdvice(){
        System.out.println("Going to afterReturnAdvice Employee Account.");
    }

    @AfterReturning(pointcut = "execution(* getName())")
    public void afterReturnAdvice1(){
        System.out.println("Going to afterReturnAdvice getname.");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Going to afterAdvice Employee Account.");
    }
}
