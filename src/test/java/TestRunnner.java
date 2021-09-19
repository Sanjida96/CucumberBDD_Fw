import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/feature"} ,
        glue = "stepdefinations",
        plugin = {
                "json:target/cucumber.json"
}
)

public class TestRunnner extends AbstractTestNGCucumberTests{
}
