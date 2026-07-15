package aPracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ChromeOptions options;
		 WebDriver driver;
			
			//For Incognito Mode-
			options = new ChromeOptions();
		    options.addArguments("--incognito");
		    
		    
		    //Browser Launch
			driver = new ChromeDriver(options);
			
			
			//Maximize Window
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			
			//div[@class="error-message-container error"]
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("124");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("122");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
		String ErrorMessegeBox= driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']")).getText();
		System.out.println(ErrorMessegeBox);

			
	}	
		
}