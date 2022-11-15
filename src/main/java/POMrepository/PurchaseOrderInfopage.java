package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderInfopage {
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement msg;

	public PurchaseOrderInfopage(WebDriver driver) {
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
