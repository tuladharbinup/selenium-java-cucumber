package com.binupjewelry.test.steps;

import com.binupjewelry.framework.base.DriverContext;
import com.binupjewelry.framework.config.ConfigReader;
import com.binupjewelry.framework.config.Settings;
import com.binupjewelry.framework.utilities.HelperUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by Binup on 5/15/2017.
 */

//Cucumber Scenario Hooks can be used in 2 ways: @Before and @After
public class CucumberHooks {

    /**
     * //@Before hook will run before each scenario but in this case we tagged it with @web so that it runs only before Scenario with tag @web.
     * Remove this tag if you want to launch new browser driver for each scenario.
     */
    @Before("@web")
    public void initializeCucumberTest() {
        System.out.println("Beginning Cucumber Test initialization.....");
        ConfigReader.PopulateSettings();
        System.setProperty("webdriver.gecko.driver", Settings.geekoDriverPath);
        DriverContext.driver = new FirefoxDriver();
        System.out.println("Cucumber Test Scenario initialization Completed");

        /**Unfortunately, cucumber doesn’t support global hooks at the moment, so closing the browser a bit trickier.It is
         * possible to solve this situation, with the following hack.
         */
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                if (DriverContext.driver !=null)
                DriverContext.driver.quit();
            }
        });


    }

    @After  //this will run after each scenario
    public void tearDownCucumberTest(Scenario scenario) {
        System.out.println("Cucumber Test Scenario Completed");
        //if scenario is failed, screenshot is embedded in the html cucumber report as well as saved in local drive.
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)DriverContext.driver).getScreenshotAs(OutputType.BYTES), "image/png");
            HelperUtil.grabScreenShot(scenario.getName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()));
        }
        //capture screenshot for passed scenario under screenshots folder
        else  if (!scenario.isFailed()) {
            System.out.println ( "title is: "+DriverContext.driver.getTitle());
            HelperUtil.grabScreenShot(scenario.getName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()));
        }


    }

}