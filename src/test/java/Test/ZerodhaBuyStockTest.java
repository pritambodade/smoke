package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaStockBuy;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaBuyStockTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openBrowser("hhtps://kite.zerodha.com/");
}
	@Test
	public void BuyStock() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId = Excel.getData("Credentials", 0, 1);
		String pass = Excel.getData("Credentials", 1, 1);
		String pin = Excel.getData("Credentials", 2, 1);
		zerodhaLoginPage.EnterUserID(userId);
		zerodhaLoginPage.EnterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		Thread.sleep(3000);
		zerodhaLoginPage.enterPin(pin, driver);
		ZerodhaStockBuy zerodhaBuystock = new ZerodhaStockBuy(driver);
		zerodhaBuystock.enterSearch("TATACOFFEE");
		zerodhaBuystock.clickOnTataCoff();
		zerodhaBuystock.clickOnBuy();
		zerodhaBuystock.enterQuantity("10");
		zerodhaBuystock.enterPrice("198");
		zerodhaBuystock.clickOnBuy();
	}
	@AfterMethod
	public void Screenshot() throws IOException {
		ScreenShot.takesScreenShot(driver, "Zerodha");
		
		
		
		
		
		
		
		
		
		
		
	}
}