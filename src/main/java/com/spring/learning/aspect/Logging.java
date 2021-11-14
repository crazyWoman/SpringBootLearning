package com.spring.learning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logging {

    @Pointcut("execution(* *..calculate*())")
    private void selectAll(){}

    @Pointcut("execution(* *..getName())")
    private void selectGet(){}

    @Pointcut("within(com.spring.learning.aspect.test.senior.*)")
    private void selectSenior(){}

    @Pointcut("selectAll() || selectGet () || selectSenior()")
    private void selectBoth(){}


   /* @Pointcut("within(com.spring.learning.aspect.test.*)")
    private void select(){}*/
/*
    @AfterReturning(value="execution(* *..getName())",returning = "retVal")
    public void afterReturnAdvice(Object retVal){
        System.out.println("Going to afterReturnAdvice Employee Account."+retVal+"Meenekkodath");
    }*/

    @AfterReturning(value="execution(* *..getName())",returning="account")
    public void afterReturningAdvice(JoinPoint joinPoint, String account)
    {
        System.out.println("After Returing method:"+joinPoint.getSignature());

        System.out.println(account);
    }

    @AfterThrowing(value="execution(* *..getAge())",throwing="error")
    public void afterThrowingAdvice(JoinPoint jp, Throwable error)
    {
        System.out.println("After Returing method:"+jp.getSignature());

        System.out.println(error);
    }

    @Before("selectBoth()")
    public void beforeAdvice(){
        System.out.println("Going to beforeAdvice Employee Account.");
    }

 /*   @AfterReturning("selectAll()")
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
    }*/
}
