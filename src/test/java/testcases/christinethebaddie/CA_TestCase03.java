package testcases.christinethebaddie;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class CA_TestCase03 extends CommonMethods {

	@Test
	public void requiredFieldAlert() throws InterruptedException {

		// Simulating a click on the subscribe link
		click(fp.subscribeToMailingLink);

		// Using Assert to ensure the test is executed for the correct page.
		String expectedUrl = "https://softwaretestingboard.com/subscribe/";
		String actualUrl = getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "The URL is not correct, byeee!!!");

		// Simulating a clicks on the 'Email Address' field and 'Subscribe' button
		click(subp.emailAddressTextBox);
		click(subp.subscribeButton);

		// Locating the alert text by x-path then storing it into textElement to compare
		// by using Assert
		String actualText = fp.textElement.getText();
		String expectedText = "This field is required.";
		Assert.assertEquals(actualText, expectedText, "Text verification failed.");

	}
}
