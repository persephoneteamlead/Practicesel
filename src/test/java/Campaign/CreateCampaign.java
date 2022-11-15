package Campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtility.Baesclass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaClassUtility;
import GenericUtility.PropertyUtility;
import GenericUtility.WebDriverUtility;
import POMrepository.CampaignCreatepage;
import POMrepository.CampaigncreateDetailPage;
import POMrepository.CampaigninfoPage;
import POMrepository.Homepage;
import POMrepository.LoginPage;

public class CreateCampaign extends Baesclass{
//this is a comment whatever bitch
	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FileInputStream pis=new FileInputStream("./data/url.properties");
		Properties p=new Properties();
		p.load(pis);
		String url=p.getProperty("url");
		String un=p.getProperty("un");
		String pwd=p.getProperty("pwd");
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		WebElement ele = driver.findElement(By.linkText("More"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		FileInputStream fis=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.getRow(4);
		Cell c=r.getCell(0);
		String camp=c.getStringCellValue();
		Random ran=new Random();
		int random = ran.nextInt()*1000;
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(camp+random);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement elem = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String text=elem.getText();
		if(text.contains("Campaign Informati")) {
			System.out.println("capmpaign successfully created");
		}
		else {
			System.out.println("error");
		}
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(element).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();}*/
		
		/*ExcelUtility el=new ExcelUtility();
		JavaClassUtility jl=new JavaClassUtility();
		PropertyUtility pl=new PropertyUtility();
		WebDriverUtility wl=new WebDriverUtility();
		
		WebDriver driver=new FirefoxDriver();
		wl.imlicitwaiting(driver);
		String url=pl.propertyfile("url");
		String un=pl.propertyfile("un");
		String pwd=pl.propertyfile("pwd");
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		WebElement ele = driver.findElement(By.linkText("More"));
		wl.mouseHover(driver, ele);
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String camp = el.readFromExcel("Sheet1", 4, 0);
		int ran = jl.generaterandomNum();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(camp+ran);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement elem = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String text=elem.getText();
		if(text.contains("Campaign Informati")) {
			System.out.println("capmpaign successfully created");
		}
		else {
			System.out.println("error");
		}
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wl.mouseHover(driver, element);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();*/
		
	@Test(groups= {"sanity"})
	public void campaign() throws Throwable{
		ExcelUtility el=new ExcelUtility();
		JavaClassUtility jl=new JavaClassUtility();
		PropertyUtility pl=new PropertyUtility();
		WebDriverUtility wl=new WebDriverUtility();
		//WebDriver driver=new FirefoxDriver();
		//wl.imlicitwaiting(driver);
		//String url=pl.propertyfile("url");
		//driver.get(url);
		LoginPage lp=new LoginPage(driver);
		Homepage hp=new Homepage(driver);
		CampaignCreatepage cp=new CampaignCreatepage(driver);
		CampaigncreateDetailPage ccp=new CampaigncreateDetailPage(driver);
		CampaigninfoPage cip=new CampaigninfoPage(driver);
		//lp.login();
		wl.mouseHover(driver, hp.getMorebutton());
		Thread.sleep(2000);
		hp.getCampbutton().click();
		cp.getCreatecampbutton().click();
		String camp=el.readFromExcel("Sheet1", 4, 0);
		int ran = jl.generaterandomNum();
		ccp.getAddcamp().sendKeys(camp+ran);
		ccp.getSubmitbutton().click();
		String msg = cip.getValidatemsg().getText();
		System.out.println(msg);
		cip.validatemsgs("Campaign Information");
		//hp.logout(driver);
		//driver.close();
	}
}

