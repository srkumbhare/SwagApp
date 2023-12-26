package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FrontPage {
	public WebDriver driver;
	
	@FindBy (xpath = "(//button[@class='btn_primary btn_inventory'])[1]")
	private WebElement addButtonBackpack;
	
	@FindBy (xpath = "(//div[@class='inventory_item_price'])[1]")
	private WebElement priceBackpack;
	
	@FindBy (xpath = "(//img[@class='inventory_item_img'])[1]")
	private WebElement imageBackpack;
	
	@FindBy (xpath = "(//div[@class='inventory_item_desc'])[1]")
	private WebElement descriptionBackpack;
	
	@FindBy (xpath = "(//button[@class='btn_primary btn_inventory'])[2]")
	private WebElement addButtonBikeLight;	
	
	@FindBy (xpath = "(//div[@class='inventory_item_price'])[2]")
	private WebElement priceBikeLight;	
	
	@FindBy (xpath = "(//img[@class='inventory_item_img'])[2]")
	private WebElement imageBikeLight;	
	
	@FindBy (xpath = "(//div[@class='inventory_item_desc'])[2]")
	private WebElement descriptionBikeLight;
	
	@FindBy (xpath = "//div[@id='shopping_cart_container']")
	private WebElement addToCartBin;
	
	@FindBy (xpath = "(//button[@class='btn_secondary cart_button'])[1]")
	private WebElement removeBackpack;
	
	@FindBy (xpath= "//a[text()='Continue Shopping']")
	private WebElement continueShopping;
	
	@FindBy (xpath = "//button[@class='btn_secondary btn_inventory']")
	private WebElement removeBikeLight;
	
	@FindBy (xpath = "//select[@class='product_sort_container']")
	private WebElement sorting;
	
	
	
	
	public FrontPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickaddButtonBackpack() {
		addButtonBackpack.click();
	}
	
	public void getpriceBackpack() {
		String PriceBackPackProduct = priceBackpack.getText();
		System.out.println("Price of BackPack Product : " + PriceBackPackProduct);
	}
	
	public void checkImageIsDisplayedBackpack() {
		boolean ImageDisplayedBackpack = imageBackpack.isDisplayed();
		System.out.println("Image is Displayed of Backpack : "+ ImageDisplayedBackpack);
	}
	
	public void getDescriptionBackpack() {
		String DescriptionBackpackText = descriptionBackpack.getText();
		System.out.println("Description of Backpack : " + DescriptionBackpackText);
	}
	
	public void clickaddButtonBikeLight() {
		addButtonBikeLight.click();
	}
	
	public void getpriceBikeLight() {
		String PriceBikeLightProduct = priceBikeLight.getText();
		System.out.println("Price of Bike Light Product : " + PriceBikeLightProduct);
	}
	
	public void checkImageIsDisplayedBikeLight() {
		boolean ImageDisplayedBikeLight = imageBikeLight.isDisplayed();
		System.out.println("Image is Displayed of Bike Light : "+ ImageDisplayedBikeLight);
	}
	
	public void getDescriptionBikeLight() {
		String DescriptionBikeLightText = descriptionBikeLight.getText();
		System.out.println("Description of Bike Light : " + DescriptionBikeLightText);
	}
	
	public void getQtyAddToCartBin() {
		String QtyAddToCart = addToCartBin.getText();
		System.out.println("Quantity of Add to Cart : " + QtyAddToCart);
	}
	
	public void clickAddToCartBin() {
		addToCartBin.click();
	}
	
	public void removeBackpack() {
		removeBackpack.click();
	}
	
	public void continueShopping() {
		continueShopping.click();
	}
	
	public void removeBikeLight() {
		removeBikeLight.click();
	}
	
	public void soringProduct() {
		Select sel1 = new Select(sorting);
		sel1.selectByVisibleText("Price (low to high)");
	}	
	
}
