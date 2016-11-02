package com.javafortesters.chap007basicsofjavarevisited.examples;

/**
 * Created by julko on 11/2/16.
 */
public class ClassExample {
    private String name;

    public ClassExample(String name){
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
