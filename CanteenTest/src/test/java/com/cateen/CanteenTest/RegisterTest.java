package com.cateen.CanteenTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest {
	
	@Test
	void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/collegeManagment/home.jsp");
		
		HomePage home = new HomePage(driver);
		home.register();
		
		//User Register
		RegisterPage reg = new RegisterPage(driver);
//		reg.register("mani04@gmail.com", "mani04", "9988776655", "1234");
//		reg.register("mani06@gmail.com", "mani06", "9988776655", "1234");
		reg.register("mani10@gmail.com", "mani10", "9988776655", "1234");
				
		//User Login
		LoginPage log = new LoginPage(driver);
		log.login("mani10", "1234");
	}
}
