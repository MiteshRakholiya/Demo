package Definitions;

import java.util.concurrent.TimeUnit;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.cucumber.messages.types.Duration;

public class LoginSteps {

	WebDriver driver = null ;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("inside step:- browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath );
		System.setProperty("webdriver.gecko.driver",projectPath+"/src/test/resources/drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		//System.out.println("inside step:- User is on Login Page");
		driver.navigate().to("https://mail.google.com/");
	}
	@When("User enters username and passoword")
	public void user_enters_username_and_passoword() throws InterruptedException {
		//System.out.println("inside step:- verify Username and password");
		driver.findElement(By.id("identifierId")).sendKeys("markettimesol@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement elePassword=driver.findElement(By.name("password"));
		elePassword.sendKeys("Reptime@1");
 
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	}
	
	@Then("click on compose button")
	public void click_on_compose_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		driver.findElement(By.xpath("//textarea[@id=':6j']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("body > div:nth-child(35) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > form:nth-child(1) > div:nth-child(3) > input")).sendKeys("Demo");
		driver.findElement(By.className("Am Al editable LW-avf tS-tW")).sendKeys("Update any thing ");
		driver.findElement(By.id(":7b")).click();
	}

}
