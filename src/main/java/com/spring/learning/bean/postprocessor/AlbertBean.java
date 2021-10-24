package com.spring.learning.bean.postprocessor;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AlbertBean {
    public AlbertBean() {
        System.out.println("*******************Albert instance created");
    }

    @PostConstruct
    private void init() {
        System.out.println("**************** Albert Verifying Resources");
    }

    @PreDestroy
    private void shutdown() {
        System.out.println("***************Albert Shutdown All Resources");
    }



}
