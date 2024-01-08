package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SearchPage {
	
	public SearchPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
	
	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchTextBox;
	
	@FindBy(xpath = "//[@id='maincontent']/div/h1/span")
    public WebElement searchResults;
	
    @FindBy(xpath = "//[@class='products wrapper grid products-grid']/ol/li[2]/div/div[1]/strong/a")
    public WebElement womensBag;
	
	}
	
	

