package utilities;

import pages.AccountPage;
import pages.ContactUsPage;
import pages.FooterPage;
import pages.GearPage;
import pages.HomePage;
import pages.HotSellerPage;
import pages.ItemPage;
import pages.LogInPage;
import pages.NavigationBarPage;
import pages.PaymentPage;
import pages.SearchPage;
import pages.ShippingPage;
import pages.ShoppingCartPage;
import pages.SubscribePage;

public class PageInitializer extends BaseClass{
	
	public static HomePage hp;
	public static LogInPage lp;
	public static ContactUsPage cp;	
	public static AccountPage ap;
	public static FooterPage fp;
	public static HotSellerPage hsp;
	public static NavigationBarPage np;
	public static PaymentPage pp;
	public static SearchPage sp;
	public static ShippingPage shp;
	public static ShoppingCartPage scp;
	public static ItemPage ip;
	public static GearPage gp;
	public static SubscribePage subp;
	
	public static void initialize() {
		hp = new HomePage();
		lp = new LogInPage();
		cp = new ContactUsPage();
		ap = new AccountPage();
		fp = new FooterPage();
		hsp = new HotSellerPage();
		np = new NavigationBarPage();
		pp = new PaymentPage();
		sp = new SearchPage();
		shp = new ShippingPage();
		scp = new ShoppingCartPage();
		ip = new ItemPage();
		gp = new GearPage();
		subp = new SubscribePage();
	}

}
