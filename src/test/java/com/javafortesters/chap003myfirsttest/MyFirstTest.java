package com.javafortesters.chap003myfirsttest;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by jts on 10/16/2014.
 */
public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
    }
    @Test
    public void canSubtractTwoFromTwo(){
        int answer = 2-2;
        assertEquals("2-2=0", 0, answer);
    }
    @Test
    public void canDivideFourOnTwo(){
        int answer = 4/2;
        assertEquals("4/2=2", 2, answer);
    }
    @Test
    public void canMultiplyTwoOnTwo(){
        int answer = 2*2;
        assertEquals("2*2=4", 4, answer);
    }
}
