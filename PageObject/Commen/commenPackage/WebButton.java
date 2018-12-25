package commenPackage;

import org.openqa.selenium.WebElement;

public class WebButton {
	/**
	 * This method is used to click the button
	 * @param ele
	 * @param input
	 * return none
	 */
	
	public static void clickButton(WebElement ele) {

		ele.click();

	}
	/**
	 * this method is used to check presence of button
	 * @param ele
	 * @return boolean
	 */
	public static boolean isDisplay(WebElement ele) {
		return ele.isDisplayed();

	}
	/**
	 * this method is used to check button is enable or not
	 * @param ele
	 * @return boolean
	 */
	public static boolean isEnable(WebElement ele) {
		return ele.isEnabled();

	}

}
