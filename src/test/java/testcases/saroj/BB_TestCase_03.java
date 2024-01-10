package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;

@Listeners(ListensTestNG.class)
public class BB_TestCase_03 extends CommonMethods {

	@Test
	public void updateQuantityInCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(2);
//		waitForVisibility(ip.goToCart);
		click(ip.goToCart);
		click(scp.viewAndEditCart);
		sendText(scp.QTYBoxInviewAndEditcart, getProperty("QuantityUpdated_TestCase_03"));
		click(scp.updateShoppingCart);
		hardWait(2);
//		waitForVisibility(scp.qtyTextboxInShoppingcart);
		Assert.assertEquals(scp.qtyTextboxInShoppingcart.getAttribute("value"),
				getProperty("QuantityUpdated_TestCase_03"));
	}

}
