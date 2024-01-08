package testcases.arad;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class Arad_TestCase extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyQuantityLimitPerPage() {

		hoverOverMouse(hp.women);
		hoverOverMouse(hp.topOptionInWoman);
		click(hp.brasAndTankOptionInWoman);
		clickOnMenuBar(ip.limitPerPageList, getProperty("LimitPerPageOption2"));
		Assert.assertEquals(getAmountItemFromList(ip.brasAndTanksItemList),
				changeStringToInt(getProperty("ExpectAmountForVerifyQuantityLimitPerPage")));

	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void maximumPurchaseItem() {

		hoverOverMouse(hp.women);
		hoverOverMouse(hp.topOptionInWoman);
		click(hp.brasAndTankOptionInWoman);
		clickOnMenuBar(ip.brasAndTanksItemList,getProperty("BrasAndTank_FirstItem"));
		click(ip.sizeM);
		click(ip.colorPurple);
		sendText(ip.qtyTextBox,getProperty("Amount_maximumPurchaseItem"));
		click(ip.addToCart);
		Assert.assertTrue(compare(ip.alertMessage.getText(),getProperty("ErrorMessage_maximumPurchaseItem")));
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void inputQtyLessThanMaximum() {

		hoverOverMouse(hp.women);
		hoverOverMouse(hp.topOptionInWoman);
		click(hp.brasAndTankOptionInWoman);
		clickOnMenuBar(ip.brasAndTanksItemList,getProperty("BrasAndTank_FirstItem"));
		click(ip.sizeM);
		click(ip.colorPurple);
		sendText(ip.qtyTextBox,getProperty("EnableAmount_PurchaseItem"));
		click(ip.addToCart);
		hardWait(2);
		click(ip.goToCart);
		Assert.assertTrue(compare(scp.qtyTextBox.getAttribute("value"),"7914"));
		hardWait(2);
		removeItem();
	}

}
