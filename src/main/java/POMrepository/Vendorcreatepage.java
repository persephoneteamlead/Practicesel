package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vendorcreatepage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement vendorcreatebutton;

	public Vendorcreatepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVendorcreatebutton() {
		return vendorcreatebutton;
	}
	

}
