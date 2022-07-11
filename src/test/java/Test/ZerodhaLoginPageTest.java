package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		driver =Browser.openBrowser("hhtps://kite.zerodha.com/");
	}
	@Test
	
	public void loginTest() throws InterruptedException, EncryptedDocumentException, IOException {
    	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	
	String userId = Excel.getData("Credentials", 0, 1); 
	String pass = Excel.getData("Credentials", 1, 1);
	String pin =Excel.getData("Credentials", 2, 1);
	zerodhaLoginPage.EnterUserID(userId);
	zerodhaLoginPage.EnterPassword(pass);
	zerodhaLoginPage.clickOnLogin();
    zerodhaLoginPage.enterPin(pin, driver);
    zerodhaLoginPage.clickOnContinue();
	
	

}
}