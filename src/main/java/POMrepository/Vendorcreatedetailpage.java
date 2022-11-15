package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendorcreatedetailpage {
	
	@FindBy(xpath="//input[@name='vendorname']")
	private WebElement vendorname;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;

	public Vendorcreatedetailpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVendorname() {
		return vendorname;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

}
