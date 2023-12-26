package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

	public static WebDriver driver;
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println("Launch Browser Successully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void launchBrowser1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		System.out.println("Launch Browser Successully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	public void tearDown() {
		driver.quit();
	}
}
