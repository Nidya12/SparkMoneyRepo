package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.AppDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AppPermissionPage extends BasePage{

	
	 LoginPage loginPage = new LoginPage();
	 
	    @AndroidFindBy(id = "com.dvaramoney.spark:id/btn_deny")
	    @iOSXCUITFindBy(accessibility = "com.dvaramoney.spark:id/btn_deny")
	    private WebElement btnDenyPermission;

	    private By btnGrantPermission;
	    private By linkAllowPermissionPopUp;
	    private By linkAllowCallPermissionPopUp;
	    private By linkNoneOftheAbove;
	    
	    public AppPermissionPage() {
	        if (AppDriver.getCurrentDriver() instanceof AndroidDriver) {
	        	btnGrantPermission = AppiumBy.id("btn_grant");
	        	linkAllowPermissionPopUp = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	        	linkAllowCallPermissionPopUp =AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button");
	        	linkNoneOftheAbove =AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.google.android.gms:id/cancel\"]");
	        } else if (AppDriver.getCurrentDriver() instanceof IOSDriver) {
	        	linkAllowPermissionPopUp = AppiumBy.id("");
	        	linkAllowCallPermissionPopUp =AppiumBy.id("");
	        }
	    }
	    
	    
	    public LoginPage grantPermission() {
	    	waitNclick(btnGrantPermission);
	    	waitNclick(linkAllowPermissionPopUp);
	    	waitNclick(linkAllowPermissionPopUp);
	    //	waitNclick(linkAllowCallPermissionPopUp);
	    	waitNclick(linkAllowCallPermissionPopUp);
	    	waitNclick(linkAllowCallPermissionPopUp);
	    	waitNclick(linkNoneOftheAbove);
	          return loginPage;
	    }
}
