package testcases.ngan;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class Ngan_TestCase extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void logoTesting() {
		click(hp.whatnew);
		click(hp.logo);
		click(hp.sale);
		click(hp.logo);
		Assert.assertEquals(getDriver().getCurrentUrl(), getProperty("ExpectedURL_Logo"));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void addToCompare() {
		sendKey(hp.searchTextBox, getProperty("ItemAddedToCart_TestCase_01"));
		hoverOverMouse(hp.MagnifyingGlass);
		click(hp.MagnifyingGlass);
		click(ip.montanaJacket);
		click(ip.addToCompareButton);
		click(ip.comparisonList);
		hardWait(1);
		Assert.assertTrue(compareStringInList(ap.addToCompareList, getProperty("ItemAddedToCart_TestCase_01")));

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void addToWishList() {

		sendKey(hp.searchTextBox, getProperty("ItemAddedToWishList"));
		hoverOverMouse(hp.MagnifyingGlass);
		click(hp.MagnifyingGlass);
		click(ip.heroHoodie);
		click(ip.addToWishListButton);
		hardWait(1);
		Assert.assertTrue(compareStringInList(ap.myWishList, getProperty("ItemAddedToWishList")));

	}

}
