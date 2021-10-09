package com.spring.learning.dependency.injection.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
    @Autowired
    JDBCConnection connection;

    public JDBCConnection getConnection() {
        return connection;
    }

    public void setConnection(JDBCConnection connection) {
        this.connection = connection;
    }
}

