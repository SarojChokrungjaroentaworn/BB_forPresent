package testcases.sirirat;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
//Search Refinement Mens t-shirts

@Listeners(ListensTestNG.class)

public class BBTC_01 extends CommonMethods {

	@Test
	public void searchRefinement() {

		getDriver(); // copy "key" from user data file
		sendKey(sp.searchTextBox, getProperty("Luma_SearchRefinement"));
		click(hp.MagnifyingGlass);
		scrollDown(500);
		takeScreenShot(getDriver());
		Assert.assertFalse(compareStringInList(ip.listItemWithName, getProperty("WomanItem_Name")));

	}

}
