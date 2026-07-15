package BaseClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	//Base  Resuable code
	
	//Global/ Instance/Class level 
	static ChromeOptions options;
	static WebDriver driver;
	int x;
	
	// Intitailize browser Launch with preffered config/settings
	public static void initializeBrowser() {
		
		//For Incognito Mode-
		options = new ChromeOptions();
	    options.addArguments("--incognito");
	    
	    
	    //Browser Launch
		driver = new ChromeDriver(options);
		
		
		//Maximize Window
		driver.manage().window().maximize();
		
		
		
}
	
	
	
	
// quitting all windows of driver after execution
		public static void quitBrowser() { 
				driver.quit();
			}
	
   
//Navigate to URL
	public void LoginPageURL() {
		driver.get("https://www.saucedemo.com/");
		}
		
		
		

//Enter data Input field 
public  void EnterInInputField(By locator, String input) {

    driver.findElement(locator).sendKeys(input);
}


//Click Button
public  void clickButton(By locator) {

  driver.findElement(locator).click();
}		



	
//for getting page title as per page source html code
public  String getPageTitle() {

    return driver.getTitle();

}



//for getting element/button text
public  String GetElementText(By locator) {

  return driver.findElement(locator).getText();

}

	
}
