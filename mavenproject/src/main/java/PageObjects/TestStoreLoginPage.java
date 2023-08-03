package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestStoreLoginPage {
	WebDriver driver;
	
	public TestStoreLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.cssSelector("");
	By password = By.cssSelector("");
	By loginBtn = By.cssSelector("");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}
}
