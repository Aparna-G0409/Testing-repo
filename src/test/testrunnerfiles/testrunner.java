package testrunnerfiles;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\LENOVO\\IdeaProjects\\proMav1\\src\\main\\java\\feature_files\\sample1.feature",
        glue = {"src\\main\\java\\step_definition_files\\sample1.java"},
        monochrome=true
//        plugin={"pretty","html:test\\target\\htmlreport.html"}

)

public class testrunner {
}
