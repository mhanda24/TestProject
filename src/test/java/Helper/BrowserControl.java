package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControl {

	static WebDriver driver;
	
	public static WebDriver setUp(){
		System.setProperty("webdriver.chrome.driver","C:/seleniumIO/Selenium_Jars/chromedriver.exe" );
		driver = new ChromeDriver();
		String url = "http://demoqa.com/registration";
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to(url);
		System.out.println("Test Environment setup");
		System.out.println("---------------------------------------");
		return driver;
	}
	
	public static void tearDown(){
		System.out.println("Test Environment Distroyed");
		System.out.println("---------------------------------");

		driver.close();
		driver.quit();
	}
}
