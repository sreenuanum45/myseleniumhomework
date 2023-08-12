package mypraticework;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookie_5 {
    RemoteWebDriver driver;
    CookiesUtility cu;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }
    @Test
    public void AmazonTest(){
        cu=new CookiesUtility();

        System.out.println(cu.getCookiesCount(driver));
        System.out.println(cu.getCookiesList(driver));
        List<String> types= cu.getTypeofCookies(driver,"https://www.amazon.in","https://www.amazon.com");
        for( String type:types){
            System.out.println(type);
        }
    }
    @AfterTest
    public void teardown(){
        driver.close();
    }
}
