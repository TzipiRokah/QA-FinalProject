package WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    @FindBy(css = "[class=\"a-size-base-plus a-color-base a-text-normal\"]")
    private static WebElement itemsByNameOne;

    @FindBy(css = "[class=\"a-size-medium a-color-base a-text-normal\"]")
    private static WebElement itemsByNameTwo;
    @FindBy(css = "#productTitle")
    private static WebElement name;
    @FindBy(css = "#add-to-cart-button")
    private static WebElement addToCart;
    @FindBy(css = "#attach-close_sideSheet-link")
    private static WebElement closePop;
    @FindBy(css = "#nav-cart-count")
    private static WebElement cartIcon;

    public  static WebElement getItemsByNameOne(){
        return itemsByNameOne;
    }
    public  static WebElement getItemsByNameTwo(){
        return itemsByNameTwo;
    }
    public  static WebElement getName(){
        return name;
    }
    public  static WebElement getAddToCart(){
        return addToCart;
    }
    public  static WebElement getClosePop(){
        return closePop;
    }
    public  static WebElement getCartIcon(){
        return cartIcon;
    }

    //Update cart

    @FindBy(css = "#a-autoid-0-announce")
    private static WebElement quantity;
    @FindBy(css = "#quantity_2")
    private static WebElement quantitySelection;
    @FindBy(css = ".a-dropdown-prompt")
    private static WebElement some;


    public  static WebElement getQuantity(){
        return quantity;
    }
    public  static WebElement getQuantitySelection(){
        return quantitySelection;
    }
    public  static WebElement getSome(){
        return some;
    }

    //Delete from cart

    @FindBy(css = "[value=\"Delete\"]")
    private static WebElement deleteButton;

    @FindBy(css = "[class=\"a-spacing-mini a-spacing-top-base\"]")
    private static WebElement cartStatus;


    public  static WebElement getDeleteButton(){
        return deleteButton;
    }
    public  static WebElement getCartStatus(){
        return cartStatus;
    }
}


