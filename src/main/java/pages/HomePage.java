package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public HomePage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}

	public MyHomePage clickCrmsfa() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
		
	}

}
