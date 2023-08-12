package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_SendKeys_3 {
    RemoteWebDriver driver;
    @BeforeTest
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }
    @Test
    public void method1() throws InterruptedException {
        driver.get("https://www.gmail.com");
        //element present in pagesource not in page  we get Element intercatable Exception
        driver.findElement(By.name("hiddenPassword")).sendKeys("abdulkalam");
    }

    }
