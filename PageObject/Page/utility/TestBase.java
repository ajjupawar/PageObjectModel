package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import helperPackage.BrowserConfiguration;

public class TestBase{
	public WebDriver driver=null;
	BrowserConfiguration brCon;
	/**This constructor is used to initilise  the {@link BrowserConfiguration}
	 * 
	 */
	public TestBase() {
		brCon=new BrowserConfiguration();
	}
	
 
  @BeforeMethod
  public void launch() {
	 
	  String brName=brCon.getProperties();
	  if (brName.equals("Chrome")) {
	  System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
	  }else {
		  System.setProperty("webdriver.gecko.driver","E:\\SeleniumDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/login.cfm");
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
