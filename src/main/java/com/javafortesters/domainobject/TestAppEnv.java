package main.java.com.javafortesters.domainobject;

/**
 * Created by jts on 10/16/2014.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3" ;
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://"+DOMAIN +":"+ PORT;
    }
}
