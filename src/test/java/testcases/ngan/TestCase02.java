package testcases.ngan;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class TestCase02 extends CommonMethods {

	// Test Add to Compare function

	@Test
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

}
