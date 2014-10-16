package test.com.javafortesters.testwithotherclasses;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by jts on 10/16/2014.
 */
public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4",4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5",5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6",6, six.intValue());
    }

    /*Write a test which uses toHexString and asserts:
    • that 11 becomes b
    • that 10 becomes a
    • that 3 becomes 3
    • that 21 becomes 15*/

    @Test
    public void integerStaticMethodsExploration(){
        assertEquals("11=b", "b", Integer.toHexString(11));
        assertEquals("10=a", "a", Integer.toHexString(10));
        assertEquals("3=3","3", Integer.toHexString(3));
        assertEquals("21=15", "15", Integer.toHexString(21));
    }

        /*Write a test that asserts that:
    • Integer.MIN_VALUE equals -2147483648 and that
    • Integer.MAX_VALUE equals 2147483647.*/

    @Test
    public void integerMaxMinValues(){
        assertEquals("Min value = -2147483648", Integer.MIN_VALUE, -2147483648);
        assertEquals("Max value = 2147483648", Integer.MAX_VALUE, 2147483647);
    }
}
