package testcases.sirirat;

import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BBTC_05 extends CommonMethods{
	
	//Women Jacket Size M and black color
	
	@Test
	public void sizeAndColor() {

		getDriver();
		// Hover over Women button
		hoverOverMouse(hp.women);
		// Hover over tops button
		hoverOverMouse(hp.topInWoman);
		//click jackets
		click(hp.JacketsInTops);
		//Click “M”
		click(ip.sizeM);
	    //click black
		click(ip.colorblack);
		
	
	
	
	}

}
