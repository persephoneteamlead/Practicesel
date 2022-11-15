package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrdercreatedetailpage {
	@FindBy(xpath="//input[@name='subject']")
	private WebElement poname;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement selectven;
	
	@FindBy(xpath="//select[@name='postatus']")
	private WebElement selectstatus;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billadd;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shipadd;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement selectpro;
	
	@FindBy(xpath="//input[@id='qty1']")
	private WebElement qty;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbut;

	public PurchaseOrdercreatedetailpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPoname() {
		return poname;
	}

	public WebElement getSelectven() {
		return selectven;
	}

	public WebElement getSelectstatus() {
		return selectstatus;
	}

	public WebElement getBilladd() {
		return billadd;
	}

	public WebElement getShipadd() {
		return shipadd;
	}

	public WebElement getSelectpro() {
		return selectpro;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSubmitbut() {
		return submitbut;
	}

	
	
	
}
