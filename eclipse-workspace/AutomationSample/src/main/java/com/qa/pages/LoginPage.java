package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver.findElement(By.id("identifierId")).sendKeys("abhisheksharma10oct1991@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hardworkkk753");
		driver.findElement(By.id("passwordNext")).click();
	}

}