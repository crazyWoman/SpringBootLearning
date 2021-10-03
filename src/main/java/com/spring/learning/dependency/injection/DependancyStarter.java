package com.spring.learning.dependency.injection;

import com.spring.learning.dependency.injection.search.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependancyStarter {
    //what are the beans
    //whar are the dependcies for the bean
    //where to search the beans

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(DependancyStarter.class);
        BinarySearch search = context.getBean(BinarySearch.class);
       int result = search.search(new int[]{20,5,2,200},2);
        System.out.println(result);

    }
}
