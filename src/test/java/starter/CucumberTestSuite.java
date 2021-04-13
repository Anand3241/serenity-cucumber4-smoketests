package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        		plugin = {"pretty"},
                strict = true,
                monochrome=true,
                glue = {"starter"},
                features = "src/test/resources/features/search"

)
public class CucumberTestSuite{}
