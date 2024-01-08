package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShippingPage {

	public ShippingPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@name='street[0]']")
	public WebElement streetAddress;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;

	@FindBy(xpath = "//select[@id='O83E2KK']")
	public WebElement regionID;

	@FindBy(xpath = "//select[@class='select']/option")
	public List<WebElement> regionIDList;

	@FindBy(xpath = "//select[@class='select']/option[62]")
	public WebElement virginia;

	@FindBy(xpath = "//input[@name='postcode']")
	public WebElement zipCode;

	@FindBy(xpath = "//select[@name='country_id']/option")
	public List<WebElement> countryList;

	@FindBy(xpath = "//input[@name='telephone']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']//button[@type='submit']/span")
	public WebElement nextButton;

	@FindBy(xpath = "//table[@class='table-checkout-shipping-method']/tbody/tr")
	public List<WebElement> shippingMethod;

	@FindBy(xpath = "//table[@class='table-checkout-shipping-method']/tbody/tr[1]")
	public WebElement shippingMethodTableRate;
	
	@FindBy(xpath = "//footer[@class='modal-footer']/button[@class='action primary action-save-address']")
	public WebElement shipHereButton;
	
	@FindBy(xpath = "//input[@id='billing-address-same-as-shipping-checkmo']")
	public WebElement shippingAndBillingIsSame;
	
	@FindBy(xpath = "//div[@class='billing-address-details']")
	public WebElement shippingAddressDetail;

}
