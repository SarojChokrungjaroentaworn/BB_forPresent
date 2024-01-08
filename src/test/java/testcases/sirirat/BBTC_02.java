package testcases.sirirat;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;

@Listeners(ListensTestNG.class)
public class BBTC_02 extends CommonMethods {

	@Test
	public void caseSensitivity() {

		getDriver();
		sendKey(sp.searchTextBox, getProperty("Luma_SearchCaseSensitivity"));
		click(hp.MagnifyingGlass);
		Assert.assertTrue(compareStringInList(ip.listItemWithName, getProperty("WomanBag_Item")));

	}

}
