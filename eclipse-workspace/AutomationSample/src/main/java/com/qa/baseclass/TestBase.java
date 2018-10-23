package com.qa.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

	static ChromeDriver driver;
	
	@BeforeClass
	public static void main(String[] args)
	{
		
//		Reporter.log("",true);
		driver=new ChromeDriver();
		((WebDriver) driver).manage().window().maximize();
		((WebDriver) driver).get("https://www.gmail.com/");
//		Reporter.log("",true);
}
	@AfterClass
	public void closeApplication() {
		((WebDriver) driver).quit();
//		Reporter.log("",true);
	}
	}


