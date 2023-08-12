package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_Click_1 {
    //element in disiable
    RemoteWebDriver driver;
    @BeforeTest
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }
    @Test
    public void method1(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
        driver.switchTo().frame("iframeResult");
        WebElement ee=driver.findElement(By.id("lname"));
        ee.click();
    }
}
