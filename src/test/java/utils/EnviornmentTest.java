package utils;


import org.aeonbits.owner.ConfigFactory;
import org.junit.Before;
import org.junit.Test;

public class EnviornmentTest
{
    private ServerConfig serverConfig;


    @Test
    public void functionalTest()
    {

        System.out.println(serverConfig.getURl());
        System.out.println(serverConfig.getUsername());
        System.out.println(serverConfig.getPassword());
    }

    @Before
    public void beforeTest()
    {
       serverConfig= ConfigFactory.create(ServerConfig.class);

    }
}
