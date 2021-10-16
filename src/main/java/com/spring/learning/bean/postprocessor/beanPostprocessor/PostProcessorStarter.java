package com.spring.learning.bean.postprocessor.beanPostprocessor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PostProcessorStarter {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PostProcessorStarter.class);

        RohanBean bean4 = context.getBean(RohanBean.class);
        System.out.println(bean4.hashCode());
    }
}
