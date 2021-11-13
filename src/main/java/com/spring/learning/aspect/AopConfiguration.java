package com.spring.learning.aspect;

import com.spring.learning.aspect.test.EmployeeAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfiguration {

    @Bean
    public EmployeeAccount employeeAccount(){
        return new EmployeeAccount();
    }
}
