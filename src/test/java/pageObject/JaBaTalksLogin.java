package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JaBaTalksLogin {
	
	static WebElement element = null;
	
	public static WebElement English(WebDriver driver) 
	{
	
		 element = driver.findElement(By.xpath("//span[contains(text(),'English')]")); 
		// Verify the English is enabled and visible. 
		   if(element.isEnabled() && element.isDisplayed()) 
		   { 
		      System.out.println("English Dropdown is enabled and visible"); 
		   } 
		  else { 
		      System.out.println("English Dropdown  is not visible"); 
		  } 
		
		
		return element;
	}

	public static WebElement drop1(WebDriver driver) 
	{
		 element= driver.findElement(By.xpath("//body/div[1]/div[2]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/span[1]/i[1]")); 
		return element;
	}

	public static WebElement Dutch(WebDriver driver) 
	{
		
		 element= driver.findElement(By.xpath("//div[contains(text(),'Dutch')]")); 
		// Verify the Dutch is enabled and visible. 
				if(element.isEnabled() && element.isDisplayed()) 
				{ 
					System.out.println("Dutch Dropdown is enabled and visible"); 
				} 
				else { 
					System.out.println("Dutch Dropdown  is not visible"); 
				}
		return element;
	}

	public static WebElement Name(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//input[@id='name']")); 
		return element;
	}


	public static WebElement OrgName(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//input[@id='orgName']")); 
		return element;
	}

	public static WebElement Email(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//input[@id='singUpEmail']")); 
		return element;
	}
	public static WebElement Agree(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//span[contains(text(),'I agree to the')]")); 
		return element;
	}

	public static WebElement GetStarted(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")); 
		return element;
	}


	public static WebElement Welcome(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//span[contains(text(),'A welcome email has been sent. Please check your e')]")); 
		return element;
	}

}
