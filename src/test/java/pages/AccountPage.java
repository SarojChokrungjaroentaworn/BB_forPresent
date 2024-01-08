package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AccountPage {
	
	public AccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//button[@tabindex='-1']")
	public WebElement customerMenu;
	
	@FindBy(xpath="//div[@class='customer-menu']/ul/li")
	public List<WebElement> customerMenuOptions;
	
	@FindBy(xpath="//ol[@class='product-items']/li//strong[@class='product-item-name']")
	public List<WebElement> myWishList;
	
	
	@FindBy(xpath="//td[@class='cell product info']//strong[@class='product-item-name']")
	public List<WebElement> addToCompareList;
	

	
}
