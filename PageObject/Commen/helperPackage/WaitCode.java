package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCode {
	
	public WebDriver driver;
	public WebDriverWait wait;
	/**This constructor is used to intilise the {WebDriverWait}
	 * 
	 * @param ele
	 */
	public  WaitCode() {
		wait=new WebDriverWait(driver,10);
		
	}
	/**
	 * this method is used to wait upto visibility of element locators
	 * @param ele
	 */
	public void visibiltyOfelement(WebElement ele) {
		
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	/**
	 * this method is used to wait upto alert 
	 * @param ele
	 */
	
	public void presenceOfalert() {
		
		wait.until(ExpectedConditions.alertIsPresent());

	}
	
}
