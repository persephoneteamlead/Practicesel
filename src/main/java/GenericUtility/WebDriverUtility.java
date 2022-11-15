package GenericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void imlicitwaiting(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitforpage(WebDriver driver,String partialURl) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlContains(partialURl));
	}
	
	public void waitforpage(WebDriver driver,WebElement elemet) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(elemet));
	}
	
	public void switchtoChildParentwindow(WebDriver driver,String partialwindowname) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);
			String currentwindow=driver.getTitle();
			if(currentwindow.contains(partialwindowname)) {
				break;
			}
		}
	}
	
	public void alertaccept(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void alertdismiss(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void selectbyind(WebElement ele,int ind) {
		Select sel=new Select(ele);
		sel.selectByIndex(ind);
	}
	
	public void selectbyval(WebElement ele,String val) {
		Select sel=new Select(ele);
		sel.selectByValue(val);
	}
	
	public void selectbyvis(WebElement ele,String val) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(val);
	}
}
