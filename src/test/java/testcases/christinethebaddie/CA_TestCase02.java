package testcases.christinethebaddie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class CA_TestCase02 extends CommonMethods {

	@Test
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
		WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mce-success-response']")));

		// Retrieving the text and storing it in actual text
		String actualText = textElement.getText();
		String expectedText = "Almost finished... We need to confirm your email address. To complete the subscription process, please click the link in the email we just sent you.";

        // Using Assert to compare outcome and expected
        Assert.assertEquals(actualText, expectedText, "Text verification failed.");

	}

}
