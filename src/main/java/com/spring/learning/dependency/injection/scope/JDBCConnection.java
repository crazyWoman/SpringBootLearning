package com.spring.learning.dependency.injection.scope;

import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
//@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {
    public JDBCConnection() {
        System.out.println("inside jdbcconeection");
    }
}
