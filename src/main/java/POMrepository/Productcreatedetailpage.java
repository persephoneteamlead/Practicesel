package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productcreatedetailpage {
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productname;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbitton;

	public Productcreatedetailpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getSubmitbitton() {
		return submitbitton;
	}
	
	
	

}
