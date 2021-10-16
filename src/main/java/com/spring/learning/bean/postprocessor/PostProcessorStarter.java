package com.spring.learning.bean.postprocessor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PostProcessorStarter {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PostProcessorStarter.class);
        SmithaBean bean = context.getBean(SmithaBean.class);
        System.out.println(bean.hashCode());

        SmithaBean bean1 = context.getBean(SmithaBean.class);
        System.out.println(bean1.hashCode());

        AlbertBean bean2 = context.getBean(AlbertBean.class);
        System.out.println(bean2.hashCode());

        AlbertBean bean3 = context.getBean(AlbertBean.class);
        System.out.println(bean3.hashCode());




    }
}
