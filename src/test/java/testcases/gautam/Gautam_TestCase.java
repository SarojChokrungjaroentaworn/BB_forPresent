package testcases.gautam;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)

public class Gautam_TestCase extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
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

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void shoppingMultipleOptions() {
		getDriver();
		hoverOverMouse(hp.men);
		hoverOverMouse(hp.topInMen);
		click(hp.teesInTopInMen);
		clickOnMenuBar(ip.leftBarMenu, getProperty("Gautam_TestCase_02_LeftBar_Option2"));
		click(ip.sizeSInLeftBarMenu);
		clickOnMenuBar(ip.leftBarMenu, getProperty("Gautam_TestCase_02_LeftBar_Option3"));
		clickOnMenuBar(hp.ListOptions, getProperty("Gautam_TestCase_02_Price_Range"));
		clickOnMenuBar(ip.leftBarMenu, getProperty("Gautam_TestCase_02_LeftBar_Option5"));
		click(ip.everCool);
		takeScreenShot(getDriver());
		Assert.assertTrue(compareStringInList(ip.nowShoppingByList, getProperty("Gautam_TestCase_02_Text_Check")));

	}

}
