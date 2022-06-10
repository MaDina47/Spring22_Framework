import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path to the feature files
        features = {"src/test/resources"},

        // specify the path of step defenition files
        glue = {"src/test/java/StepDefinition", "Web"},

        // tag to be executed
        tags = "@sanity"
)

public class TestRunner {
}
