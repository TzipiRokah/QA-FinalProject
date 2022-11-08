package Utilities;

import WebPage.AuthenticationPage;
import WebPage.SearchPage;
import WebPage.ShoppingCartPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Variables{

    public static void initializeWebPages() {
        authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
        searchPage= PageFactory.initElements(driver, SearchPage.class);
        shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
    }

}
