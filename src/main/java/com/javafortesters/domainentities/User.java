package main.java.com.javafortesters.domainentities;

/**
 * Created by jts on 10/18/2014.
 */
public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(){
        this("username", "password");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
