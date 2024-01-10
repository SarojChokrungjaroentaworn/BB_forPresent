package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class Saroj_TestCase extends CommonMethods {

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

	@Test
	public void addItemtoCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(1);
//		waitForVisibility(ip.goToCart);
		click(ip.goToCart);
		hardWait(1);
		click(ip.editCart);
		hardWait(1);
		Assert.assertTrue(compareStringInListWithAttribute(ip.itemNameList,
				getProperty("ProductItemSelected_TestCase_02"), getProperty("AttributeTitle")));
	}

	@Test
	public void updateQuantityInCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(2);
//		waitForVisibility(ip.goToCart);
		click(ip.goToCart);
		click(scp.viewAndEditCart);
		sendText(scp.QTYBoxInviewAndEditcart, getProperty("QuantityUpdated_TestCase_03"));
		click(scp.updateShoppingCart);
		hardWait(2);
//		waitForVisibility(scp.qtyTextboxInShoppingcart);
		Assert.assertEquals(scp.qtyTextboxInShoppingcart.getAttribute("value"),
				getProperty("QuantityUpdated_TestCase_03"));
	}

}
