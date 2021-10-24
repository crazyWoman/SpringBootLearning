package com.spring.learning.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
     MmmProperties mmmProperties;

public Employee(){


}
public void get(){
    System.out.println(mmmProperties.getDaughter());
}
}
