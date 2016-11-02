package com.javafortesters.chap008selectionsanddecisions.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by julko on 11/2/16.
 */
public class TernaryTestClass {
    @Test
    public void moreTernary(){
        String url = "http://www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void catOrCats(){
        Integer numberOfCats = 3;

        assertEquals("Should return cats", "cats", catOrCats(numberOfCats));
    }

    private String catOrCats(Integer numberOfCats) {
        return numberOfCats == 1 ? "cat" : "cats";
    }

}
