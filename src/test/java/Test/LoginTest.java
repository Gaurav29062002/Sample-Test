package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.LoginPage;

public class LoginTest extends BaseTest{
	
	
	
	
	@Test
	public void logintest() throws InterruptedException {
		LoginPage lp=new LoginPage(getDriver());
		lp.enterusername(prop.getProperty("username"));
		lp.enterpassword(prop.getProperty("password"));
		lp.loginbtn();
		
		Thread.sleep(5000);
		Assert.assertTrue(lp.getmessage().contains("Welcome to the Secure Area. When you are done click logout below.\r\n"
				+ ""));
	}
	

}
