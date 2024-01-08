package testcases.arad;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TC_02 extends CommonMethods{
	
	@Test
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

}
