import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features  = "src/test/resources/",
			glue = "steps",		
			monochrome = true,
			tags ="@run",
			plugin = {"pretty", "html:target/relatorios/htmls/report","json:target/relatorios/htmls/report/CucumberReport.json"}, 
			snippets = SnippetType.CAMELCASE,
			dryRun = false
			)
public class RunnerTest {
	
}
