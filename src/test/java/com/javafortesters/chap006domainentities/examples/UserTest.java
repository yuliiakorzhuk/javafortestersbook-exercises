package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julko on 11/1/16.
 */
public class UserTest {
    @Test
    public void canConstructnewUser(){
        User user = new User();
    }
    @Test
    public void userHasDefaultsNameAndPassword(){
        User user = new User();

        assertEquals("default user name expected", "username", user.getName());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pa55w0rD");

        assertEquals("custom user name expected", "admin", user.getName());
        assertEquals("custom password expected", "pa55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("paZZword");

        assertEquals("custom password expected", "paZZword", user.getPassword());
    }
}
