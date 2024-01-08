package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BB_TestCase_03 extends CommonMethods {

	@Test
	public void updateQuantityInCart() {
		clickOnMenuBar(hsp.hotSellerWidgetList, getProperty("ProductItemSelected_TestCase_02"));
		click(ip.sizeS);
		click(ip.colorblue);
		click(ip.addToCartButton);
		hardWait(2);
		click(ip.goToCart);
		click(scp.viewAndEditCart);
		sendText(scp.QTYBoxInviewAndEditcart, getProperty("QuantityUpdated_TestCase_03"));
		click(scp.updateShoppingCart);
		hardWait(2);
		Assert.assertTrue(scp.subTotal.getText().contains(getProperty("ConfirmQty_TestCase_03")));
		removeItem();
	}

}
