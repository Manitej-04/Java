package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignupPage {
	
	WebDriver driver;
	
	private By signInNav = By.xpath("//button[text()='Sign In']");
	private By noAccount = By.xpath("//button[text()=\"Don't have an account? Sign up\"]");

	
	private By fullname = By.id("fullName");
	private By email = By.id("email");
	private By password = By.id("password");
    private By createAccount = By.xpath("//button[text()='Create Account']");
    
    private By signInBtn = By.xpath("//button[text()=\"Sign In\"]");
    
    public SignupPage(WebDriver driver) {
    	this.driver = driver;
    }
    public void signUp(String name,String useremail, String pass) {
    	driver.findElement(signInNav).click();
    	driver.findElement(noAccount).click();
    	
    	driver.findElement(fullname).sendKeys(name);
    	driver.findElement(email).sendKeys(useremail);
    	driver.findElement(password).sendKeys(pass);
    	
    	driver.findElement(createAccount).click();
    }
    
    public void signIn(String useremail, String pass) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open sign-in modal
        wait.until(ExpectedConditions.elementToBeClickable(signInNav)).click();

        // Wait for modal fields
        wait.until(ExpectedConditions.visibilityOfElementLocated(email))
            .sendKeys(useremail);

        driver.findElement(password).sendKeys(pass);

        // Click modal sign-in button
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn)).click();
    }

}
