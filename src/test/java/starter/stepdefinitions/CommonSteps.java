package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.pages.CommonPage;
import utils.ReadProperty;
import utils.ServerConfig;

import java.io.IOException;
import java.util.Random;

public class CommonSteps extends PageObject
{


    EnvironmentVariables environmentVariables;
    public static String folder="";
    
    ServerConfig serverConfig;
    int random_number;
    String random_alphaNumeric;
    String random_email;
    String random_character;


    @Steps
    CommonPage commonpage;


    @Managed()
    WebDriver driver;

    @Given("Launch Url Application {string}")
    public void launchUrlApplication(String arg0) throws IOException
    {

            folder = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
            String file = ReadProperty.readEnviornment(folder);

            String url = ReadProperty.readEnviornmentProperty(file, arg0);

            getDriver().get(url);


    }

    @Then("User click on {string} with value {string}")
    public void user_click_on_with_value(String locatorType, String locatorValue) throws Exception
    {
        waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
        $(CommonSteps.getBy(locatorType, locatorValue)).click();

    }


//    @Then("User Click on {string}")
//    public void user_Click_on(String string) throws IOException {
//        String locatorType = getLocatorfromORPropertyFile(string).split("~")[0];
//        String locatorValue = getLocatorfromORPropertyFile(string).split("~")[1];
//        waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
//        $(CommonSteps.getBy(locatorType, locatorValue)).click();
//    }

    @Then("User Enter text {string} in {string} field")
    public void user_Enter_text_in(String string, String string2) throws IOException
    {

        string = string.replaceAll("[$&+,:;=?@#|'<>.-^*()%!]", " ").trim();
        string2 = string2.replaceAll("[$&+,:;=?@#|'<>.-^*()%!]", " ").trim();
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
    public void user_click_on_button(String string) throws IOException
    {

        if (string.contains("$"))
        {
            string = string.replaceAll("[$&+,:;=?@#|'<>.-^*()%!]", " ").trim();



            String locatorType = getLocatorfromORPropertyFile(string).split("~")[0];
            String locatorValue = getLocatorfromORPropertyFile(string).split("~")[1];
            waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
            $(CommonSteps.getBy(locatorType, locatorValue)).click();
            }
        else {
            String locator = "//*[text()='" + string + "']|//button[text()='" + string + "']";
            WebElementFacade button = $(CommonSteps.getBy("xpath", locator));
            button.waitUntilClickable();
            button.click();
            String titile = getDriver().getTitle();
            System.out.println("The title is  " + titile);
        }
    }

    @When("User click on link {string}")
    public void user_click_on_link(String string) throws IOException
    {
        if (string.contains("$"))
        {
            string = string.replaceAll("[$&+,:;=?@#|'<>.-^*()%!]", " ").trim();



            String locatorType = getLocatorfromORPropertyFile(string).split("~")[0];
            String locatorValue = getLocatorfromORPropertyFile(string).split("~")[1];
            waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
            $(CommonSteps.getBy(locatorType, locatorValue)).click();
        }
        else {
            String locator = "//a[text()='" + string + "']|//a[contains(text(),'" + string + "')]";
            WebElementFacade button = $(CommonSteps.getBy("xpath", locator));
            button.waitUntilClickable();
            button.click();
        }
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
        folder =  EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
        String file = ReadProperty.readEnviornment(folder);
        String pro = ReadProperty.readEnviornmentProperty(file, propertyName);

        return pro;
    }


    @Then("User verify {string} this {string}")
    public void userVerifyThis(String arg0, String arg1) throws IOException {

        switch (arg0.toLowerCase())
        {
            case "title":
                String expectedTitle = getDriver().getTitle();
                folder =  EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
                String file = ReadProperty.readEnviornment(folder);

                String  actualTitle = ReadProperty.readEnviornmentProperty(file,arg1);

                Assert.assertEquals(expectedTitle,actualTitle);
                break;

            case "link":
                String locator = "//*[text()='"+arg1+"']|//a[contains(text(),'"+arg1+"')]";
                WebElementFacade button = $(CommonSteps.getBy("xpath", locator ));
                button.waitUntilClickable();
                Boolean enable =button.isClickable();
                Assert.assertTrue(enable);
                break;

            case "text":
                String locatorType = getLocatorfromORPropertyFile(arg1).split("~")[0];
                String locatorValue = getLocatorfromORPropertyFile(arg1).split("~")[1];
                waitForpresenceOfElementLocated(getBy(locatorType, locatorValue));
                boolean visible = $(CommonSteps.getBy(locatorType, locatorValue)).isDisplayed();
                Assert.assertTrue(visible);
                break;

            default:
                System.out.println("No match Found");
                break;


        }


    }

    @And("User reload the page")
    public void userReloadThePage()
    {
        getDriver().navigate().refresh();
    }

    @When("generate random {string} with size {string} to variable {string}")
    public void generateRandomWithSizeToVariable(String arg0, String arg1, String arg2)
    {

        switch (arg0.toLowerCase())
        {
            
            case "number":
                
                int m = (int) Math.pow(10, Integer.parseInt(arg1) - 1);
                int numb = m + new Random().nextInt(9 * m);
                random_number=numb;
                System.out.println("Random number is "+ random_number);
                break;


            case "alphanumeric":
                String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "0123456789"
                        + "abcdefghijklmnopqrstuvxyz";
                StringBuilder sb = new StringBuilder(Integer.parseInt(arg1));
                for (int i = 0; i < Integer.parseInt(arg1); i++)
                {

                    int index = (int)(AlphaNumericString.length() * Math.random());

                    sb.append(AlphaNumericString.charAt(index));
                }
                 arg2=sb.toString();
                 random_alphaNumeric=arg2;
                System.out.println("Random alphanumeric is "+ random_alphaNumeric);
                break;

            case "email":
                String possibleEmailString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "0123456789"
                        + "abcdefghijklmnopqrstuvxyz";
                StringBuilder sc = new StringBuilder(Integer.parseInt(arg1));
                for (int i = 0; i < Integer.parseInt(arg1); i++)
                {

                    int index = (int)(possibleEmailString.length() * Math.random());

                    sc.append(possibleEmailString.charAt(index));
                }
                arg2=sc.toString();
                random_email = arg2+"@gmail.com";
                System.out.println("The email is " + random_email);
                break;

            case "characters":
                String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "abcdefghijklmnopqrstuvxyz";
                StringBuilder ch = new StringBuilder(Integer.parseInt(arg1));
                for (int i = 0; i < Integer.parseInt(arg1); i++)
                {

                    int index = (int)(characters.length() * Math.random());

                    ch.append(characters.charAt(index));
                }
                arg2=ch.toString();
                random_character=arg2;
                System.out.println("Random characters is "+ random_character);
                break;


            default:
                System.out.println("No input found");

        }


    }
}
