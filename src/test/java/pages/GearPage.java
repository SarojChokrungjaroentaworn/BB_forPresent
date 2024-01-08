package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class GearPage {
public GearPage() {
	PageFactory.initElements(BaseClass.getDriver(), this);
}
@FindBy(xpath = "//a[@id = 'ui-id-6']")
public WebElement Gear;

@FindBy (xpath= "//a[@id = 'ui-id-25']" )
public WebElement Bags;

@FindBy (xpath = "//div[@class='product details product-item-details']//a[contains (text(), 'Driven Backpack')]")
public WebElement DrivenBackpack;

@FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[3]/div/div/div[3]/div/div[1]/form/button")
public WebElement AddToCart;

@FindBy (xpath = "//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
public WebElement AddedToCartVerification;

@FindBy (xpath= "//a[@id = 'ui-id-26']" )
public WebElement FitnessEquipmentMenu;

@FindBy (xpath = "//div[@class = \"product details product-item-details\"]//a[contains(text(), 'Sprite Foam Roller')]")
public WebElement SpriteFoamRoller;

@FindBy(xpath = "//li[@class=\"item category5\"]/strong")
public WebElement FitnessEquipmentVerification;


@FindBy(xpath= "//form[@data-product-sku= \"24-WG088\"]//button[@title=\"Add to Cart\"]")
public WebElement AddSpriteFoamRollerToCart;

@FindBy(xpath = "//div[@data-bind= \"html: $parent.prepareMessageForHtml(message.text)\"]")
public WebElement SpriteRollerAddedToCartVerification;

@FindBy(xpath = "//ol[@class='products list items product-items']/li[1]//a[@class='action view']")
public WebElement reviewButtonOfFirstItem;


}