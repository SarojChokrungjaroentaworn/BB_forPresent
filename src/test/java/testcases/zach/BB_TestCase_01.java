package testcases.zach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BaseClass;
import utilities.CommonMethods;

public class BB_TestCase_01 extends CommonMethods {
	@Test
	public void gearPage() {
		click(hp.gear);
		Assert.assertTrue(hp.gear.getText().contains(getProperty("Luma_TopBarMenuOption4")));
	}
}
