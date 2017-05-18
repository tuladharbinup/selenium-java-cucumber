package com.binupjewelry.test.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;
/**
 * Created by Binup on 5/15/2017.
 */

@CucumberOptions(features = {"src/test/com/binupjewelry/test/features/"},
        glue = {"com/binupjewelry/test/steps"}, plugin = {"pretty", "html:target/cucumber-html-report" })
public class TestRunnerCustomized {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")
    public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper) {

        /**uncoment this to run just specific scenario
         List<CucumberTagStatement> elements = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();

         for (Iterator<CucumberTagStatement> element = elements.iterator(); element.hasNext(); ) {
         //Pass the hardcoded scenario name

         CucumberTagStatement scenarioName = element.next();
         if (!scenarioName.getVisualName().equals("Scenario: Create Employee with all details")) {
         element.remove();
         }
         } **/

        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        testNGCucumberRunner.finish();
    }


}
