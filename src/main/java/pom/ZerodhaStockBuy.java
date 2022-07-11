package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaStockBuy {
	@FindBy(xpath="//input[@icon='search']")private WebElement searchbox;
	@FindBy(xpath = "//span[text()='TATACOFFEE']") private WebElement tataCoff;
	@FindBy(css="[class='button-blue buy']")private WebElement buy;
	@FindBy(xpath="//label[@for='radio-3780']")private WebElement bse;
	@FindBy(xpath="//label[@for='radio-3781']")private WebElement nse;
	@FindBy(xpath="//label[@for='radio-3788']")private WebElement intraday;
	@FindBy(xpath="//input[@type='number'])[1]")private WebElement qty;
	@FindBy(xpath="//input[@type='number'])[2]")private WebElement price;
	@FindBy(xpath = "//label[@for='radio-3794']")private WebElement market;
	@FindBy(xpath="//label[@for='radio-3795']")private WebElement limit;
	@FindBy(xpath="//label[@id='radio-3797']")private WebElement SL;
	@FindBy(xpath="//label[@id='radio-3798']")private WebElement SLM;
	@FindBy(xpath="//span[text()='More options']")private WebElement moreOption;
	@FindBy(xpath="//span[@class='su-checkbox-value'][2]")private WebElement target;
	@FindBy(xpath="//a[@data-balloon='Refresh']")private WebElement refresh;
	@FindBy(xpath="//button[@type='submit']")private WebElement bye;
	@FindBy(xpath="//button[@class='button-outline cansel']")private WebElement cansel;
	
	public ZerodhaStockBuy (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterSearch(String name) {
		searchbox.sendKeys(name);
		searchbox.sendKeys(Keys.ENTER);
	}
	public void clickOnTataCoff() throws InterruptedException {
    tataCoff.click();
    Thread.sleep(3000);
	}
	public void clickOnBuy() throws InterruptedException {
		buy.click();
		Thread.sleep(3000);
	}
	public void enterQuantity(String qun) {
		qty.sendKeys(qun);
	}
	public void enterPrice(String Price) {
		price.sendKeys(Price);
	}
	public void clickOnMarket() {
		market.click();
	}
	public void clickOnLimit() {
		limit.click();
	}
	public void clickOnSl() {
		SL.click();
	}
	public void clickOnSlm() {
		SLM.click();
	}
	public void clickOnmoreOption() {
		moreOption.click();
	}
	public void clickOnRefresh() {
		refresh.click();
	}
	public void clickOnBye() {
		bye.click();
	}
	public void clickOnCansel() {
		cansel.click();
	}
	

}
