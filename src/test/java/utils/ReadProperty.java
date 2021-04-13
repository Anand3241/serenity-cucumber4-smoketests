package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty 
{
	//Return single property
	public static String get(String PropertyName) throws IOException
	{
	   Properties Pro = new Properties();
	   FileInputStream fis = new FileInputStream(new File("src\\test\\resources\\DataFiles\\ObjectRepository.properties"));
	   Pro.load(fis);
	   PropertyName = Pro.getProperty(PropertyName);
	   return PropertyName;
	}

}
