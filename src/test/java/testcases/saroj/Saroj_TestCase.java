package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class Saroj_TestCase extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void removeItemfromCart() {
		sendKey(hp.searchTextBox, getProperty("ItemAddedToCart_TestCase_01"));
		hoverOverMouse(hp.MagnifyingGlass);
		click(hp.MagnifyingGlass);
		click(ip.montanaWindJacketItem2);
		click(ip.sizeS);
		click(ip.colorblack);
		click(ip.addToCartButton);
		hardWait(2);
		click(ip.goToCart);
		Assert.assertEquals(ip.itemInCartName.getText(), getProperty("ItemAddedToCart_TestCase_01"));
		hardWait(2);
		click(scp.trash);
		click(scp.okToDeleteItem);
		Assert.assertEquals(ip.emptyCart.getText(), getProperty("EmptyCart_TestCase_01"));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void addItemtoCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(2);
		click(ip.goToCart);
		Assert.assertEquals(ip.itemInCartName.getText(), getProperty("ProductItemSelected_TestCase_02"));
		removeItem();
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void updateQuantityInCart() {
		click(hp.logo);
		click(hsp.radiantTee);
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(2);
		click(ip.goToCart);
		click(scp.viewAndEditCart);
		sendText(scp.QTYBoxInviewAndEditcart, getProperty("QuantityUpdated_TestCase_03"));
		click(scp.updateShoppingCart);
		hardWait(2);
		Assert.assertTrue(scp.subTotal.getText().contains(getProperty("ConfirmQty_TestCase_03")));
		removeItem();
	}

}
