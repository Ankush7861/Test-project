package thinkBridge.testcases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;

import pageObject.JaBaTalksLogin;

public class LoginTest_TestNG {

	static WebDriver driver =null;
	
    @BeforeTest
	public void SetUpTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
    @Test
	public void LoginTest()

	{
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		//goto test url
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");

		//maximize the browser
		driver.manage().window().maximize();

		//click English dropdown
		JaBaTalksLogin.English(driver).click();

		//click Dutch dropdown(when you need to check dutch dropdown validatin comment english one
		//JaBaTalksLogin.Dutch(driver).click();

		//Entering Name in name text area
		JaBaTalksLogin.Name(driver).sendKeys("aptest");

		//Entering OrgName in Org-name text area
		JaBaTalksLogin.OrgName(driver).sendKeys("Aporg");

		//Entering email in name mail text area
		JaBaTalksLogin.Email(driver).sendKeys("aptest@gmail.com");

		//clicking agreement checkbox
		JaBaTalksLogin.Agree(driver).click();

		//clicking GetStarted button 
		JaBaTalksLogin.GetStarted(driver).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t = " A welcome email has been sent. Please check your email.";

		// identify elements with text()
		//List<WebElement> l= (List<WebElement>) JaBaTalksLogin.Welcome(driver);
		List<WebElement> l= driver.findElements(By.xpath("//span[contains(text(),'A welcome email has been sent. Please check your e')]"));
		// verify list size
		if ( l.size() > 0)
		{
			System.out.println("Text: " + t + " is present. ");
		} else {
			System.out.println("Text: " + t + " is not present. ");
		}
	}
    
    @AfterTest
	public void tearDownTest() {
		//driver.close();
		driver.quit();
		System.out.println("Test completed");
	}


}





