package tests;

import org.testng.annotations.*;

import pages.HomePage;

public class HomePageTest extends BaseTest {
	public HomePage hp;
	
	public void initObjects() {
		hp = new HomePage(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		 Thread.sleep(2000);
		initObjects();
		 Thread.sleep(2000);
	}
	
  @Test (priority=1)
  public void getHeaderText() throws InterruptedException {
	  hp.getHeaderText();
	  Thread.sleep(2000);
	  System.out.println("Test Get Header Text Completed Successfully");
	  System.out.println("---------------HOME PAGE Test Case 1 -----------------------------------");
  }
  
  @Test (priority=2)
  public void imageDisplayed() throws InterruptedException {
	  hp.imageIsDisplayed();
	  Thread.sleep(2000);
	  System.out.println("Test Image Displayed Completed Successfully");
	  System.out.println("---------------HOME PAGE Test Case 2 -----------------------------------");
  }
  
  @Test (priority=3)
  public void getUsernameText() throws InterruptedException {
	  hp.getTextLoginUsername();
	  Thread.sleep(2000);
	  System.out.println("Test Get Login Username Text Completed Successfully");
	  System.out.println("---------------HOME PAGE Test Case 3 -----------------------------------");
  }
  
  @Test (priority=4)
  public void getPasswordText() throws InterruptedException {
	  hp.getTextLoginPassword();
	  Thread.sleep(2000);
	  System.out.println("Test Get Login Password Completed Successfully");
	  System.out.println("---------------HOME PAGE Test Case 4 -----------------------------------"); 
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  System.out.println("Test Cases of HOMEPAGES Completed Successfully");
	  System.out.println("--------------------------------------------------");
	  Thread.sleep(4000);
	  tearDown();
	  System.out.println("HOME PAGE Close Browser Successfully");
	  System.out.println("##############################################################################################");
  }
}
