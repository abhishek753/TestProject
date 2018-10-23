package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposePage {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		driver.findElement(By.xpath("//td//img[2]")).click();
		driver.findElement(By.className("vO")).sendKeys("neha.nehra91@gmail.com");
		driver.findElement(By.className("aoT")).sendKeys("Auto Generated Mail By Your Love:");
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys("Hi,"
				+ "ONLY FOR TESTING");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		System.out.println("DONE");

	}

}
