package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/registro.feature"}
        , glue = {"stepDefinition"}
        , tags = "@Registro_exitoso"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class TestRunnerRegistroPage {

}
