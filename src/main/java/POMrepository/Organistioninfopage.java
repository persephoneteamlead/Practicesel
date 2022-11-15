package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organistioninfopage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement msg;
	
	

	public Organistioninfopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getMsg() {
		return msg;
	}
	
	public void validatemsg(String valmsg) {
		String text = msg.getText();
		if(text.contains(valmsg)) {
			System.out.println("verified");
		}
		else {
			System.out.println("error");
		}
	}

}
