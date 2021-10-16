package com.spring.learning.bean.postprocessor;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SmithaBean {

    public SmithaBean() {
        System.out.println("*******************SmithaBean instance created");
    }

    @PostConstruct
    private void init() {
        System.out.println("****************Verifying Resources");
    }

    @PreDestroy
    private void shutdown() {
        System.out.println("***************Shutdown All Resources");
    }


}
