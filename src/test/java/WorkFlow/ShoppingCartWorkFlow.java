package WorkFlow;

import Extensions.UIActions;
import Utilities.CommonOps;
import WebPage.SearchPage;
import WebPage.ShoppingCartPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class ShoppingCartWorkFlow extends CommonOps {

    @Step("Search Item")
    public static boolean searchItem() {
        searchWord = readExcel.readShoppingCart(fileName, 1);
        UIActions.sendKeysToElement(SearchPage.getInputSearch(), searchWord);
        UIActions.clickElement(SearchPage.getSearchButton());
        Allure.addAttachment("Search item", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return true;
    }

    @Step("Add to cart")
    public static boolean addToCart(){
        try {
            UIActions.clickElement(ShoppingCartPage.getItemsByNameOne());
        }catch (Exception e){
            UIActions.clickElement(ShoppingCartPage.getItemsByNameTwo());
        }
        name=UIActions.getTextFromElement(ShoppingCartPage.getName()).substring(0,51);
        UIActions.clickElement(ShoppingCartPage.getAddToCart());
        try{
            UIActions.clickElement(ShoppingCartPage.getClosePop());
        }catch (Exception e){}
        try{
            Thread.sleep(6000);
        }
        catch(InterruptedException ie){
        }
        Allure.addAttachment("Add to cart", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return true;
    }

    @Step("Insert to cart")
    public static boolean insertToCart()
    {
        UIActions.clickElement(ShoppingCartPage.getCartIcon());
        Allure.addAttachment("Insert to cart", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return true;
    }

    @Step("Verify item in cart")
    public static int itemInCart()
    {
        try{
        Thread.sleep(2000);}
        catch(InterruptedException ie){}
        quantity=Integer.parseInt(UIActions.getTextFromElement(ShoppingCartPage.getCartIcon()));
        Allure.addAttachment("Item in cart", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return quantity;
    }
    @Step("Cart Update")
    public static int cartUpdate(){
        UIActions.clickElement(ShoppingCartPage.getQuantity());
        UIActions.clickElement(ShoppingCartPage.getQuantitySelection());
        quantityInCart=Integer.parseInt(UIActions.getTextFromElement(ShoppingCartPage.getSome()));
        Allure.addAttachment("Cart Update", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return quantityInCart;
    }

    @Step("Delete From Cart")
    public static String deleteFromCart(){
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }
        UIActions.clickElement(ShoppingCartPage.getDeleteButton());
        cartStatus=UIActions.getTextFromElement(ShoppingCartPage.getCartStatus());
        Allure.addAttachment("Delete from cart", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return cartStatus;
    }
}
