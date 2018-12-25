package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commenPackage.WebButton;
import commenPackage.WebTextbox;

public class PageAction {
	public WebDriver driver=null;
	public PageLocator pl=null;
	
	
	public PageAction(WebDriver driver) {
		this.driver=driver;
		 pl=new PageLocator(driver);
		 
		 
		 
	}
	/**this method is used to check username is enabled,displayed,If enabled or dieplayed the
	 * set the values to username testbox
	 * 
	 * @param username(String text to set in textbox)
	 * @return none
	 */
	public void enterUsername(String username) {
	WebElement ele=	pl.getUsername();
	if(ele!=null){
		if(WebTextbox.isEnable(ele)){
			WebTextbox.sendInput(ele, username);
		}
	}

	}
	
	public void enterPassword(String password) {
		WebElement ele=	pl.getPassword();
		if(ele!=null){
			if(WebTextbox.isEnable(ele)){
				WebTextbox.sendInput(ele, password);
			}
		}

		}
	public void clickButton() {
		WebElement ele=	pl.getButton();
		if(ele!=null){
			if(WebTextbox.isEnable(ele)){
				WebButton.clickButton(ele);
			}
		}

		}
	

}
