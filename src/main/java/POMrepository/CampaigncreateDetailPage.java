package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaigncreateDetailPage {
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement addcamp;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement productaddbutton;

	public CampaigncreateDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddcamp() {
		return addcamp;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getProductaddbutton() {
		return productaddbutton;
	}
	
	

}
