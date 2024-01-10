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
		hardWait(2);
		click(scp.viewAndEditCart);
		int beforeDelete = getAmountItemFromList(scp.itemList);
		click(scp.deleteFirstItem);
		int afTerDelete = getAmountItemFromList(scp.itemList);
		Assert.assertEquals(beforeDelete - 1, afTerDelete);

	}

}
