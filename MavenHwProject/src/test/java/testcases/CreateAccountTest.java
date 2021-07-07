package testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import helper.BaseClass;
import pages.CreateAccount;
import pages.ShoppingCart;

public class CreateAccountTest extends BaseClass{
 
	CreateAccount createAccount;
	 ShoppingCart shoppingCart;
	
	@Test(description ="log into My Store",priority=0)
 public void creatAccountMyStore() {
		
		Faker faker =new Faker();
		
		createAccount = PageFactory.initElements(driver,CreateAccount .class);
		shoppingCart  =  PageFactory.initElements(driver,ShoppingCart .class);
	    logger = report.createTest("Login Test for My Store");
	     
	    createAccount .ValidateHomePage();
	    logger.pass("Home Page Validated ");
	        
	    createAccount.clickSignInButton();
	    logger.info("clicked on SignIn button"); 
	    
	    createAccount. EnterEmailId(faker.internet().emailAddress());
	    logger.info("email id entered"); 
	    
	    createAccount.clickCreateAccountButton();
	    logger.info("clicked on SignIn button"); 
	    
	    createAccount.clickGenderTittleButton();
	    logger.info("clicked on gender Title button"); 
	    
	    createAccount.enterFirstName("Shah");
	    logger.info("enter first Name"); 
	    
	    createAccount.enterLastName("rabby");
	    logger.info("enter last Name");
	    
	    createAccount.enterPassword("shamim123");
	    logger.info("enter password");
	    
	     createAccount.dropDownDay();
	     createAccount.dropDownmonth();
	     createAccount.dropDownYear();
	     logger.info("date of bith selected");
	     
	     createAccount.EnterAddress("522 Pine St");
	     createAccount.EnterCity("Brooklyn");
	     createAccount.dropDownState();
	     createAccount.EnterZipcode("11208");
	     logger.info("Address entered");
	     
	     createAccount.enterPhoneNumber("4665656565");
	     logger.info("phone number entered");
	     
	     createAccount.clickRegisterButton();
	     logger.info("register button clicked");
	     
	     
	     shoppingCart.searchIteam("Dress");
	     logger.info("dress entered");
	     shoppingCart.clicksearchSubmitIteam();
	     logger.info("serachSubmitButton clicked");
	     
	     shoppingCart.clickUserTab();
	     logger.pass("user hover and clicked User");
	     shoppingCart.clickAddCartButton();
	     logger.info("addCartButton clicked");
	     
	     shoppingCart.clickProCheckButton();
	     logger.info("procced checkout Button clicked");
	     
	     shoppingCart.clickAddCartButton();
	     logger.info("clicked addCartButton,termButton,proceed checkout,paymentbutton and confirmed");
	     
	     shoppingCart.ValidateOrderCoplete();
		 logger.pass("order complete confiration  Validatioon");     
	     		
  }
}
