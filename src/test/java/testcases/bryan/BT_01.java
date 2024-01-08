package testcases.bryan;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BT_01 extends CommonMethods {

	@Test
	public void checkOut() {
		getDriver();
		sendKey(sp.searchTextBox, getProperty("Checkout_TestCase_01"));
		click(hp.MagnifyingGlass);
		click(ip.montanaWindJacketItem2);
		click(ip.sizeS);
		click(ip.colorblack);
		click(ip.addToCartButton);
		hardWait(2);
		click(ip.goToCart);
		click(scp.proceedCheckOut);
		hardWait(1);
		click(scp.addNewAddress);
		sendText(shp.firstName, "abc");
		sendText(shp.lastName, "def");
		sendKey(shp.streetAddress, "xyz");
		sendKey(shp.city, "PPP");
		clickOnMenuBar(shp.regionIDList, "Virginia");
		sendKey(shp.zipCode, "12345");
		clickOnMenuBar(shp.countryList, "United States");
		sendKey(shp.phoneNumber, "2021234567");
		click(shp.shipHereButton);
		hardWait(1);
		click(shp.nextButton);
		hardWait(1);
		click(shp.shippingAndBillingIsSame);
		Assert.assertTrue(
				compare(shp.shippingAddressDetail.getText(), getProperty("Checkout_TestCase_01_ExpectedResult")));
		removeItem();
	}
}
