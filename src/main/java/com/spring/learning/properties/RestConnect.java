package com.spring.learning.properties;

public class RestConnect {
    String url;

    public RestConnect(String url,String passeord,String sqlName) {
        System.out.println("*****"+url);
        System.out.println("*****"+passeord);
        System.out.println("*****"+sqlName);
        this.url = url;
    }
}
