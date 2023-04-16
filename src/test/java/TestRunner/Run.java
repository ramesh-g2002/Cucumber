package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import StepDefination.StepDef;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Featutes/Loginpage.feature",
glue = "StepDefination",
//dryRun=true,
monochrome= true,
plugin = {"pretty","html:target/CucumberHtmlRep.html"})
public class Run {
	

}
