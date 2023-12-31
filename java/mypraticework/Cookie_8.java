package mypraticework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookie_8 {
    RemoteWebDriver driver;
    @BeforeTest
    public void Setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.fastmail.com/");

    }
    @Test(priority = 1)
    public  void method1() throws InterruptedException {


        driver.findElement(By.xpath("//strong[text()='Log in']/parent::a")).click();
        Thread.sleep(10000);
        WebElement e=driver.findElement(By.name("username"));
        e.sendKeys("sreenuanumandla@fastmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("Veeru80@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 2)
    public  void method2(){
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String>GWH =driver.getWindowHandles();
        List<String>ls=new ArrayList<>(GWH);
        driver.switchTo().window(ls.get(1));
        driver.get("https://www.fastmail.com/");
        try{
            if(driver.findElement(By.xpath("//div[text()='Settings']")).isDisplayed()){
                System.out.print("Login Session cookie is working correctly");
            }
            else{
                System.out.print("Login Session cookie is not working correctly");
            }
        }catch (Exception e){
       System.out.println(e.getMessage());
        }

    }
    @Test(priority = 3)
    public  void method3(){
        driver.close();
    }

}
