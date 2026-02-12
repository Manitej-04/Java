package com.demoblaze.satyamart;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SignupPage;

public class SignupTest {
	@Test
	void validSignup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://satyamart.lovable.app/");
		
		SignupPage signup = new SignupPage(driver);
//		signup.signUp("Manitej", "manitej@gmail.com", "mani1234");
		signup.signIn("manitej@gmail.com", "mani1234");
	}

}
