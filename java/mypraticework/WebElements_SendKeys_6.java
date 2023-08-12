package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_SendKeys_6 {
    RemoteWebDriver driver;

    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();

    }
    @Test
    public void method1() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.findElement(By.name("identifier")).sendKeys("anumandlasreenu");
        Thread.sleep(1000);
        driver.findElement(By.name("identifier")).clear();


}
}
