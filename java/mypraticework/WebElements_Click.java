package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_Click {
    //element in page source not in page
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
        driver.get("https://www.gmail.com");
        WebElement ee=driver.findElement(By.xpath("//input[@type='password']"));
        ee.click();
    }
}

