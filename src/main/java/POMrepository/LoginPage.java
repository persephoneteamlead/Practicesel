package POMrepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.PropertyUtility;

public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement sumbitbutton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSumbitbutton() {
		return sumbitbutton;
	}
	
	public void login() throws IOException {
		PropertyUtility pl=new PropertyUtility();
		String un=pl.propertyfile("un");
		String pwd=pl.propertyfile("pwd");
		username.sendKeys(un);
		password.sendKeys(pwd);
		sumbitbutton.click();
	}
	
	public void loginbasecalss(String uname,String pword) {
		username.sendKeys(uname);
		password.sendKeys(pword);
		sumbitbutton.click();
		
	}
	
	

}
