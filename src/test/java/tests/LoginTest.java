package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	public LoginPage lp;
	public void initObjects() {
		 lp = new LoginPage(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		 launchBrowser();
		  initObjects();
		  Thread.sleep(6000);
	}
		
  @Test
  public void verifyLogin() throws InterruptedException {
	 lp.loginApp();
	 lp.clickOnLoginButton();
	  Thread.sleep(4000);
	  System.out.println("Test Verify Login Completed Successfully");
	  System.out.println("---------------LOGIN PAGE Test Case 2 -----------------------------------");
  }
  
  @Test (priority=1)
  public void verifyTitle() throws InterruptedException {
	  String expectedTitle = "Swag Labs";
	  String actTitle = driver.getTitle();	
	  Thread.sleep(2000);
	  Assert.assertEquals(actTitle, expectedTitle, "Actual Title is does not matched to expected Title");
	  Thread.sleep(2000);
	  System.out.println("Test Verify Title Completed Successfully");
	  System.out.println("---------------LOGIN PAGE Test Case 3 -----------------------------------");
  }
  @Test (priority = -1)
  public void verifyUrl() throws InterruptedException {
	  String expectedUrl = "https://www.saucedemo.com/v1/";
	  String actCurrentUrl = driver.getCurrentUrl();	
	  Thread.sleep(2000);
	  Assert.assertEquals(actCurrentUrl, expectedUrl, "Actual Url is not matched to expected Url");
	  Thread.sleep(2000);
	  System.out.println("Test Verify URL Completed Successfully");
	  System.out.println("---------------LOGIN PAGE Test Case 1 -----------------------------------");
  }
    
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  System.out.println("Test Cases of LOGINPAGES Completed Successfully");
	  System.out.println("--------------------------------------------------");
	  Thread.sleep(4000);
	  tearDown();
	  System.out.println("LOGIN PAGE Close Browser Successfully");
	  System.out.println("##############################################################################################");
  }
}
