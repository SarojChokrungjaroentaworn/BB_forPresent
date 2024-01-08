package testcases.christinethebaddie;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CommonMethods;

public class CA_TestCase01 extends CommonMethods {

	@Test
	public void ContactUsLinkVerification() {
		
		// Clicking on the 'Contact Us' link
		click(fp.contactUsLink);

		// Making sure the redirection is to the intended page with Asssssert
		String expectedUrl = "https://softwaretestingboard.com/contact/";
		String actualUrl = getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "The URL is not correct!!!");
	
	}
	
}