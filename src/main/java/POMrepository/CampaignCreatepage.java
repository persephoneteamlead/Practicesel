package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignCreatepage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcampbutton;

	public CampaignCreatepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatecampbutton() {
		return createcampbutton;
	}
	
	

}
