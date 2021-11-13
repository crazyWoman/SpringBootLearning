package com.spring.learning.aspect;

import com.spring.learning.aspect.test.EmployeeAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectStarter {
    public static void main(String[] args) {
    ApplicationContext context =  SpringApplication.run(AspectStarter.class);
        EmployeeAccount emp = context.getBean(EmployeeAccount.class);
        emp.calculateBonusAndSalary();
        emp.calculateBonus();

    }
}
