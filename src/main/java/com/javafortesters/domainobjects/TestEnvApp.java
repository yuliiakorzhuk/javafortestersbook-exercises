package com.javafortesters.domainobjects;

/**
 * Created by julko on 11/1/16.
 */
public class TestEnvApp {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://"+DOMAIN+":"+PORT;
    }
}
