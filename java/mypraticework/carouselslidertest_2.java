package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class carouselslidertest_2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*driver.get("https://www.shopclues.com/");
		WebElement slider = driver.findElement(By.xpath("((//div[@class='slick-track'])[1])"));*/
		driver.get("https://www.amazon.in");
		WebElement slider = driver.findElement(By.xpath("//ol[@class='a-carousel']"));
		CarouselSliderUtility obj = new CarouselSliderUtility();
		System.out.println(obj.getCountOfSlider(slider));
		System.out.println(obj.getTypeOfSlider(slider));
		if (obj.AreSliderMovingAutomaticallyInSlider(slider)) {
			System.out.println(obj.getMovingDirectionOfSlider(slider));
			System.out.println(obj.getSliderMoveDuration(slider));
		} else {
			System.out.println("slider are not moving");
		}

		System.out.println(obj.getslideMovingStyle(slider));
		System.out.println(obj.getDelayBetweenSlidesMove(slider));

	}

}
