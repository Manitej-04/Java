package com.demoblaze.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

import pages.LoginPage;

public class LoginTest {
	@Test
	void validLoginTest() {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

        LoginPage login = new LoginPage(driver);
        login.signup("mani047", "1234");
        
        login.signup("mani047", "1234");
	}
}
