package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_Clear {
    RemoteWebDriver driver;

    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }

    @Test
    public void method1() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(5000);
        //"ElementNotInteractableException" due to clear a hidden element
        driver.findElement(By.name("hiddenPassword")).clear();
    }
}
