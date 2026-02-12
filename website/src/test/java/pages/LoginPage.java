package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    private By signUpNav = By.id("signin2");
    private By loginNav = By.id("login2");

    private By username = By.id("sign-username");
    private By password = By.id("sign-password");
    private By signupBtn = By.xpath("//button[text()='Sign up']");
    private By loginBtn = By.xpath("//button[text()='Login in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void signup(String user, String pass) {

        driver.findElement(signUpNav).click();

        wait.until(ExpectedConditions.elementToBeClickable(username));

        driver.findElement(username).sendKeys(user);

        driver.findElement(password).sendKeys(pass);

        driver.findElement(signupBtn).click();
    }
    
    public void login(String user, String pass) {
    	driver.findElement(loginNav).click();
    	
        driver.findElement(username).sendKeys(user);

        driver.findElement(password).sendKeys(pass);

        driver.findElement(loginBtn).click();
    }
}
