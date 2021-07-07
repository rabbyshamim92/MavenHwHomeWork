package helper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class utility {

	public static WebElement waitForWebElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));//waiting webElemnt to be visible
		wait.until(ExpectedConditions.elementToBeClickable(element));//waiting for webElemnt to be clickable
		return element;
	}
	public static void  validateMessage(WebElement element, String msg)
	{
		Assert.assertEquals(element.getText(),msg);
	}
	public static void validateTitle(WebDriver driver,String title)
	{
		boolean status = new WebDriverWait(driver,10).until(ExpectedConditions.titleContains(title));
	Assert.assertTrue(status);
	
	 }
	
	public static void acceptAlert(WebDriver driver)
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent()).accept();
	}
	public static void dismissAlert(WebDriver driver)
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent()).dismiss();
	}
	
	public static String CaptureScreenShot(WebDriver driver)
	{
		String time =getTime();
		String destination = System.getProperty("user.dir") + "/screenshots/MVN"+time +".png";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(destination));
		}catch(IOException e)
		{
			System.out.println("screenshot Failed" + e.getMessage());
		}
		return destination;
		
	}
	
	
	public static String getTime()
	{
		
		DateFormat dateformat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyy");
		return dateformat.format(new Date());
	}
	
	 public  static void dropdownByValue (WebElement element,String value) {
		 Select select =new Select(element);
		 select.selectByValue(value);
		 
	 }
	
	 public  static void dropdownByIndex (WebElement element,int x) {
		 Select select =new Select(element);
		 select.selectByIndex(x);
		 
	 }
	 public  static void dropdownByVisuleText (WebElement element,String value) {
		 Select select =new Select(element);
		 select.selectByVisibleText(value);
		 
	 }
	
	

	
	
	
	
	
	
	
	
	
}
