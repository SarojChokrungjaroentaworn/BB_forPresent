package testcases.zach;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class BB_TestCase_03 extends CommonMethods {
	@Test
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
