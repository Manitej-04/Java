package com.cateen.CanteenTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.UserMenu;

public class UserTest {
	
	@Test
	void loginLogout() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/collegeManagment/home.jsp");
		
		HomePage home = new HomePage(driver);
		home.login();
		
		LoginPage log = new LoginPage(driver);
		log.login("mani04", "1234");
		
		log.logout();
				
	}
	
	@Test
	void addToCart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/collegeManagment/home.jsp");
		
		HomePage home = new HomePage(driver);
		home.login();
		
		LoginPage log = new LoginPage(driver);
		log.login("mani04", "1234");	
		
		UserMenu menu = new UserMenu(driver);
		menu.placeOrder();
		
	}
}
