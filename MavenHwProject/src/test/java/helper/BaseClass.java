package helper;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import dataProviderFactory.DataProviderFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	 public WebDriver driver;
	  public ExtentReports report;
	  public ExtentTest logger;
		
	 

	  @BeforeClass
	  public void beforeClass() throws FileNotFoundException, IOException {
		  
		  System.out.println("LOG INFO: Before suite running ...setting up report");
		  ExtentHtmlReporter reporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/reports/ETReport" + utility.getTime()+".html"));
		  report = new ExtentReports();
		  report.attachReporter(reporter);
		  System.out.println("LOG INFO: after suite running ...setting up report");
		  
		  
		  System.out.println("LOG INFO: creating browser session");
		  driver = browserFactory.StartBrowser(DataProviderFactory.getConfig().getBrowser(),DataProviderFactory.getConfig().getStagingURL());
		  System.out.println("LOG INFO:  browser session created");	                  
	  }
	  
	  @AfterMethod
	  public void appendReport(ITestResult result) throws IOException {
		  System.out.print("Test Name " + result.getName());
		  System.out.print("LOG INFO: After running...Generating Test Report");
		  
		  int status =result.getStatus();
		  if(status ==ITestResult.SUCCESS)
		  {
			  logger.pass("Test Scenario Passed", MediaEntityBuilder.createScreenCaptureFromPath(utility.CaptureScreenShot(driver)).build());
		  }
		  else if (status == ITestResult.FAILURE)
		  {
			  logger.fail("Test Failed" + result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(utility.CaptureScreenShot(driver)).build());
		  }
		  else if(status==ITestResult.SKIP)
		  {
			  logger.skip("Test Scenario skipped");
		  }
		  report.flush();
		  System.out.println("LOG INFO : after method Excuteed...test result appended to reports");
	  }

	  
	  @AfterClass
	  public void colseSession() {
		  System.out.println("LOG INFO : closing browser session");
		  
		  driver.quit();
		  
		  System.out.println("LOG INFO :Browser session closed");
	  }

	 

	
 

}
