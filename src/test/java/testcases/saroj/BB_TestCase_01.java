package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;

@Listeners(ListensTestNG.class)
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
		softWait();
		click(ip.goToCart);
//		hardWait(2);
		waitForVisibility(ip.itemInCartName);
		Assert.assertEquals(ip.itemInCartName.getText(), getProperty("ItemAddedToCart_TestCase_01"));
//		hardWait(2);
		waitForVisibility(scp.trash);
		click(scp.trash);
		click(scp.okToDeleteItem);
		Assert.assertTrue(compare(ip.emptyCart.getText(), getProperty("EmptyCart_TestCase_01")));

	}

}
