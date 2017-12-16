package TESTNG.TESTNGFRAMEWORK;

import java.util.HashMap;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

import DataLoader.DataHelper;
import Helper.BrowserControl;

public class DataDriven {
	
	public List<HashMap<String,String>> datamap= DataHelper.data("C:\\seleniumIO\\TestData.xlsx","Sheet1");

	
	
	@Test
	public void MyTest(){
			
		for(int i=0; i<datamap.size();i++){
			WebDriver driver=BrowserControl.setUp();
			driver.findElement(By.id("name_3_firstname")).sendKeys(datamap.get(i).get("FirstName"));
			driver.findElement(By.id("name_3_lastname")).sendKeys(datamap.get(i).get("LastName"));
			driver.findElement(By.id("phone_9")).sendKeys(datamap.get(i).get("PhoneNumber"));
			driver.findElement(By.id("username")).sendKeys(datamap.get(i).get("userName"));
			BrowserControl.tearDown();
		}
	}





}
