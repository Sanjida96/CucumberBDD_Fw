package stepdefinations;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends Config {
    public static String envData = System.getProperty("env");
    public static String drivertype = System.getProperty("browser");
    public static String url;

    @Before
    public void openBrowser() {
        //qa=qa.talenttek.com -> lower environmetn
        //staging=stage.talenttek.com ->lower environment
        //prod=production.talenttek.com ->  public facing environment
        //setup default driver
        if (Strings.isNullOrEmpty(drivertype)){
            drivertype = "ch";
        }
        if (Strings.isNullOrEmpty(envData)){
            envData = "qa";
        }
        driver= setUpDriver(drivertype);
        switch (envData) {
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                break;

        }
        driver.get(url);
    }



    @After
    public void browserclose(Scenario scenario) {
        try{
        if (scenario.isFailed()) {
            /* Take a screenshot... */
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); // ... and embed it in the report.
        }
        } finally {
           // driver.quit();
        }
    }
  }






