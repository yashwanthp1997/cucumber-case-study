package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class cs3 {
	WebDriver driver=null;

	@Given("^user logs in$")
	public void user_logs_in(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		   driver.findElement(By.id("userName")).sendKeys("Lalitha");
		   driver.findElement(By.id("password")).sendKeys("Password123");
		   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("^user searches Head in search bar$")
	public void user_searches_in_search_bar(){
	    WebElement search=driver.findElement(By.xpath("//input[@name='products']"));
	    Actions act1=new Actions(driver);
	    act1.sendKeys(search,"bag").perform();
	    act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
