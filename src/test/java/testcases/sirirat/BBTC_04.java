package testcases.sirirat;

import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BBTC_04 extends CommonMethods {
	
	//Women Jacket Size M
	
	@Test
	public void womenJacketSize() {

		getDriver();
		// Hover over Women button
		hoverOverMouse(hp.women);
		// Hover over tops button
		hoverOverMouse(hp.topInWoman);
		//click jackets
		click(hp.JacketsInTops);
		//Navigate to “Shopping Options” on the left hand, Click “Size” 
		clickOnMenuBar(ip.leftBarMenu, getProperty("Gautam_TestCase_02_LeftBar_Option2"));
		//Navigate to “Shopping Options” on the left hand, Click “M”
		clickOnMenuBar(ip.leftBarMenu, getProperty("Gautam_TestCase_02_SizeList_Option3"));
		
		
		
		
	
	}
	

}
