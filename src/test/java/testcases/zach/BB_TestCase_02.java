package testcases.zach;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CommonMethods;

public class BB_TestCase_02 extends CommonMethods {
	@Test
	public void bagPage() {
		click(hp.gear);
		hoverOverMouse(gp.Gear);
		hardWait(1);
		click(gp.Bags);
		hoverOverMouse(gp.DrivenBackpack);
		click(gp.AddToCart);
		hardWait(1);
		click(ip.goToCart);
		Assert.assertTrue(compare(ip.itemInCartName.getText(), getProperty("ItemName_BagPage")));
		removeItem();
	}
}
