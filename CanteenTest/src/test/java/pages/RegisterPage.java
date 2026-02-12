package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	
	private By email = By.name("email");
	private By username = By.name("username");
	private By mobile = By.name("mobile");
	private By password = By.name("password");
	private By confirmPassword = By.name("confirmPassword");
	
	private By register = By.xpath("//button[text()='Register']");
	
	private By goToLogin = By.linkText("Go to Login");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void register(String userEmail, String userName, String number, String pass) {
		
		driver.findElement(email).sendKeys(userEmail);
		driver.findElement(username).sendKeys(userName);
		driver.findElement(mobile).sendKeys(number);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirmPassword).sendKeys(pass);
		
		driver.findElement(register).click();
		
		driver.findElement(goToLogin).click();
	}
}
