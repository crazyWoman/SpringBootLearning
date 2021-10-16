package com.spring.learning.bean.postprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RheaBean {
    public RheaBean() {
        System.out.println("*******************RheaBean instance created");
    }


    private void initRhea() {
        System.out.println("****************Verifying Resources");
    }


    private void shutdownRhea() {
        System.out.println("***************Shutdown All Resources");
    }
}
