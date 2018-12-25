package pages;

import org.openqa.selenium.WebDriver;

public class PageVerification {
	public WebDriver driver=null;
    public PageAction pa;
    /**this constructor is used to set current class driver to this class driver
     * 
     * @param driver
     */
    public PageVerification(WebDriver driver) {
	this.driver=driver;
	pa=new PageAction(driver);
	}
    public void verifyUsername(String username) {
		pa.enterUsername(username);

	}
    public void verifyPassword(String password) {
		pa.enterPassword(password);

	}
    public void verifyButton() {
		pa.clickButton();

	}
    public void verifyLogin(String username,String password) {
		verifyUsername(username);
		verifyPassword(password);
		verifyButton();

	}
}
