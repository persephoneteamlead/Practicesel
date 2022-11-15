package GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import POMrepository.Homepage;
import POMrepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baesclass {


	PropertyUtility pl=new PropertyUtility();
	WebDriverUtility wl=new WebDriverUtility();
	public WebDriver driver=null;
	
	
	
	@BeforeSuite(groups= {"sanity","regression"})
	public void bs() {
		System.out.println("database connection");
	}
	
	@BeforeTest(groups= {"sanity","regression"})
	public void bt() {
		System.out.println("test type");
	}
	
	@Parameters("BROWSER")
	@BeforeClass(groups= {"sanity","regression"})
	public void bc(String BROWSER) throws IOException {
		//String browser=pl.propertyfile("browser");
		if(BROWSER.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		wl.imlicitwaiting(driver);
		String url=pl.propertyfile("url");
		driver.get(url);
	}
	
	@BeforeMethod(groups= {"sanity","regression"})
	public void bm() throws IOException {
		//String un=pl.propertyfile("un");
		//String pwd=pl.propertyfile("pwd");
		//lp.loginbasecalss(un, pwd);
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}
	
	@AfterMethod(groups= {"sanity","regression"})
	public void am() {
		Homepage hp=new Homepage(driver);
		hp.logout(driver);
	}
	
	@AfterClass(groups= {"sanity","regression"})
	public void ac() {
		driver.quit();
	}
	
	@AfterTest(groups= {"sanity","regression"})
	public void at() {
		System.out.println("testing completed");
	}
	
	@AfterSuite(groups= {"sanity","regression"})
	public void as() {
		System.out.println("db closed");
	}
}
