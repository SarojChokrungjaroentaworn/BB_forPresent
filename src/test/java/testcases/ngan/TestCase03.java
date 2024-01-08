package testcases.ngan;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class TestCase03 extends CommonMethods {

	// Test AD ITEM TO WISH LIST function

	@Test
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
