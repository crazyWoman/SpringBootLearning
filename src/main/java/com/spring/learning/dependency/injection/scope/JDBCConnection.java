package com.spring.learning.dependency.injection.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {
    public JDBCConnection() {
        System.out.println("inside jdbcconeection");
    }
}
