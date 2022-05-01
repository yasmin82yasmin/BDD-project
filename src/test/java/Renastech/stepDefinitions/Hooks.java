package Renastech.stepDefinitions;

import Renastech.utils.BrowserUtils;
import Renastech.utils.ConfigurationReader;
import Renastech.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserUtils {
    @Before
    public void setup() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperties("url"));

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[]data=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png", scenario.getName());
        }
    }
}

