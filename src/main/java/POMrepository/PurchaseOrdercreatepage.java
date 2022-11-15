package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrdercreatepage {

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement poadd;

	public PurchaseOrdercreatepage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}

	public WebElement getPoadd() {
		return poadd;
	}
	
}
