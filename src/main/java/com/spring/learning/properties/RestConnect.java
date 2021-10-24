package com.spring.learning.properties;

import org.springframework.beans.factory.annotation.Autowired;

public class RestConnect {
    String url;
    @Autowired
    MmmProperties mmmProperties;



    public RestConnect(String url, String passeord, String sqlName) {

        /*System.out.println("*****RestConnect"+url);
        System.out.println("*****RestConnect"+passeord);
        System.out.println("*****RestConnect"+sqlName);
        System.out.println("*****RestConnect"+mmmProperties.getDaughter());
        System.out.println("*****RestConnect"+mmmProperties.getSon());
        System.out.println("*****RestConnect"+mmmProperties.getName());*/
        this.url = url;


    }
}
