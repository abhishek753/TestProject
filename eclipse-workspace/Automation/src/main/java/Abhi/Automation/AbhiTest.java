package Abhi.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbhiTest {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\abhishek\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\abhishek\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");

//		driver = new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(500);
		driver.findElement(By.id("identifierId")).sendKeys("abhisheksharma10oct1991@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hardworkkk753");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(1000);
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
		driver.close();

	}

}
