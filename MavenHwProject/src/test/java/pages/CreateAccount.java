package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import helper.utility;

public class CreateAccount {
	
	 WebDriver driver;
	  
	  public CreateAccount(WebDriver d)
	  {
		  this.driver = d;
	  }

	  @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") WebElement signInButton;
	  @FindBy(id = "email_create") WebElement emailId ;
	  @FindBy(id = "SubmitCreate") WebElement createAccountButton;
	  @FindBy(id = "id_gender1") WebElement genderTittle;
	  @FindBy(id = "customer_firstname") WebElement firstname;
	  @FindBy(id = "customer_lastname") WebElement lastname;
	  @FindBy(id = "passwd") WebElement password;
	  
	  @FindBy(id = "days") WebElement day;
	  @FindBy(id = "months") WebElement month;
	  @FindBy(id = "years") WebElement year;
	  
	  @FindBy(id = "address1") WebElement address;
	  @FindBy(id = "city") WebElement city;
	  @FindBy(id = "id_state") WebElement state;
	  @FindBy(id = "postcode") WebElement zipcode;
	  
	  @FindBy(id = "phone") WebElement phoneNumber;
	  @FindBy(xpath = "//*[@id=\"submitAccount\"]/span") WebElement registerButton;
	  
	  public void ValidateHomePage()
	  {
		  utility.validateTitle(driver, "My Store");
	  }
	  public void clickSignInButton()
	  {
		  System.out.println("LOG INFO :clicked signInButton ");
		  utility.waitForWebElement(driver,signInButton).click();
	  }
	  
	  public void EnterEmailId(String s)
	  {
		  System.out.println("LOG INFO :emailID entered ");
		  utility.waitForWebElement(driver, emailId).sendKeys(s);
	  }
	  
	  public void clickCreateAccountButton()
	  {
		  System.out.println("LOG INFO :clicked createAccountButton ");
		  utility.waitForWebElement(driver,createAccountButton).click();
	  }
	  
	  public void clickGenderTittleButton()
	  {
		  System.out.println("LOG INFO :clicked signInButton ");
		  utility.waitForWebElement(driver, genderTittle).click();
	  }
	  
	  public void enterFirstName(String s)
	  {
		  System.out.println("LOG INFO:first name entered ");
		  utility.waitForWebElement(driver, firstname).sendKeys(s);//waiting userName element to be visible and interactive before sending info;
	  }
	  
	  public void enterLastName(String s)
	  {
		  System.out.println("LOG INFO:last name entered ");
		  utility.waitForWebElement(driver, lastname).sendKeys(s);//waiting userName element to be visible and interactive before sending info;
	  }
	  
	  public void enterPassword(String p)
	  {
		  System.out.println("LOG INFO:password entered ");
		  utility.waitForWebElement(driver, password).sendKeys(p);//waiting userName element to be visible and interactive before sending info;
	  }
	  
	  public void dropDownDay() {
		  
		  Select dayDropDown = new Select(day);
		  dayDropDown.selectByIndex(9);
		  
	  }
	  
      public void dropDownmonth() {
    	  Select monthDropDown =new Select(month);
    	  monthDropDown.selectByValue("7");
    	 
		  
	  }
      
         public void dropDownYear() {
		  
		  Select yearDropDown = new Select(year);
		  yearDropDown.selectByValue("2015");  
		  
	  }
         public void EnterAddress(String s)
   	  {
   		  System.out.println("LOG INFO :address entered ");
   		  utility.waitForWebElement(driver,address ).sendKeys(s);
   	  }
	   
         public void EnterCity(String s)
      	  {
      		  System.out.println("LOG INFO :city entered ");
      		  utility.waitForWebElement(driver,city ).sendKeys(s);
      		 
      	  }
         
         public void dropDownState() {
   		  
   		  Select stateDropDown = new Select(state);
   		  stateDropDown.selectByVisibleText("New York");  
   		  
   	  }   
         public void EnterZipcode(String s)
     	  {
     		  System.out.println("LOG INFO :Zipcode  entered ");
     		  utility.waitForWebElement(driver,zipcode).sendKeys(s);
     	  }
         public void enterPhoneNumber(String s)
   	  {
   		  System.out.println("LOG INFO:Phone Number entered ");
   		  utility.waitForWebElement(driver, phoneNumber).sendKeys(s);
   	  }
         public void clickRegisterButton()
   	  {
   		  System.out.println("LOG INFO :clicked Register Button ");
   		  utility.waitForWebElement(driver,registerButton).click();
   	  }
	  

 
 
 
 
 
 
 
 
 
 
 
 
 
 
	 
}
