package testcases.saroj;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class TestForMember extends CommonMethods{
	
	@Test
	public void testOnly() {
		getDriver();
		
//		click(fp.subscribeToMailingLink);
//		
//		String expectedUrl = "https://softwaretestingboard.com/subscribe/";
//		String actualUrl = getDriver().getCurrentUrl();
//		
//		Assert.assertEquals(actualUrl, expectedUrl, "The URL is not correct!!!");
//		
//		sendKey(subp.emailAddressTextBox, getProperty("email"));
//		sendKey(subp.firstNameTextBox, getProperty("firstName"));
//		sendKey(subp.lastNameTextBox, getProperty("lastName"));
//		sendKey(subp.companyNameTextBox, getProperty("companyName"));
//		sendKey(subp.positionTextBox, getProperty("Position"));
//		
//		click(subp.subscribeButton);
//		
//        System.out.println(fp.textStatusSubsribe.getText());
		sendKey(hp.searchTextBox, getProperty("ItemAddedToCartForTestCase_BB_TestCase_01"));
		hoverOverMouse(hp.MagnifyingGlass);
		click(hp.MagnifyingGlass);
		click(ip.montanaWindJacketItem2);
		click(ip.addToWishListButton);
		hardWait(1);
		Assert.assertTrue(compareStringInList(ap.myWishList,"Montana Wind Jacket"));
	
	}

}
