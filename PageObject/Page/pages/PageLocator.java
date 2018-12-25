package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLocator {
	
	public WebDriver driver=null;
	/**constructor to set current driver to this class driver
	 * 
	 * @param driver
	 * @return none
	 */
	public PageLocator(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	@FindBy (xpath="//*[@id='loginForm']/input[1]")
	private WebElement username;
	/**this getmethod is used to access username in action class for further actions
	 * 
	 * @return
	 */
	
	public WebElement getUsername() {
		return username;
		
	}
	@FindBy (xpath="//*[@id='loginForm']/input[2]")
			private WebElement password;
	public WebElement getPassword() {
		return password;
	}
   @FindBy (xpath="//*[@id='loginForm']/input[3]")
	private WebElement button;
   public WebElement getButton() {
	return button;
}
	
}
