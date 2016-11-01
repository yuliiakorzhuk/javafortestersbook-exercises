package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobjects.TestEnvApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julko on 11/1/16.
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL",  "http://192.123.0.3:67", TestEnvApp.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain",  "192.123.0.3", TestEnvApp.DOMAIN);

        assertEquals("Just the Port",  "67", TestEnvApp.PORT);
    }


}
