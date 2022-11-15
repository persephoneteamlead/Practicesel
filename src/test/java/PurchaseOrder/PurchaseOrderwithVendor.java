package PurchaseOrder;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import GenericUtility.Baesclass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaClassUtility;
import GenericUtility.PropertyUtility;
import GenericUtility.WebDriverUtility;
import POMrepository.Homepage;
import POMrepository.LoginPage;
import POMrepository.Productcreatedetailpage;
import POMrepository.Productcreatepage;
import POMrepository.PurchaseOrderInfopage;
import POMrepository.PurchaseOrdercreatedetailpage;
import POMrepository.PurchaseOrdercreatepage;
import POMrepository.Vendorcreatedetailpage;
import POMrepository.Vendorcreatepage;

public class PurchaseOrderwithVendor extends Baesclass{

	//public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		/*Random ran=new Random();
		int rannum = ran.nextInt(1000);
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.linkText("Products")).click();
		FileInputStream fis=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String proname=c.getStringCellValue();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		//String productname=proname+rannum;
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(proname+rannum);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele1 = driver.findElement(By.linkText("More"));
		Actions act1=new Actions(driver);
		act1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Vendors")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		FileInputStream fis1=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book1=WorkbookFactory.create(fis1);
		Sheet sh1=book1.getSheet("Sheet1");
		Row r1=sh1.getRow(1);
		Cell c1=r1.getCell(0);
		String venname=c1.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='vendorname']")).sendKeys(venname+rannum);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele2 = driver.findElement(By.linkText("More"));
		Actions act2=new Actions(driver);
		act2.moveToElement(ele2).perform();
		driver.findElement(By.linkText("Purchase Order")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		FileInputStream fis2=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book2=WorkbookFactory.create(fis2);
		Sheet sh2=book2.getSheet("Sheet1");
		Row r2=sh2.getRow(2);
		Cell c2=r2.getCell(0);
		String poname=c2.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(poname+rannum);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String wid=it.next();
			driver.switchTo().window(wid);
			String cid=driver.getWindowHandle();
			if(cid.contains("Vendors&action")) {
				break;
			}
		}
		driver.findElement(By.linkText(venname+rannum)).click();
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String wid1=it1.next();
			driver.switchTo().window(wid1);
			String cid1=driver.getWindowHandle();
			if(cid1.contains("PurchaseOrder&action")) {
				break;
			}
		}
		WebElement ele = driver.findElement(By.xpath("//select[@name='postatus']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Delivered");
		FileInputStream fis3=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book3=WorkbookFactory.create(fis3);
		Sheet sh3=book3.getSheet("Sheet1");
		Row r3=sh3.getRow(2);
		Cell c3=r3.getCell(2);
		String shipadd=c3.getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(shipadd);
		FileInputStream fis4=new FileInputStream("./data/Vtiger.xlsx");
		Workbook book4=WorkbookFactory.create(fis4);
		Sheet sh4=book4.getSheet("Sheet1");
		Row r4=sh4.getRow(3);
		Cell c4=r4.getCell(2);
		String billadd=c4.getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys(billadd);
		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
		Set<String> set2 = driver.getWindowHandles();
		Iterator<String> it21 = set2.iterator();
		while(it21.hasNext()) {
			String wid2=it21.next();
			driver.switchTo().window(wid2);
			String cid1=driver.getWindowHandle();
			if(cid1.contains("Products&action")) {
				break;
			}
			
		}
		driver.findElement(By.linkText(proname+rannum)).click();
		Set<String> set4 = driver.getWindowHandles();
		Iterator<String> it4 = set4.iterator();
		while(it4.hasNext()) {
			String wid4=it4.next();
			driver.switchTo().window(wid4);
			String cid4=driver.getWindowHandle();
			if(cid4.contains("PurchaseOrder&action")) {
				break;
			}
			
		}
		driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement elem = driver.findElement(By.xpath("//span[@class='lvtHeaderText']"));
		String text=elem.getText();
		System.out.println(text);
		if(text.contains("Purchase Order Info")) {
			System.out.println("Purchase Order successfully created");
		}
		else {
			System.out.println("error");
		}
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act10=new Actions(driver);
		act10.moveToElement(element).perform();
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
		String pro=el.readFromExcel("Sheet1", 0, 0);
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(pro+ran);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele1 = driver.findElement(By.linkText("More"));
		wl.mouseHover(driver, ele1);
		driver.findElement(By.linkText("Vendors")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String ven=el.readFromExcel("Sheet1", 1, 0);
		driver.findElement(By.xpath("//input[@name='vendorname']")).sendKeys(ven+ran);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement ele2 = driver.findElement(By.linkText("More"));
		wl.mouseHover(driver, ele2);
		driver.findElement(By.linkText("Purchase Order")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		String po=el.readFromExcel("Sheet1", 2, 0);
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(po+ran);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		wl.switchtoChildParentwindow(driver, "Vendors&action");
		driver.findElement(By.linkText(ven+ran)).click();
		wl.switchtoChildParentwindow(driver, "PurchaseOrder&action");
		WebElement ele = driver.findElement(By.xpath("//select[@name='postatus']"));
		wl.selectbyvis(ele, "Delivered");
		String shipadd = el.readFromExcel("Sheet1", 2, 2);
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(shipadd);
		String billadd = el.readFromExcel("Sheet1", 3, 2);
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys(billadd);
		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
		wl.switchtoChildParentwindow(driver, "Products&action");
		driver.findElement(By.linkText(pro+ran)).click();
		wl.switchtoChildParentwindow(driver, "PurchaseOrder&action");
		driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement elem = driver.findElement(By.xpath("//span[@class='lvtHeaderText']"));
		String text=elem.getText();
		System.out.println(text);
		if(text.contains("Purchase Order Info")) {
			System.out.println("Purchase Order successfully created");
		}
		else {
			System.out.println("error");
		}
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wl.mouseHover(driver, element);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();*/
		
	@Test(groups= {"sanity"})
	public void createpurchaseorder() throws Throwable{
		ExcelUtility el=new ExcelUtility();
		JavaClassUtility jl=new JavaClassUtility();
		PropertyUtility pl=new PropertyUtility();
		WebDriverUtility wl=new WebDriverUtility();
		//WebDriver driver=new FirefoxDriver();
		//wl.imlicitwaiting(driver);
		//String url = pl.propertyfile("url");
		//driver.get(url);
		Productcreatedetailpage pcp=new Productcreatedetailpage(driver);
		Productcreatepage pp=new Productcreatepage(driver);
		Vendorcreatedetailpage vcp=new Vendorcreatedetailpage(driver);
		Vendorcreatepage vp=new Vendorcreatepage(driver);
		PurchaseOrdercreatedetailpage pcop=new PurchaseOrdercreatedetailpage(driver);
		PurchaseOrdercreatepage pop=new PurchaseOrdercreatepage(driver);
		PurchaseOrderInfopage poip=new PurchaseOrderInfopage(driver);
		Homepage hp=new Homepage(driver);
		LoginPage lp=new LoginPage(driver);
		//lp.login();
		hp.getProductnutton().click();
		pp.getAddproductbutton().click();
		String pro = el.readFromExcel("Sheet1", 0, 0);
		int ran=jl.generaterandomNum();
		pcp.getProductname().sendKeys(pro+ran);
		pcp.getSubmitbitton().click();
		wl.mouseHover(driver, hp.getMorebutton());
		hp.getVenbutton().click();
		vp.getVendorcreatebutton().click();
		String ven = el.readFromExcel("Sheet1", 1, 0);
		vcp.getVendorname().sendKeys(ven+ran);
		vcp.getSubmitbutton().click();
		wl.mouseHover(driver, hp.getMorebutton());
		hp.getPobutton().click();
		pop.getPoadd().click();
		String po = el.readFromExcel("Sheet1", 2, 0);
		pcop.getPoname().sendKeys(po+ran);
		pcop.getSelectven().click();
		wl.switchtoChildParentwindow(driver, "Vendors&action");
		driver.findElement(By.linkText(ven+ran)).click();
		wl.switchtoChildParentwindow(driver, "PurchaseOrder&action");
		WebElement ele = pcop.getSelectstatus();
		wl.selectbyvis(ele, "Delivered");
		String shipadd = el.readFromExcel("Sheet1", 2, 2);
		pcop.getShipadd().sendKeys(shipadd);
		String billadd = el.readFromExcel("Sheet1", 3, 2);
		pcop.getBilladd().sendKeys(billadd);
		pcop.getSelectpro().click();
		wl.switchtoChildParentwindow(driver, "Products&action");
		driver.findElement(By.linkText(pro+ran)).click();
		wl.switchtoChildParentwindow(driver, "PurchaseOrder&action");
		pcop.getQty().sendKeys("1");
		pcop.getSubmitbut().click();
		poip.validatemsg("Purchase Order Info");
		//hp.logout(driver);
		//driver.close();
	}

}
