package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	private By username = By.name("username");
	private By password = By.name("password");
	
	private By login = By.xpath("//button[text()='Login']");
	
	private By logout = By.xpath("//a[text()='Logout']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String userName, String pass) {
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(login).click();
	}
	
	public void logout() {
		driver.findElement(logout).click();;
	}
}