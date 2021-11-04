package com.spring.learning.properties;

import org.springframework.stereotype.Component;

@Component
public class Employee {
   /* @Autowired //setter
     MmmProperties mmmProperties;*/

    private final MmmProperties mmmProperties;

    public Employee(MmmProperties mmmProperties) {
        this.mmmProperties = mmmProperties;
    }

    public void get(){

    System.out.println(mmmProperties.getDaughter());
}
}
