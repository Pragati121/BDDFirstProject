package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"C:\\Users\\PragatiSharma\\IdeaProjects\\FirstBddProject\\src\\test\\java\\FeatureFile\\Login.feature"},
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty","json:report/Cucumber.json"
        }

)
    public class Runner1{

    }
