package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SubscribePage {

	public SubscribePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailAddressTextBox;
	
	@FindBy(xpath = "//input[@id='mce-FNAME']")
	public WebElement firstNameTextBox;
	
	@FindBy(xpath = "//input[@id='mce-LNAME']")
	public WebElement lastNameTextBox;
	
	@FindBy(xpath = "//input[@id='mce-COMPANY']")
	public WebElement companyNameTextBox;
	
	@FindBy(xpath = "//input[@id='mce-POSITION']")
	public WebElement positionTextBox;
	
	@FindBy(xpath = "//input[@id='mc-embedded-subscribe']")
	public WebElement subscribeButton;
	
}
