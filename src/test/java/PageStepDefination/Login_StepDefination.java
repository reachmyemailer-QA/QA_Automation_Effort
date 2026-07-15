package PageStepDefination;

//import BaseClasses.Base;
import PageObjects.Login_Page;
import io.cucumber.java.en.*;
//import junit.framework.*;
import org.junit.*;

public class Login_StepDefination {
    
	Login_Page Login1 = new Login_Page();
	
	//  Scenario: LOGIN_001 - Verify Login with valid credentials
	
	//Given the user is on the Login page of saucedemo
    @Given("the user is on the Login page of saucedemo")
	public void the_user_is_on_the_login_page() {
    	Login1.LoginPageURL();
    	}

   // When the user enters username "standard_user" and password "secret_sauce" and click login button
    @When("the user enters username {string} and password {string} and click login button")
    public void the_user_enters_username_and_password_and_click_login_button(String string1, String string2) {

        Login1.EnterUsername(string1);
        Login1.EnterPassword(string2);
        Login1.clickLoginButton();
    }

    
 //Then the user should be redirected to the Dashboard_Hompage 
    @Then("the user should be redirected to the Dashboard_Hompage")
    public void the_user_should_be_redirected_to_the_dashboard_hompage() {
    	String actualTitle = Login1.getPageTitle();
        String expectedTitle = "Swag Labs";

       Assert.assertEquals(expectedTitle, actualTitle);
      
    }
    
    
    //   Scenario: LOGIN_002 - Verify login with invalid username
    
    //@Given - Already defined in Scenario: LOGIN_001
    
    //When the user enters invalid username "standard_userss" and invalid password "secret_sauce123" and click login button
    @When ("the user enters invalid username {string} and invalid password {string} and click login button")
    public void the_user_enters_invalid_username_and_invalid_password_and_click_login_button(String string1, String string2) {

        Login1.EnterUsername(string1);
        Login1.EnterPassword(string2);
        Login1.clickLoginButton();
    }

    //Then the user should get error message
    @Then("the user should get error message")
    public void the_user_should_get_error_message() {
    	
    	
    	
    	String actualErrorTextOfInvalidLogin = Login1.GetErrorTextOfLogin();
        String expectedErrorTextOfInvalidLogin = "Epic sadface: Username and password do not match any user in this service";

       Assert.assertEquals(actualErrorTextOfInvalidLogin, expectedErrorTextOfInvalidLogin);
      
    }
    



    
    
    
    
    
    
    
}
