package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import helper.utility;

public class ShoppingCart {
	
	 WebDriver driver;
	  
	  public ShoppingCart(WebDriver d)
	  {
		  this.driver = d;
	  }
	  @FindBy(id = "search_query_top") WebElement searchButton ;
	  @FindBy(name = "submit_search") WebElement searchSubmitButton ;
	  
	  @FindBy(xpath = "//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5") WebElement productButton;
	  @FindBy(id = "add_to_cart") WebElement addCartButton ;
	  @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span") WebElement proCheckButton;
	  @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span") WebElement proCheckButton1;
	  @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span") WebElement proCheckButton2;
	  @FindBy(name = "cgv") WebElement termButton ;
	  @FindBy(xpath = "//*[@id=\"form\"]/p/button/span") WebElement proCheckButton3;
	  @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a") WebElement paymentButton;
	  @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span") WebElement confirmationButton;
		
	  public void searchIteam(String s)
	  {
		  System.out.println("LOG INFO :search dress as iteam entered  ");
		  utility.waitForWebElement(driver, searchButton).sendKeys(s);
	  }
	  public void clicksearchSubmitIteam()
	  {
		  utility.waitForWebElement(driver,searchSubmitButton).click();
		  System.out.println("LOG INFO :clicked searchSubmitButton");
	  }
	  
	  public void clickUserTab()
	  {
		  utility.waitForWebElement(driver, productButton).click();
		  System.out.println("LOG:INFO clicked on product button");
	  }
	  public void clickAddCartButton()
	  {
		  System.out.println("LOG INFO :clicked addCartButton ");
		  utility.waitForWebElement(driver,addCartButton).click();
	  }
	  public void clickProCheckButton()
	  {
		  System.out.println("LOG INFO :clicked proCheckButton ");
		  utility.waitForWebElement(driver,proCheckButton).click();
		  utility.waitForWebElement(driver,proCheckButton1).click();
		  utility.waitForWebElement(driver,proCheckButton2).click();
	  }
	  public void clickButton()
	  {
		  System.out.println("LOG INFO :clicked addCartButton,termButton,proceed checkout,paymentbutton and confirmed ");
		  utility.waitForWebElement(driver,termButton).click();
		  utility.waitForWebElement(driver,proCheckButton3).click();
		  utility.waitForWebElement(driver,paymentButton).click();
		  utility.waitForWebElement(driver,confirmationButton).click();  
	  }
	  
	  public void ValidateOrderCoplete()
	  {
		  utility.validateTitle(driver, "Order confimation - My Store");
	  
	  
	  
	  
	  
	  
	  
	  }
	
	
	
	
	
	

}
