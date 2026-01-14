package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By lgnbtn = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
	By message = By.xpath("//h2[normalize-space()='Secure Area']");
	
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginbtn() {
		driver.findElement(lgnbtn).click();;
	}
	public String getmessage() {
		return driver.findElement(message).getText();
	}

}
