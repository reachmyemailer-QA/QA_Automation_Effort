package PageObjects;

import org.openqa.selenium.By;

import BaseClasses.Base;

public class Login_Page extends Base {
	
	// Attribute
	 By  UsernameLocator = By.xpath("//input[@id='user-name']");
	 By  PasswordLocator = By.xpath("//input[@id='password']");
	 By LoginButtonLocator = By.xpath("//input[@id='login-button']");
	 By ErrorTextOfInvalidLogin = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
	
	// Behaviour 
	 
	public void EnterUsername(String UserNameParam) {
		 EnterInInputField(UsernameLocator, UserNameParam);
		 		 
	 }
	 
	public void EnterPassword(String PasswordParam) {
		 EnterInInputField(PasswordLocator, PasswordParam);
		 		 
	 }
	 
	public void clickLoginButton() {
		 clickButton(LoginButtonLocator);
		 		 
	 }
	
	public String GetErrorTextOfLogin() {
		return GetElementText(ErrorTextOfInvalidLogin );
		 		 
	 }

}
