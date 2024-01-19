package pages;

import driver.AppDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	private By txtBoxMobileNo;
	private By btnProceed;
	private By btnVerifyWithSMS;
	private By txtBoxOTP;
	private By btnVerify;

	HomePage homePage = new HomePage();
	
	public LoginPage() {

		if (AppDriver.getCurrentDriver() instanceof AndroidDriver) {
			btnProceed = AppiumBy.id("com.dvaramoney.spark:id/btn_login");
			txtBoxMobileNo = AppiumBy.id("com.dvaramoney.spark:id/et_mobile");
			btnVerifyWithSMS = AppiumBy.id("com.dvaramoney.spark:id/btn_verifySms");
			txtBoxOTP = AppiumBy.id("com.dvaramoney.spark:id/et_otp");
			btnVerify = AppiumBy.id("com.dvaramoney.spark:id/btn_verify");
		} else if (AppDriver.getCurrentDriver() instanceof IOSDriver) {
			btnProceed = AppiumBy.id("");
			txtBoxMobileNo = AppiumBy.id("");
			btnVerifyWithSMS = AppiumBy.id("");
		}

	}

	public HomePage navigateToLogin() {
		waitNclick(txtBoxMobileNo);
		type(txtBoxMobileNo, "9740633410");
    	((PressesKey) AppDriver.getCurrentDriver()).pressKey(new KeyEvent(AndroidKey.BACK));
		waitNclick(btnProceed);
		waitNclick(btnVerifyWithSMS);
		//waitNclick(txtBoxMobileNo);
		
		waitNtype(txtBoxOTP, "9999");
		waitNclick(btnVerify);
		return homePage;
	}

}
