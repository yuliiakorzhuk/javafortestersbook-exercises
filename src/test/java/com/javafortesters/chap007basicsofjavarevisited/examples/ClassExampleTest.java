package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julko on 11/2/16.
 */
public class ClassExampleTest {
    @Test
    public void classExampleNameSetCorrectly(){
        ClassExample classExample = new ClassExample("lala");

        assertEquals("Name is set correctly" ,"lala", classExample.getName());
    }
}
