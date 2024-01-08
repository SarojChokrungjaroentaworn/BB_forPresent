package testcases.arad;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TC_03 extends CommonMethods{
	
	@Test
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
