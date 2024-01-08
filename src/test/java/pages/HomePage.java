package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@class='header links']/li/a")
	public List<WebElement> header;

	@FindBy(xpath = "//button[@class='action switch']")
	public WebElement headerButton;

	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchTextBox;

	@FindBy(xpath = "//button[@title='Search']")
	public WebElement MagnifyingGlass;

	@FindBy(xpath = "//ul[@id='ui-id-2']/li")
	public List<WebElement> topBarMenu;

	@FindBy(xpath = "//ul[@class='level0 submenu ui-menu ui-widget ui-widget-content ui-corner-all']/li")
	public List<WebElement> subTopBarMenu;

	@FindBy(xpath = "//a[@id=\"ui-id-6\"]")
	public WebElement gear;
	   
	@FindBy(xpath = "//*[@id='ui-id-11']")
	public WebElement JacketsInTops;
	
	@FindBy(xpath = "//a[@id='ui-id-5']")
	public WebElement men;
	
  // Women
	@FindBy(xpath = "//*[@id='ui-id-4']")
	public WebElement women;

	@FindBy(xpath = "//a[@id='ui-id-17']")
	public WebElement topInMen;

	@FindBy(xpath = "//a[@id='ui-id-21']")
	public WebElement teesInTopInMen;

	@FindBy(xpath = "//div[@class='filter-options']/div[3]")
	public WebElement priceOptions;

	@FindBy(xpath = "//div[@class='filter-options']/div[2]")
	public WebElement sizeOptions;

	@FindBy(xpath = "//*[@id='narrow-by-list']/div[2]/div[2]/div/div/a[2]/div")
	public WebElement sizeSInOptionMenu;

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[3]/div[2]/ol/li[1]/a")
	public WebElement firstPriceOptions;

	@FindBy(xpath = "//ol[@class='items']/li")
	public List<WebElement> ListOptions;

	// Women SubTops
	@FindBy(xpath = "//dl[@id='narrow-by-list2']//ol/li[1]")
	public WebElement womenSubMunuTop;

	@FindBy(xpath = "//*[@id='ui-id-9']")
	public WebElement topOptionInWoman;

	@FindBy(xpath = "//*[@id='ui-id-14']")
	public WebElement brasAndTankOptionInWoman;

	@FindBy(xpath = "//dl[@id='narrow-by-list2']//ol/li[1]/a")
	public WebElement topInWoman;

	// Ngan
	@FindBy(xpath = "//*[@id=\"ui-id-3\"]")
	public WebElement whatnew;

	@FindBy(xpath = "//*[@id=\"ui-id-8\"]")
	public WebElement sale;

	@FindBy(xpath = "//a[@class='logo']")
	public WebElement logo;

	// Dilnaz
	@FindBy(xpath = "//ul[@class='footer links']/li/a")
	public List<WebElement> footerRightMenu;

	@FindBy(xpath = "//div[@class='footer content']//div[@class='widget block block-static-block']//li/a")
	public List<WebElement> footerLeftMenu;

}
