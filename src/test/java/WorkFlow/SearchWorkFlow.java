package WorkFlow;

import Extensions.UIActions;
import Utilities.CommonOps;
import WebPage.SearchPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

public class SearchWorkFlow extends CommonOps {

    @Step("Search Item")
    public static boolean searchItem() {
        searchWord = readExcel.readSearch(fileName, 1);
        UIActions.sendKeysToElement(SearchPage.getInputSearch(), searchWord);
        UIActions.clickElement(SearchPage.getSearchButton());
        Allure.addAttachment("Search item", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return true;
    }

    @Step("Results contain search term")
    public static boolean resultsContainSearchTerm() {
        resultsSearch = UIActions.getTextFromElement(SearchPage.getItemsByName());
        Allure.addAttachment("Results contain search term", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        if (!resultsSearch.contains(searchWord))
            return false;
        return true;
    }

    @Step("price range")
    public static boolean priceRange() {
        maxPrice = "100";
        UIActions.sendKeysToElement(SearchPage.getMaxPriceInput(), maxPrice);
        try {
            UIActions.clickElement(SearchPage.getGoOne());
        } catch (Exception e) {
            UIActions.clickElement(SearchPage.getGoOne());
        }
        Price =UIActions.getTextFromElement(SearchPage.getItemsByPrice());
        Allure.addAttachment("Price range", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        if (Integer.parseInt(Price) <= Integer.parseInt(maxPrice))
            return true;
        return false;
    }

    @Step("Short by high to low")
    public static boolean shortByHighToLow()
    {
        UIActions.clickElement(SearchPage.getShortBy());
        UIActions.clickElement(SearchPage.getHighToLow());
        Allure.addAttachment("High to low", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return true;
    }

    @Step("Color choice")
    public static boolean colorChoice()
    {
        try{
            UIActions.clickElement(SearchPage.getChoiceColorBr());
            color="Brown";
        }catch (NoSuchElementException exception) {
            UIActions.clickElement(SearchPage.getChoiceColorBl());
            color="Black";
        }
        UIActions.clickElement(SearchPage.getItemsByName());
        try{
            Color=UIActions.getTextFromElement(SearchPage.getColorOne());
        }catch (NoSuchElementException exception) {
            Color=UIActions.getTextFromElement(SearchPage.getColorTwo());
        }
        Allure.addAttachment("Choice color", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        if(color.equals(Color)||Color.equals("Daa"))
            return true;
        return false;
    }
}
