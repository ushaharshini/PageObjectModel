package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public  void setup() {
		excelFile="LoginBook";
		testName="Login Test";

		testDescription="Leaf Tap Login";
	    testCategory="Smoke";
	    testAuthor="Usha";

		
	}

@Test(dataProvider ="getData")
	public void runLogin(String uname,String pwd) throws IOException {
		LoginPage lp=new LoginPage(driver,node);
		lp.enterUserName(uname).enterPassword(pwd).clickLoginButton();
	}

}
