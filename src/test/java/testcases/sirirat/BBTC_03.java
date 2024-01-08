package testcases.sirirat;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

// Ad Redirection 

public class BBTC_03 extends CommonMethods {

	@Test
	public void sortFunction() {

		// click Woman menu
		click(hp.women);
		// click Top menu
		click(hp.topInWoman);
		// click sort by price
		click(ip.sortByPrice);
		// compare price after we ascending sort by price
		Assert.assertTrue(isAscendingOrder(getPriceList(ip.listItemAfterSort)));

	}
}
