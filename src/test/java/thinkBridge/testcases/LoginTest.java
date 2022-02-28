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

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		driver.getTitle();
		WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'English')]")); 

		// Verify the dropdown is enabled and visible. 
		if(dropdown.isEnabled() && dropdown.isDisplayed()) 
		{ 
			System.out.println("English Dropdown is enabled and visible"); 
		} 
		else { 
			System.out.println("Dropdown is not visible"); 
		}
		WebElement dp=driver.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/span[1]/i[1]")); 
		dp.click();

		WebElement dropdown1 = driver.findElement(By.xpath("//div[contains(text(),'Dutch')]")); 

		// Verify the dropdown1 is enabled and visible. 
		if(dropdown1.isEnabled() && dropdown1.isDisplayed()) 
		{ 
			System.out.println("Dutch Dropdown is enabled and visible"); 
		} 
		else { 
			System.out.println("Dropdown is not visible"); 
		}

		WebElement Name=driver.findElement(By.xpath("//input[@id='name']")); 
		Name.click();
		Name.sendKeys("aptest");

		WebElement OrgName=driver.findElement(By.xpath("//input[@id='orgName']")); 
		OrgName.click();
		OrgName.sendKeys("Aporg");
		WebElement Email=driver.findElement(By.xpath("//input[@id='singUpEmail']")); 
		Email.click();
		Email.sendKeys("aptest@gmail.com");


		WebElement agree=driver.findElement(By.xpath("//span[contains(text(),'I agree to the')]")); 
		agree.click();

		WebElement Started=driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")); 
		Started.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String t = " A welcome email has been sent. Please check your email.";
		// identify elements with text()
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




