package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julko on 9/20/16.
 */
public class IntegerExamplesTest {
    @Test
    public void integerExploration_IntValueFromInt (){
        Integer four = new Integer(4);

        assertEquals("intValue returns int 4 ", 4, four.intValue());
    }

    @Test
    public void integerExploration_IntValueFromString(){
        Integer five = new Integer("5");

        assertEquals("intValue returns int 5 ", 5, five.intValue());
    }
    @Test
    public void integerExploration_Autounboxing(){
        Integer six = 6;

        assertEquals("autounboxing assignment for 6 ", 6, six.intValue());
    }

    /**
     * Exercise: Convert an int to Hex:
      that 11 becomes b
      that 10 becomes a
      that 3 becomes 3
      that 21 becomes 15
     */
    @Test
    public void int11ToHexCovertation(){
        Integer value = 11;

        assertEquals("11 to Hex string becomes 'b' ", "b", Integer.toHexString(value));
    }

    @Test
    public void int10ToHexCovertation(){
        Integer value = 10;

        assertEquals("10 to Hex string becomes 'a' ", "a", Integer.toHexString(value));
    }

    @Test
    public void int3ToHexCovertation(){
        Integer value = 3;

        assertEquals("3 to Hex string becomes '3' ", "3", Integer.toHexString(value));
    }
    @Test

    public void int21ToHexCovertation(){
        Integer value = 21;

        assertEquals("21 to Hex string becomes '15' ", "15", Integer.toHexString(value));
    }

    /* Exercise: Confirm MAX and MIN Integer sizes:
    * Integer.MIN_VALUE equals -2147483648
    * Integer.MAX_VALUE equals 2147483647
    * */

    @Test
    public void intMinValueIsCorrect(){
        Integer min = Integer.MIN_VALUE;

        assertEquals("Min integer value is equals -2147483648", -2147483648, min.intValue());
    }
    @Test
    public void intMaxValueIsCorrect(){
        Integer max = Integer.MAX_VALUE;

        assertEquals("Max integer value is equals 2147483647", 2147483647, max.intValue());
    }
}
