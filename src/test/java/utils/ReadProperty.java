package utils;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty extends PageObject
{
	EnvironmentVariables environmentVariables;
	//Return single property
	public static String getGlobalProperty(String PropertyName) throws IOException
	{
	   Properties Pro = new Properties();
	   FileInputStream fis = new FileInputStream(new File("src\\test\\resources\\DataFiles\\Global.properties"));
	   Pro.load(fis);
	   PropertyName = Pro.getProperty(PropertyName);
	   return PropertyName;
	}
	
	public static String getProperty(String propertyName) throws FileNotFoundException, IOException {
		Properties Pro = new Properties();
		   FileInputStream fis = new FileInputStream(new File(getGlobalProperty("objectrepo")));
		   Pro.load(fis);
		   propertyName = Pro.getProperty(propertyName);
		   return propertyName;
               
    }

    public  static String readEnviornmentProperty(String folder,String propertyname) throws IOException
	{
		System.out.println("hello "+folder);
		Properties Pro = new Properties();
		FileInputStream fis = new FileInputStream(new File(folder));
		Pro.load(fis);
		return Pro.getProperty(propertyname);
	}
	public  static String readEnviornment(String folder) throws IOException
	{
		Properties Pro = new Properties();
		FileInputStream fis = new FileInputStream(new File(folder));
		Pro.load(fis);
		return Pro.getProperty("enviornment");
	}



}
