package prac1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class code2_testng {

    WebDriver driver;

    @BeforeTest
    public void beforetest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void method1(){
        System.out.println("Hii method1");
        driver.get("https://www.amazon.in/");
    }
    @Test
    public void method2(){
        System.out.println("Hii method2");
        driver.get("https://www.flipkart.com/");
    }
    @AfterTest
    public void aftertest(){
        driver.quit();
    }
}
