package casestudy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs11 {
	WebDriver driver=null;

	@Given("^The registraion page opened$")
	public void the_registraion_page_opened(){
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("^user will enter username \"([^\"]*)\"$")
	public void user_will_enter_username(String arg1){
	   driver.findElement(By.id("userName")).sendKeys(arg1);
	}

	@When("^user enter firstname \"([^\"]*)\"$")
	public void user_enter_firstname(String arg1){
	   driver.findElement(By.id("firstName")).sendKeys(arg1);
	}

	@When("^user enter lastname \"([^\"]*)\"$")
	public void user_enter_lastname(String arg1){
	    driver.findElement(By.id("lastName")).sendKeys(arg1);
	}

	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String arg1){
	   driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@When("^user enter  confirm \"([^\"]*)\"$")
	public void user_enter_confirm(String arg1){
	    driver.findElement(By.id("pass_confirmation")).sendKeys(arg1);
	    driver.findElement(By.xpath("//input[@value='Male']")).click();
	    driver.findElement(By.id("emailAddress")).sendKeys("name@gmail.com");
	    driver.findElement(By.id("mobileNumber")).sendKeys("9988776600");
	    driver.findElement(By.name("dob")).sendKeys("11/11/1997");
	    driver.findElement(By.id("address")).sendKeys("Bangalore, Bangalore");
	    Select sl=new Select(driver.findElement(By.id("securityQuestion")));
	    sl.selectByIndex(0);
	    driver.findElement(By.id("answer")).sendKeys("Bangalore");
	}

	@Then("^user press register button$")
	public void user_press_register_button(){
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

}
