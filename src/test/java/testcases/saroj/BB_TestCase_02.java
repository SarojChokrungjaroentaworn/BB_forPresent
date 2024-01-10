package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;

@Listeners(ListensTestNG.class)
public class BB_TestCase_02 extends CommonMethods {

	@Test
	public void addItemtoCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(1);
//		waitForVisibility(ip.goToCart);
		click(ip.goToCart);
		hardWait(1);
		click(ip.editCart);
		hardWait(1);
		Assert.assertTrue(compareStringInListWithAttribute(ip.itemNameList,
				getProperty("ProductItemSelected_TestCase_02"), getProperty("AttributeTitle")));
	}

}
