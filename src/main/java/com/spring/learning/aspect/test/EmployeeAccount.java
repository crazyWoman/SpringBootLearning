package com.spring.learning.aspect.test;

import org.springframework.stereotype.Component;

public class EmployeeAccount {

    public void calculateBonus(){
        System.out.println("bonus is "+2000);
    }

    public int calculateBonusAndSalary(){
        System.out.println("calculateBonusAndSalary is "+2000);
        return 132000;
    }
}
