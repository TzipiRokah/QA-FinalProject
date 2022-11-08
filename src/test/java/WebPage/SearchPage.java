package WebPage;

import Utilities.Variables;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Variables {

    //Search

    @FindBy(css = "#twotabsearchtextbox")
    private static WebElement inputSearch;
    @FindBy(css = "#nav-search-submit-button")
    private static WebElement searchButton;

    @FindBy(css = "[class=\"a-size-base-plus a-color-base a-text-normal\"]")
    private static WebElement itemsByName;

    public  static WebElement getInputSearch(){
        return inputSearch;
    }
    public  static WebElement getSearchButton(){
        return searchButton;
    }

    public  static WebElement getItemsByName(){
        return itemsByName;
    }

    //Filter

    @FindBy(css = "#high-price")
    private static WebElement maxPriceInput;
    @FindBy(css = "[id=\"p_36/price-range\"] span span:last-child")
    private static WebElement goOne;
    @FindBy(css = ".a-price-whole")
    private static WebElement itemsByPrice;
    @FindBy(css = "#a-autoid-0-announce")
    private static WebElement shortBy;
    @FindBy(css = "#s-result-sort-select_2")
    private static WebElement highToLow;
    @FindBy(css = "[title=\"Brown\"] div")
    private static WebElement choiceColorBr;
    @FindBy(css = "[title=\"Black\"] div")
    private static WebElement choiceColorBl;
    @FindBy(css = "#variation_color_name span")
    private static WebElement colorOne;
    @FindBy(css = "[class=\"a-spacing-none a-spacing-top-small po-color\"] [class=\"a-size-base a-color-tertiary\"]")
    private static WebElement colorTwo;

    public  static WebElement getMaxPriceInput(){
        return maxPriceInput;
    }
    public  static WebElement getGoOne(){
        return goOne;
    }
    public static WebElement getItemsByPrice(){
        return itemsByPrice;
    }
    public  static WebElement getShortBy(){
        return shortBy;
    }
    public  static WebElement getHighToLow(){
        return highToLow;
    }
    public  static WebElement getChoiceColorBr(){
        return choiceColorBr;
    }
    public  static WebElement getChoiceColorBl(){
        return choiceColorBl;
    }
    public  static WebElement getColorOne(){
        return colorOne;
    }
    public  static WebElement getColorTwo(){
        return colorTwo;
    }
}
