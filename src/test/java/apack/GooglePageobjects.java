package apack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePageobjects {
	WebDriver driver= new FirefoxDriver();{
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.id("lst-ib"));
	}
	

}
