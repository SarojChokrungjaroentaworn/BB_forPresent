package testcases.zach;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class Zach_TestCase extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void gearPage() {
		click(hp.gear);
		Assert.assertTrue(hp.gear.getText().contains(getProperty("Luma_TopBarMenuOption4")));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
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

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void FitnessEquipment() {
		hoverOverMouse(gp.Gear);
		hardWait(1);
		click(gp.FitnessEquipmentMenu);
		Assert.assertEquals(getDriver().getCurrentUrl(), getProperty("URL_For_FitnessEquipment"));
		hoverOverMouse(gp.SpriteFoamRoller);
		click(gp.AddSpriteFoamRollerToCart);
		Assert.assertTrue(compare(gp.SpriteRollerAddedToCartVerification.getText(),
				getProperty("SpriteFoamRoller_AddedToCart_Verification")));
		removeItem();
	}

}
