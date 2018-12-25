package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import helperPackage.BrowserConfiguration;
import utility.TestBase;

public class PageTest extends TestBase { 
	public BrowserConfiguration br;
	
	
	public PageTest() {
	
		 
	      br=new BrowserConfiguration();
	      TestBase ul=new TestBase();

	}
 @Test
  public void loginPage() {
	 PageVerification pv=new PageVerification(driver);
	 pv.verifyLogin(br.getUserName(), br.getPassword());
	 String Pagetitle=driver.getTitle();
	 Assert.assertEquals(Pagetitle, "#1 Free CRM software in the cloud for sales and service");

  }
@Test(priority=1)
public void userName() {
	PageVerification pv=new PageVerification(driver);
	pv.verifyUsername(br.getUserName());

}
/**
 * This method is used to enabled Boolean condition to skipped the @Test method
 */

@Test(enabled=false)
public void password() {
	PageVerification pv=new PageVerification(driver);
	pv.verifyUsername(br.getPassword());

}
@Test(priority=3)
public void button() {
	PageVerification pv=new PageVerification(driver);
	pv.verifyButton();
	String Pagetitle=driver.getTitle();
	Assert.assertEquals(Pagetitle, "#1 Free CRM software in the cloud for sales and service");

}

}
