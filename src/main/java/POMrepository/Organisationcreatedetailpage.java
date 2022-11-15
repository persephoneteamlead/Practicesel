package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationcreatedetailpage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement submitbutton;

	public Organisationcreatedetailpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	
	

}
