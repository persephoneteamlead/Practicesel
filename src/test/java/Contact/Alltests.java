package Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import POMrepository.Organisationcreatedetailpage;
import POMrepository.Organisationcreatepage;
import POMrepository.Organistioninfopage;
import POMrepository.Productcreatedetailpage;
import POMrepository.Productcreatepage;
import POMrepository.PurchaseOrderInfopage;
import POMrepository.PurchaseOrdercreatedetailpage;
import POMrepository.PurchaseOrdercreatepage;
import POMrepository.Vendorcreatedetailpage;
import POMrepository.Vendorcreatepage;

public class Alltests extends Baesclass {

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
}
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
	
	}
	
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
	
	}
	
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
		
	}
}
