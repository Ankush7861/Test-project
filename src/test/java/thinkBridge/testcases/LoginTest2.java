package thinkBridge.testcases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;

import pageObject.JaBaTalksLogin;

public class LoginTest2 {

	static WebDriver driver =null;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		driver.getTitle();


		JaBaTalksLogin.English(driver).click();

		//JaBaTalksLogin.Dutch(driver).click();

		JaBaTalksLogin.Name(driver).sendKeys("aptest");


		JaBaTalksLogin.OrgName(driver).sendKeys("Aporg");

		JaBaTalksLogin.Email(driver).sendKeys("aptest@gmail.com");


		JaBaTalksLogin.Agree(driver).click();

		JaBaTalksLogin.GetStarted(driver).click();







		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t = " A welcome email has been sent. Please check your email.";
		// identify elements with text()
		//List<WebElement> l= (List<WebElement>) JaBaTalksLogin.Welcome(driver);
		List<WebElement> l= driver.findElements(By.xpath("//span[contains(text(),'A welcome email has been sent. Please check your e')]"));
		// verify list size
		if ( l.size() > 0){
			System.out.println("Text: " + t + " is present. ");
		} else {
			System.out.println("Text: " + t + " is not present. ");
		}

		//driver.close();
		driver.quit();
	}

}




