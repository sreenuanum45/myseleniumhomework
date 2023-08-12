package mypraticework;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_Window_1 {
    RemoteWebDriver driver;
    @BeforeTest
    public void setup1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
            public void amazonTest() throws AWTException {
        driver.get("https://www.amazon.in");
        driver.manage().window().fullscreen();
         driver.manage().window().maximize();
         driver.manage().window().minimize();
        int h =driver.manage().window().getSize().getHeight();
        int w=driver.manage().window().getSize().getWidth();
        System.out.println("browser size:"+h+"  "+w);
        Dimension dim=new Dimension(800,300);
        //set the browser size
        driver.manage().window().setSize(dim);
       int x =driver.manage().window().getPosition().getX();
        int y=driver.manage().window().getPosition().getY();
        System.out.println("Relocate browser on Desktop:"+x+"  "+y);
        Point p=new Point(100,200);
        driver.manage().window().setPosition(p);
        System.out.println("browser on Desktop:"+x+"  "+y);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {


        }
        //Back to normal(core Java)
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);

    }
}
