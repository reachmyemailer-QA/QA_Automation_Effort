package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( 

        features = {
                "src/test/resources/Features/Login.feature",
               
        },

        glue = { "PageStepDefination" },

        
        //tags = "@positive and @smoke",
        
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },

        monochrome = true,
        publish = false

)

public class Runner_Test1 {

}