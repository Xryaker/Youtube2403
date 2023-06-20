package runer;

import conf.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",//path to feature files
        glue = "steps",//package path
        tags = "@YOUTUBE",//list feature files for run
        publish = true
)
public class FirstRuner {
    @BeforeClass
    public static void starT() {
        System.setProperty("CUCUMBER_PUBLISH_TOKEN", "bab60e8c-d992-4400-a112-d1824fc47501");
        BaseClass.BeforParent();
    }

    @AfterClass
    public static void enD() throws InterruptedException {
        BaseClass.afterParent();
    }

}
