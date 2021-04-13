package starter.stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.browserstack.local.Local;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import net.serenitybdd.core.pages.PageObject;

import utils.ReadProperty;

public class CommonPageStepDefinitions extends PageObject{
	
	private static String test = null;






	@Given("Launch Url {string}")
	public void launchUrl(String arg0)
	{
		getDriver().get(arg0);
	}
	
    @Then("User click on {string} with value {string}")
    public void user_click_on_with_value(String locatorType, String locatorValue) throws Exception
    {
    	waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
    	$(CommonPageStepDefinitions.getBy(locatorType, locatorValue)).click();
    }
    
   
    @Then("User Click on {string}")
    public void user_Click_on(String string) throws IOException {
		String locatorType = getLocatorfromORPropertyFile(string).split("~")[0];
		String locatorValue = getLocatorfromORPropertyFile(string).split("~")[1];
    	waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
    	$(CommonPageStepDefinitions.getBy(locatorType, locatorValue)).click();
    }

    @Then("User Enter text {string} in {string} field")
    public void user_Enter_text_in(String string, String string2) throws IOException {
		String locatorType = getLocatorfromORPropertyFile(string2).split("~")[0];
		String locatorValue = getLocatorfromORPropertyFile(string2).split("~")[1];
    	waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
    	$(CommonPageStepDefinitions.getBy(locatorType, locatorValue)).type(string);
    }
    
    @Then("User enter credentials from excel row {string}")
    public void user_enter_credentials_from_excel_row(String string) throws IOException
	{
    	System.out.println(test);
    }
    
    public static By getBy(String locatorType, String locatorValue) throws IOException 
    {
		By by = null;
		try {
			switch (locatorType.toLowerCase()) 
			{
				case "xpath":					
					by = By.xpath(locatorValue);
					break;
				case "id":				
					by = By.id(locatorValue);
					break;	
				case "name":				
					by = By.name(locatorValue);
					break;
				case "css":				
					by = By.cssSelector(locatorValue);
					break;
				case "classname":				
					by = By.className(locatorValue);
					break;
				case "linktext":				
					by = By.linkText(locatorValue);
					break;
				case "tagname":				
					by = By.tagName(locatorValue);
					break;
				default:		
					System.out.println("Invalid locator type");
					break;
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Error in GetBy method");
			e.printStackTrace();
		}
		return by;
	}
    
	public void waitForpresenceOfElementLocated(By by) {
	    waitForCondition().until(
	            ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public String getLocatorfromORPropertyFile(String propertyName) throws IOException
	{
		return ReadProperty.get(propertyName);
	}





}
