package testcases.arad;
 
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TC_01 extends CommonMethods {

	@Test
	public void verifyQuantityLimitPerPage() {
	
		hoverOverMouse(hp.women);
		hoverOverMouse(hp.topOptionInWoman);
		click(hp.brasAndTankOptionInWoman);
		clickOnMenuBar(ip.limitPerPageList, getProperty("LimitPerPageOption2"));
		Assert.assertEquals(getAmountItemFromList(ip.brasAndTanksItemList), changeStringToInt(getProperty("ExpectAmountForVerifyQuantityLimitPerPage")));

	}

}
