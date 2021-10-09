package com.spring.learning.dependency.injection.primary.algorithm;

import com.spring.learning.dependency.injection.primary.algorithm.search.BinarySearchPrimary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimaryStarter {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PrimaryStarter.class);
        BinarySearchPrimary search = context.getBean(BinarySearchPrimary.class);
        int result = search.search(new int[]{20,5,2,200},2);
        System.out.println(result);

    }
}
