package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSellStock;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaSellStockTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void SellStock() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver) ;
		String userId = Excel.getData("Credentials", 0, 1);
		String pass = Excel.getData("Credentials", 1, 1);
		String pin = Excel.getData("Credentials", 2, 1);
		zerodhaLoginPage.EnterUserID(userId);
		zerodhaLoginPage.EnterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		Thread.sleep(3000);
		zerodhaLoginPage.enterPin(pin, driver);
		zerodhaLoginPage.clickOnContinue();
		ZerodhaSellStock zerodhaSellStock = new ZerodhaSellStock(driver) ;
		 zerodhaSellStock.enterSearch("ONGC");
		 zerodhaSellStock.clickOnONGC();
		 zerodhaSellStock.clickOnSell();
		 zerodhaSellStock.enterQuantity("10");
		 zerodhaSellStock.enterPrice("1970");
		 zerodhaSellStock.clickOnSell1();
	}
	@AfterMethod
	public void Screenshot() throws IOException {
		ScreenShot.takesScreenShot(driver, "Zerodha");
		
			
		
		
			
		



	
}
}
