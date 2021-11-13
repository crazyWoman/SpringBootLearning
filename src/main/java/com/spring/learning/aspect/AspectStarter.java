package com.spring.learning.aspect;

import com.spring.learning.aspect.test.EmployeeAccount;
import com.spring.learning.aspect.test.senior.Employee;
import com.spring.learning.aspect.test.senior.Person;
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
       emp.getName();
        Person person = context.getBean(Person.class);
        person.isPersonActive();

        Employee employee = context.getBean(Employee.class);
        employee.isEmployeeRetire();

    }
}
