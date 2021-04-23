package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.pages.CommonPage;
import utils.ReadProperty;
import utils.ServerConfig;

import java.io.IOException;

public class CommonSteps extends PageObject
{

    EnvironmentVariables environmentVariables;
    public static String folder="";
    
    ServerConfig serverConfig;



    @Steps
    CommonPage commonpage;


    @Managed()
    WebDriver driver;

    @Given("Launch Url Application {string}")
    public void launchUrlApplication(String arg0) throws IOException
    {
         folder =  EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
        String file = ReadProperty.readEnviornment(folder);


        String url = ReadProperty.readEnviornmentProperty(file,arg0);

        getDriver().get(url);
    }

    @Then("User click on {string} with value {string}")
    public void user_click_on_with_value(String locatorType, String locatorValue) throws Exception
    {
        waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
        $(CommonSteps.getBy(locatorType, locatorValue)).click();

    }


    @Then("User Click on {string}")
    public void user_Click_on(String string) throws IOException {
        String locatorType = getLocatorfromORPropertyFile(string).split("~")[0];
        String locatorValue = getLocatorfromORPropertyFile(string).split("~")[1];
        waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
        $(CommonSteps.getBy(locatorType, locatorValue)).click();
    }

    @Then("User Enter text {string} in {string} field")
    public void user_Enter_text_in(String string, String string2) throws IOException {
        String locatorType = getLocatorfromORPropertyFile(string2).split("~")[0];
        String locatorValue = getLocatorfromORPropertyFile(string2).split("~")[1];
        waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
        folder =  EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
        String file = ReadProperty.readEnviornment(folder);

        String email = ReadProperty.readEnviornmentProperty(file,string);

        $(CommonSteps.getBy(locatorType, locatorValue)).type(email);
    }

    @Then("User wait for {string} seconds")
    public void user_wait_for_seconds(String string) throws InterruptedException {
        int seconds = Integer.parseInt(string)*1000;
        Thread.sleep(seconds);
    }

    @When("User click on button {string}")
    public void user_click_on_button(String string) throws IOException {
        String locator = "//*[text()='"+string+"']|//button[text()='"+string+"']";
        WebElementFacade button = $(CommonSteps.getBy("xpath", locator ));
        button.waitUntilClickable();
        button.click();
    }

    @When("User click on link {string}")
    public void user_click_on_link(String string) throws IOException {
        String locator = "//a[text()='"+string+"']|//a[contains(text(),'"+string+"')]";
        WebElementFacade button = $(CommonSteps.getBy("xpath", locator ));
        button.waitUntilClickable();
        button.click();
    }

    @Then("User enter credentials from excel row {string}")
    public void user_enter_credentials_from_excel_row(String string) throws IOException {
//    	System.out.println(TestURL);
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
        return ReadProperty.getProperty(propertyName);
    }



}
