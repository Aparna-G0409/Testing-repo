package step_definition_files;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
    WebDriver driver;
    @Given("Launch Chrome")
    public void Launch_Chrome(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @When("Navigate to Google")
    public void Navigate_to_Google() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }
}
