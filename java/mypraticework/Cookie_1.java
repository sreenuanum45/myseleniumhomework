package mypraticework;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookie_1 {
    RemoteWebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public  void  amazonCookiesTest(){
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        CookiesUtility cu=new CookiesUtility();

        System.out.println(cu.getCookiesCount(driver));
     // System.out.println(cu.getCookiesList(driver));
        List <String> cookies=cu.getCookiesList(driver);
        for(String c:cookies){

        System.out.println(c);
        }
        //get cookies type
        System.out.println("@=============*");
        List <String> cookiesTypes= cu.getTypeofCookies(driver,"https://www.amazon.in","https://www.amazon.com");
        for(String c:cookiesTypes){

            System.out.println(c);
        }
    }
    @AfterTest
    public void teardown(){
        driver.close();
    }
}
