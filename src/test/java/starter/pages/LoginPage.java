package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class LoginPage extends UIInteractionSteps
{

    static By click_adfs = By.xpath("//span[text()='Login with ADFS']");
    static By enter_email = By.id("userNameInput");
    static By enter_pass = By.id("passwordInput");
    static By clk_submit = By.id("submitButton");
    static By clkon_profile=By.xpath("(//button[@type='button'])[3]");
    static By clkon_logout=By.xpath("//li[contains(text(),'Logout')]");




    @Step
    public void verify_title(String title)
    {
        getDriver().getTitle().contains(title);
        System.out.println("Hello");
    }
    

    @Step
    public void verify_notlogin()
    {
        WebElementFacade elememt = $(LoginPage.click_adfs);
        if (elememt.isCurrentlyVisible())
        {
            System.out.println("Failed the test");
        }
        else
        {
            System.out.println("Passes the Test");
        }
    }
}
