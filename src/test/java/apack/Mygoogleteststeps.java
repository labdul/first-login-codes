package apack;

//import cucumber.api.java.en.And;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mygoogleteststeps {
	private static final Logger LOGGER =Logger.getLogger(Mygoogleteststeps.class.getName());

	WebDriver driver = new FirefoxDriver();
	
	

	@Given("^I am in Google site$")
		public void i_am_in_Google_site() throws Throwable{
		
		driver.get("https://www.google.co.uk/");
		
		LOGGER.info("Entering: I am on the search site");
		//throw new PendingException();
	}
	
	@When ("I enter a my name")
	public void entername(){
	
		driver.findElement(By.id("lst-ib")).sendKeys("Appium");
		LOGGER.info("Entering: Element is located");
	}
	
	
	@When ("click on Search button")
	public void clickbutton() throws InterruptedException{
		driver.findElement(By.cssSelector(".lsb")).click();
		Thread.sleep(4000L);
		LOGGER.info("Entering: Search button is located");
		
	}
	
	@Then ("I am redirected to the search page")
	public void redirectiontopage(){
		if (driver.findElement(By.cssSelector(".hdtb-mitem.hdtb-msel.hdtb-imb")).isDisplayed()){
			LOGGER.info("Entering: Web is displayed");
		}
		else
		{
			LOGGER.info("Entering: Web is not displayed");
		}
		
		
	}
}
