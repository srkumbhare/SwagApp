package tests;

import org.testng.annotations.*;

import pages.FrontPage;

public class FrontPageTest extends BaseTest{
	public FrontPage fp;
	
	public void initObjects() {
		fp = new FrontPage(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser1();
		initObjects();
		Thread.sleep(6000);
	}
	
  @Test (priority=1)
  public void testBackpack() throws InterruptedException {
	  fp.clickaddButtonBackpack();
	  Thread.sleep(2000);
	  fp.getpriceBackpack();
	  Thread.sleep(1000);
	  fp.checkImageIsDisplayedBackpack();
	  Thread.sleep(1000);
	  fp.getDescriptionBackpack();
	  Thread.sleep(2000);	  
	  System.out.println("Test BackPack Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 1 -----------------------------------");
  }
  
  @Test (priority=2)
  public void testBikeLight() throws InterruptedException {
	  fp.clickaddButtonBikeLight();
	  Thread.sleep(2000);
	  fp.getpriceBikeLight();
	  Thread.sleep(1000);
	  fp.checkImageIsDisplayedBikeLight();
	  Thread.sleep(1000);
	  fp.getDescriptionBikeLight();
	  Thread.sleep(2000);
	  System.out.println("Test Bike Light Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 2 -----------------------------------");
  }
  
  @Test (priority=3)
  public void testAddToCart() throws InterruptedException {
	  fp.getQtyAddToCartBin();
	  Thread.sleep(2000);
	  fp.clickAddToCartBin();
	  Thread.sleep(2000);
	  System.out.println("Test Add To Cart Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 3 -----------------------------------");
  }
  
  @Test (priority=4)
  public void removeBackpack() throws InterruptedException {
	  fp.removeBackpack();
	  Thread.sleep(2000);
	  System.out.println("Test Remove Backpack Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 4 -----------------------------------");
  }
  
  @Test  (priority=5)
  public void clickContinueShopping() throws InterruptedException {
	  fp.continueShopping();
	  Thread.sleep(2000);
	  System.out.println("Test Continue Shopping Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 5 -----------------------------------");
  }
  
  @Test (priority=6)
  public void remainQtyAddToCart() {
	  fp.getQtyAddToCartBin();
	  System.out.println("Test remaining Qty Add to Cart Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 6 -----------------------------------");
  }
  
  @Test  (priority=7)
  public void removeBikeLight() throws InterruptedException {
	  fp.removeBikeLight();
	  Thread.sleep(2000);
	  System.out.println("Test Remove Bike Light Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 7 -----------------------------------");
  }
  
  @Test  (priority=8)
  public void sortProduct() throws InterruptedException {
	  fp.soringProduct();
	  Thread.sleep(2000);
	  System.out.println("Test Sortng Products Completed Successfully");
	  System.out.println("---------------FRONT PAGE Test Case 8 -----------------------------------");
  } 
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  System.out.println("Test Cases of FRONTPAGES Completed Successfully");
	  System.out.println("--------------------------------------------------");
	  Thread.sleep(3000);
	  tearDown();
	  System.out.println("FRONT PAGE Close Browser Successfully");
	  System.out.println("##############################################################################################");
  }
}
