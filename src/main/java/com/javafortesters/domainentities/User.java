package com.javafortesters.domainentities;

/**
 * Created by julko on 11/1/16.
 */
public class User {
    private String name;
    private String password;

    public User() {
        this("username", "password");
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
