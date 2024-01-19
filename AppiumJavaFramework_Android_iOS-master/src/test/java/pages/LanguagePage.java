package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LanguagePage extends BasePage{
	
	 AppPermissionPage permissionPage = new AppPermissionPage();
	 
	    @AndroidFindBy(id = "com.dvaramoney.spark:id/languageName")
	    @iOSXCUITFindBy(accessibility = "com.dvaramoney.spark:id/languageName")
	    private WebElement textLanguage;

	    @AndroidFindBy(id = "btnNext")
	    @iOSXCUITFindBy(id = "btnNext")
	    private WebElement btnNext;
	 

	    public AppPermissionPage clickNext() {
	          btnNext.click();
	          return permissionPage;
	    }


}
