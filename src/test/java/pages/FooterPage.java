package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class FooterPage {
	
	public FooterPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='footer content']/div/div/ul/li[3]/a")
	public WebElement contactUsLink;
	
	@FindBy(xpath = "//*[@href=\"https://softwaretestingboard.com/subscribe/\"]")
	public WebElement subscribeToMailingLink;
	
	@FindBy(xpath = "//div[@id='mce-success-response']")
	public WebElement textStatusSubsribe;
	
	@FindBy(xpath = "//div[@class='mce_inline_error']")
	public WebElement textElement;
	
	
}
