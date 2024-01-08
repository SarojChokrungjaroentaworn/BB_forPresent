package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TestCase_02 extends CommonMethods{
	
	@Test
	public void addItemtoCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList,getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(2);
		click(ip.goToCart);
		Assert.assertTrue(
				ip.itemInCartName.getText().contains(getProperty("ProductItemSelected_TestCase_02")));
		removeItem();
	}

}
