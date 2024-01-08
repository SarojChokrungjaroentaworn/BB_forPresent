package testcases.saroj;

import org.testng.Assert;

import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TestCase_01 extends CommonMethods {

	@Test
	public void removeItemfromCart() {
		sendKey(hp.searchTextBox, getProperty("ItemAddedToCart_TestCase_01"));
		hoverOverMouse(hp.MagnifyingGlass);
		click(hp.MagnifyingGlass);
		click(ip.montanaWindJacketItem2);
		click(ip.sizeS);
		click(ip.colorblack);
		click(ip.addToCartButton);
		hardWait(1);
		click(ip.goToCart);
		Assert.assertTrue(compare(ip.itemInCartName.getText(), getProperty("ItemAddedToCart_TestCase_01")));
		hardWait(1);
		click(scp.trash);
		click(scp.okToDeleteItem);
		Assert.assertTrue(compare(ip.emptyCart.getText(), getProperty("EmptyCart_TestCase_01")));

	}

}
