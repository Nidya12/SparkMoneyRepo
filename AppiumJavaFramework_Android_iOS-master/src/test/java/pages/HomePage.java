package pages;

import driver.AppDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private By greetingHeader;

	public HomePage() {
		if (AppDriver.getCurrentDriver() instanceof AndroidDriver) {
			greetingHeader = AppiumBy.id("com.dvaramoney.spark:id/greetingText");
		} else if (AppDriver.getCurrentDriver() instanceof IOSDriver) {
			greetingHeader = AppiumBy.id("container header");
		}
	}

	public boolean waitForGreetingText() {

		return waitForElement(greetingHeader).isDisplayed();

	}

}
