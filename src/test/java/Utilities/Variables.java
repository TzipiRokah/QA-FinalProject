package Utilities;

import ReadDtat.ReadFromExcel;
import WebPage.AuthenticationPage;
import WebPage.SearchPage;
import WebPage.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Variables {

    protected static WebDriverWait wait;
    protected static String browserName;
    protected static int timeout;
    protected static ReadFromExcel readExcel;
    protected static String url;
    protected static String urlOne;
    protected static String urlTwo;
    protected static Actions actions;
    protected static String searchWord;
    protected static WebDriver driver;
    protected static String firstName;
    protected static String lastName;
    protected static String email;
    protected static String password;
    protected static String error;
    protected static String name;
    protected static String resultsSearch;
    protected static String maxPrice;
    protected static String Price;
    protected static String color;
    protected static String Color;
    protected static int quantity;
    protected static int quantityInCart;
    protected static String cartStatus;
    protected static String fileName;
    protected static AuthenticationPage authenticationPage;
    protected static SearchPage searchPage;
    protected static ShoppingCartPage shoppingCartPage;
}
