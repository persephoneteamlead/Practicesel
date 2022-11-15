package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaigninfoPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement validatemsg;

	public CampaigninfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getValidatemsg() {
		return validatemsg;
	}
	
	public void validatemsgs(String partialmsg) {
		String msg = validatemsg.getText();
		if(msg.contains(partialmsg)) {
			System.out.println("verified");
		}
		else {
			System.out.println("error");
		}
	}
}
