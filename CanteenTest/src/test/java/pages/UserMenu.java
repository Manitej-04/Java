package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserMenu {
	WebDriver driver;
	
	private By placeOrder = By.linkText("View Menu and Order Food");
	private By viewOrders = By.linkText("View Your Orders");
	private By feedback = By.linkText("Provide Feedback");
	
	public UserMenu(WebDriver driver) {
		this.driver = driver;
	}
	public void placeOrder() {
		driver.findElement(placeOrder).click();
		
	}
	
	public void viewOrder() {
		driver.findElement(viewOrders).click();;
	}
	
	public void feedback() {
		driver.findElement(feedback).click();;
	}
}
