package casestudy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs2 {
	WebDriver driver=null;

	@Given("^user click on sign in$")
	public void user_click_on_sign_in(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}

	@When("^user enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1){
	   driver.findElement(By.id("userName")).sendKeys(arg1);
	}

	@When("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1){
	    driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@Then("^user click login button$")
	public void user_click_login_button(){
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}