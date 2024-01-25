package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
	public  CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
public CreateLeadPage enterCompanyName(String cname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	return this;
}
public CreateLeadPage enterfname(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	return this;
}
public CreateLeadPage enterlname(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;

}
public ViewLead clickCreateButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLead(driver);
}
}
