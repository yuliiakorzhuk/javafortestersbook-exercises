package test.com.javafortesters.testwithownclasses.domainobject;


import main.java.com.javafortesters.domainobject.TestAppEnv;
import static org.junit.Assert.*;
import org.junit.Test;

//test comment
/**
 * Created by jts on 10/16/2014.
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Hard coded URL ", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain","192.123.0.3",TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);
    }
}
