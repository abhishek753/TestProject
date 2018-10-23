package fire;

import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaFire {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C://geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("www.google.com");
	}

}
