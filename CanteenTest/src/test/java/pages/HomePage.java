package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	private By admin_user_loginbtn = By.xpath("//a[text()='Admin/StudentLogin']");
	private By admin_user_registerbtn = By.xpath("//a[text()='Admin/StudentRegister']");
	private By staff_login = By.xpath("//a[text()='StaffLogin']");
	private By view_questions = By.xpath("//a[text()='ViewQuestions']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void register() {
		driver.findElement(admin_user_registerbtn).click();
	}
	
	public void login() {
		driver.findElement(admin_user_loginbtn).click();
	}
	
	public void staff() {
		driver.findElement(staff_login).click();
	}
	
	public void questions() {
		driver.findElement(view_questions).click();
	}
}