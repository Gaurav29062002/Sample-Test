package Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilities.ConfigReader;

public class BaseTest {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	protected Properties prop;
	
	public static WebDriver getDriver() {
        return driver.get();
    }
	
	@Parameters("browser")
	@BeforeMethod
	public void Setup(String browser) {
		
		prop=ConfigReader.getProperty();
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver.set(new FirefoxDriver());
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver.set(new EdgeDriver());
		}
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		getDriver().quit();
	}

}
