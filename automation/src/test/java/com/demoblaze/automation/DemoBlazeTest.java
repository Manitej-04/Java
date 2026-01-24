package com.demoblaze.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class DemoBlazeTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        // generate unique credentials
        String username = "user" + System.currentTimeMillis();
        String password = "test123";

        // ---------- SIGN UP ----------
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);

        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);

        // accept signup success alert
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        // ---------- LOGIN IMMEDIATELY ----------
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);

        // ---------- VALIDATION ----------
        String welcomeText = driver.findElement(By.id("nameofuser")).getText();
        System.out.println(welcomeText);

        assertTrue(welcomeText.contains("Welcome"));

        driver.quit();
    }
}