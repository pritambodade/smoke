package pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZerodhaHomePage {
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement> share;
    @FindBy(xpath="//button[@class='button-blur-buy']")private WebElement watchListBuy;
}
