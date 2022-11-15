package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class Homepage {
	@FindBy(linkText = "Organizations")
	private WebElement orgbutton;
	
	@FindBy(linkText = "Products")
	private WebElement productnutton;
	
	@FindBy(linkText = "More")
	private WebElement morebutton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adm;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campbutton;
	
	@FindBy(linkText = "Purchase Order")
	private WebElement pobutton;
	
	@FindBy(linkText = "Vendors")
	private WebElement venbutton;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgbutton() {
		return orgbutton;
	}

	public WebElement getProductnutton() {
		return productnutton;
	}

	public WebElement getMorebutton() {
		return morebutton;
	}

	public WebElement getCampbutton() {
		return campbutton;
	}

	public WebElement getPobutton() {
		return pobutton;
	}

	public WebElement getVenbutton() {
		return venbutton;
	}
	public WebElement getAdm() {
		return adm;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	public void logout(WebDriver driver) {
		WebDriverUtility wl=new WebDriverUtility();
		wl.mouseHover(driver, adm);
		signout.click();
		
	}
}
