package parallel;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        strict = true,
        monochrome=true,
        glue = {"src.test.java"},
        features = "src/test/resources/parallel"

)
public class RunCucumberIT {}
