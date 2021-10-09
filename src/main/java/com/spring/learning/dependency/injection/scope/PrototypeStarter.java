package com.spring.learning.dependency.injection.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrototypeStarter {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PrototypeStarter.class);

        PersonDao dao = (PersonDao)context.getBean(PersonDao.class);

        PersonDao dao1 = (PersonDao)context.getBean(PersonDao.class);

        System.out.println(dao);

       System.out.println(dao1);

        System.out.println(dao.getConnection());

        System.out.println(dao1.getConnection());
    }
}
