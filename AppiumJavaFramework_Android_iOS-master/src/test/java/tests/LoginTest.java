package tests;

import base.BaseTest;
import driver.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AppPermissionPage;
import pages.HomePage;
import pages.LanguagePage;
import pages.LoginPage;
import pages.HomePage;

public class LoginTest extends BaseTest {
	LanguagePage langPage;
	AppPermissionPage appPermissionPage;
    HomePage homePage;
    LoginPage loginPage;
    @BeforeClass
    public void setup(){
    	
        langPage = new LanguagePage();
        appPermissionPage = new AppPermissionPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }
   
    
    @Test
    public void vaidLoginTest(){
 
         langPage.clickNext();
         appPermissionPage.grantPermission();
         loginPage.navigateToLogin();
         Assert.assertTrue(homePage.waitForGreetingText());
    }
   



}
