import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import abbaci;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",plugin={"json:reports/example-report.json"}
)
public class ExampleTest {

}
