package commenPackage;

import org.openqa.selenium.WebElement;

public class WebTextbox {
	/**
	 * This method is send input to textbox
	 * @param ele
	 * @param input
	 * return none
	 */
	
	public static void sendInput(WebElement ele,String input) {

		ele.sendKeys(input);

	}
	/**
	 * This method is used to take text from textBox
	 * @param ele
	 * @return String
	 */
	
	public static String getText(WebElement ele) {
		return ele.getText();
		
	}
	/**
	 * this method is used to clear your textbox
	 * @param ele
	 */
	
	public static void clearText(WebElement ele) {
		ele.clear();

	}
	/**
	 * this method is used to check presence of textbox
	 * @param ele
	 * @return boolean
	 */
	public static boolean isDisplay(WebElement ele) {
		return ele.isDisplayed();

	}
	/**
	 * this method is used to check textbox is enable or not
	 * @param ele
	 * @return boolean
	 */
	public static boolean isEnable(WebElement ele) {
		return ele.isEnabled();

	}

}
