package utils;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:qa.properties"})
public interface ServerConfig extends Config

{
    @Key("TestURL")
    String getURl();

    @Key("username")
    String getUsername();

    @Key("password")
    String getPassword();
}
