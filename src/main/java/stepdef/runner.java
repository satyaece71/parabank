package stepdef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "Features"
            ,glue={"stepdef"}
            ,tags = "@para1"
    )

    public class runner {
}
