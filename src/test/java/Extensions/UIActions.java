package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UIActions extends CommonOps {

    @Step("Hover over web element.")
    public static void hoverOverElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    @Step("Click web element.")
    public static void clickElement(WebElement webElement) {
        webElement.click();
    }

    @Step("Send keys to element.")
    public static void sendKeysToElement(WebElement webElement, String keysToSend) {
        webElement.sendKeys(keysToSend);
    }

    @Step("Get text from element")
    public static String getTextFromElement(WebElement webElement) {
        return webElement.getText();
    }
}