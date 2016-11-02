package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by julko on 11/2/16.
 */
public class ifElseTestClass {
    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }

        assertTrue("Should starts with http", url.startsWith("http"));
        assertEquals("Url should match", "http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void ifTrueIsTrue(){
        boolean truthy = true;

        if(truthy) assertTrue(truthy);
    }

    @Test
    public void ifTrueIsTrueItsNotFalse(){
        boolean truthy = true;

        if(truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }
}
