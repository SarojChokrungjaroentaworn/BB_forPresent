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
	
	@FindBy(xpath="//ul[@class='nav items']/li")
	public List<WebElement> leftMenu;
	
	@FindBy(xpath="//ul[@class='nav items']/li[7]/a")
	public WebElement accountInformation;
	
	@FindBy(xpath="//ul[@class='nav items']/li[2]/a")
	public WebElement myOrder;
	
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement accountInformationFirstNameTextBox;
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement accountInformationLastNameTextBox;
	
	@FindBy(xpath="//div[@class='column main']//button[@type='submit']")
	public WebElement accountInformationSaveButton;
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	public WebElement accountInformationSaveButton2;
	
	@FindBy(xpath="//table[@id='my-orders-table']//tbody/tr[1]/td")
	public List<WebElement> firstPreviousOrder;
	
	
	
}
