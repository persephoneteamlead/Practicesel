package Campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
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
import org.openqa.selenium.support.ui.Select;
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
import POMrepository.Productcreatedetailpage;
import POMrepository.Productcreatepage;

public class CreateCampaignwithso extends Baesclass{

	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*Random ran=new Random();
		int random = ran.nextInt()*1000;
		WebDriver driver=new FirefoxDriver();
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
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		FileInputStream fis=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String pro=c.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(pro+random);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele = driver.findElement(By.linkText("More"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		FileInputStream fis1=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book1=WorkbookFactory.create(fis1);
		Sheet sh1=book1.getSheet("Sheet1");
		Row r1=sh1.getRow(4);
		Cell c1=r1.getCell(0);
		String camp=c1.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(camp+random);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String cid=it.next();
			driver.switchTo().window(cid);
			String title = driver.getTitle();
			if(title.contains("Products&action")) {
				break;
			}
		}
		driver.findElement(By.linkText(pro+random)).click();
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String cid1=it1.next();
			driver.switchTo().window(cid1);
			String title1 = driver.getTitle();
			if(title1.contains("Campaigns&action")) {
				break;
			}
		}
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
		driver.close();*/
		
		/*ExcelUtility el=new ExcelUtility();
		JavaClassUtility jl=new JavaClassUtility();
		PropertyUtility pl=new PropertyUtility();
		WebDriverUtility wl=new WebDriverUtility();
		
		int ran = jl.generaterandomNum();
		String url=pl.propertyfile("url");
		String un=pl.propertyfile("un");
		String pwd=pl.propertyfile("pwd");
		WebDriver driver=new FirefoxDriver();
		wl.imlicitwaiting(driver);
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String pro = el.readFromExcel("Sheet1", 0, 0);
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(pro+ran);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele = driver.findElement(By.linkText("More"));
		wl.mouseHover(driver, ele);
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String camp=el.readFromExcel("Sheet1", 4, 0);
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(camp+ran);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		wl.switchtoChildParentwindow(driver, "Products&action");
		driver.findElement(By.linkText(pro+ran)).click();
		wl.switchtoChildParentwindow(driver, "Campaigns&action");
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
	
		@Test(groups= {"regression"})
		public void createcampaignwithproduct() throws Throwable{
		ExcelUtility el=new ExcelUtility();
		JavaClassUtility jl=new JavaClassUtility();
		PropertyUtility pl=new PropertyUtility();
		WebDriverUtility wl=new WebDriverUtility();
		//WebDriver driver=new FirefoxDriver();
		//wl.imlicitwaiting(driver);
		LoginPage lp=new LoginPage(driver);
		Homepage hp=new Homepage(driver);
		CampaignCreatepage cp=new CampaignCreatepage(driver);
		CampaigncreateDetailPage ccp=new CampaigncreateDetailPage(driver);
		CampaigninfoPage cip=new CampaigninfoPage(driver);
		Productcreatedetailpage pcp=new Productcreatedetailpage(driver);
		Productcreatepage pp=new Productcreatepage(driver);
		//String url=pl.propertyfile("url");
		//driver.get(url);
		//lp.login();
		hp.getProductnutton().click();
		pp.getAddproductbutton().click();
		String pro = el.readFromExcel("Sheet1", 0, 0);
		int ran = jl.generaterandomNum();
		pcp.getProductname().sendKeys(pro+ran);
		pcp.getSubmitbitton().click();
		wl.mouseHover(driver, hp.getMorebutton());
		hp.getCampbutton().click();
		cp.getCreatecampbutton().click();
		String camp = el.readFromExcel("Sheet1", 4, 0);
		ccp.getAddcamp().sendKeys(camp+ran);
		ccp.getProductaddbutton().click();
		wl.switchtoChildParentwindow(driver, "Products&action");
		driver.findElement(By.linkText(pro+ran)).click();
		wl.switchtoChildParentwindow(driver, "Campaigns&action");
		ccp.getSubmitbutton().click();
		System.out.println(cip.getValidatemsg().getText());
		cip.validatemsgs("Campaign Informati");
		//hp.logout(driver);
		//driver.close();

	}

}
