package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	@FindBy (xpath = "//div[@class='login_logo']")
	private WebElement header;
	
	@FindBy (xpath = "//img[@class='bot_column']")
	private WebElement image;
	
	@FindBy (xpath = "//div[@id='login_credentials']")
	private WebElement loginUsername;
	
	@FindBy (xpath = "//div[@class='login_password']")
	private WebElement loginPassword;

public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
public void getHeaderText() {
	String HeaderText = header.getText();
	System.out.println("Header Text : " + HeaderText );
}

public void imageIsDisplayed() {
	boolean ImageResult = image.isDisplayed();
	System.out.println("Image Present Result : " + ImageResult);
}

public void getTextLoginUsername() {
	String LoginUserText = loginUsername.getText();
	System.out.println("Login Username Text are : "+ LoginUserText);
}

public void getTextLoginPassword() {
	String LoginPassText = loginPassword.getText();
	System.out.println("Login Password Text are : " + LoginPassText);
}
}