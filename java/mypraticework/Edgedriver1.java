package mypraticework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgedriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().create();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");

	}

}
