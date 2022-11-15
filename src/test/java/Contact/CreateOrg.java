package Contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
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
import POMrepository.Homepage;
import POMrepository.LoginPage;
import POMrepository.Organisationcreatedetailpage;
import POMrepository.Organisationcreatepage;
import POMrepository.Organistioninfopage;

public class CreateOrg extends Baesclass{

	//public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		/*WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Random ran=new Random();
		int ranNum=ran.nextInt()*100;
		FileInputStream fis=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.getRow(5);
		Cell c=r.getCell(0);
		String org=c.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(org+ranNum);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		WebElement text = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String vali = text.getText();
		System.out.println(vali);
		if(vali.contains("Organization Info")) {
			System.out.println("verified");
		}
		else {
			System.out.println("error");
		}
		driver.findElement(By.xpath("//input[@title='Delete [Alt+D]']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
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
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String org = el.readFromExcel("Sheet1", 5, 0);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(org+ran);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		WebElement text = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String vali = text.getText();
		System.out.println(vali);
		if(vali.contains("Organization Info")) {
			System.out.println("verified");
		}
		else {
			System.out.println("error");
		}
		driver.findElement(By.xpath("//input[@title='Delete [Alt+D]']")).click();
		wl.alertaccept(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wl.mouseHover(driver, ele);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();*/
	
		@Test(groups= {"regression"})
		public void cresteorg() throws Throwable{
		ExcelUtility el=new ExcelUtility();
		JavaClassUtility jl=new JavaClassUtility();
		PropertyUtility pl=new PropertyUtility();
		WebDriverUtility wl=new WebDriverUtility();
		//WebDriver driver=new FirefoxDriver();
		//wl.imlicitwaiting(driver);
		LoginPage lp=new LoginPage(driver);
		Homepage hp=new Homepage(driver);
		Organisationcreatedetailpage ocp=new Organisationcreatedetailpage(driver);
		Organisationcreatepage op=new Organisationcreatepage(driver);
		Organistioninfopage oip=new Organistioninfopage(driver);
		//String url=pl.propertyfile("url");
		//driver.get(url);
		//lp.login();
		hp.getOrgbutton().click();
		op.getProductaddbutton().click();
		String org = el.readFromExcel("Sheet1", 5, 0);
		int ran = jl.generaterandomNum();
		ocp.getOrgname().sendKeys(org+ran);
		ocp.getSubmitbutton().click();
		System.out.println(oip.getMsg().getText());
		oip.validatemsg("Organization Info");
		//hp.logout(driver);
		//driver.close();
	}	
}