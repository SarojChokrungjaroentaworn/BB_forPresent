package testcases.christinethebaddie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListensTestNG.class)
public class Christine_TestCase extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void ContactUsLinkVerification() {

		// Clicking on the 'Contact Us' link
		click(fp.contactUsLink);

		// Making sure the redirection is to the intended page with Asssssert
		String expectedUrl = "https://softwaretestingboard.com/contact/";
		String actualUrl = getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "The URL is not correct!!!");
		getDriver().get(getProperty("url"));
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void subscribeSubmission() {

		// Simulating a click on the subscribe link
		click(fp.subscribeToMailingLink);

		// Using Assert to ensure the test is executed for the correct page.
		String expectedUrl = "https://softwaretestingboard.com/subscribe/";
		String actualUrl = getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "The URL is not correct, back it up!!!");

		// Typing into form fields
		sendKey(subp.emailAddressTextBox, getProperty("email2"));
		sendKey(subp.firstNameTextBox, getProperty("firstName"));
		sendKey(subp.lastNameTextBox, getProperty("lastName"));
		sendKey(subp.companyNameTextBox, getProperty("companyName"));
		sendKey(subp.positionTextBox, getProperty("Position"));

		// Simulating clicking on the 'Subscribe' button to submit form
		click(subp.subscribeButton);

		// I am using Explicit Wait to ensure the element is visible and text is loaded
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		WebElement textElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mce-success-response']")));

		// Retrieving the text and storing it in actual text
		String actualText = textElement.getText();
		String expectedText = "Almost finished... We need to confirm your email address. To complete the subscription process, please click the link in the email we just sent you.";

		// Using Assert to compare outcome and expected
		Assert.assertEquals(actualText, expectedText, "Text verification failed.");
		getDriver().get(getProperty("url"));

	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
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
		getDriver().get(getProperty("url"));

	}

}
