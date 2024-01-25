package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
		
	}
	

	public LoginPage enterUserName(String uname) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportStep(uname+"username Entered sucessfully","Pass");
			
		} catch (Exception e) {
			reportStep(uname+"username Not Entered "+e,"Fail");
			
		}
		return this;
		
	}
	public LoginPage enterPassword(String pwd) throws IOException {
		
		try {
			driver.findElement(By.id("password")).sendKeys(pwd);
			reportStep(pwd+"username Entered sucessfully","Pass");
		} catch (Exception e) {
			
			reportStep(pwd+"username Not Entered "+e,"Fail");
			
		}
		return this;
	}
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver,node);
	}

}
