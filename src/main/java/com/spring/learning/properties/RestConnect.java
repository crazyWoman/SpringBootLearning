package com.spring.learning.properties;

public class RestConnect {
    String url;

    public RestConnect(String url,String passeord) {
        System.out.println("*****"+url);
        System.out.println("*****"+passeord);
        this.url = url;
    }
}
