package testcases.gautam;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class GT_Testcase_01 extends CommonMethods {

	@Test
	public void shoppingOption() {
		getDriver();
		hoverOverMouse(hp.men);
		hoverOverMouse(hp.topInMen);
		click(hp.teesInTopInMen);
		clickOnMenuBar(ip.leftBarMenu, getProperty("Gautam_TestCase_02_LeftBar_Option3"));
		clickOnMenuBar(hp.ListOptions, getProperty("Gautam_TestCase_01_Price_Range"));
		Assert.assertTrue(priceRangeCompare(getPriceList(ip.listItemWithPriceOptions),
				getProperty("Gautam_TestCase_01_Min"), getProperty("Gautam_TestCase_01_Max")));

	}

}
