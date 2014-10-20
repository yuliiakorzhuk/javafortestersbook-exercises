package test.com.javafortesters.domainentities;

import main.java.com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jts on 10/18/2014.
 */
public class UserTest {
   @Test
    public void userHasDefaultUserNameAndPassword(){
       User user = new User("Admin", "pA55w0rD");
       assertEquals("given username expected", "Admin", user.getUsername());
       assertEquals("given password expected", "pA55w0rD", user.getPassword());
   }
    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("setter password exepected", "PaZZwor6", user.getPassword());
    }
}
