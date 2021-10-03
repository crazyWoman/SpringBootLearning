package com.spring.learning.dependency.injection.qualifier.algorithm;

import com.spring.learning.dependency.injection.qualifier.algorithm.search.BinarySearchQualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QualifierStarter {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(QualifierStarter.class);
        BinarySearchQualifier search = context.getBean(BinarySearchQualifier.class);
        int result = search.search(new int[]{20,5,2,200},2);
        System.out.println(result);

    }
}
