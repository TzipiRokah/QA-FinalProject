package WorkFlow;

import Extensions.UIActions;
import Utilities.CommonOps;
import WebPage.AuthenticationPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import java.io.ByteArrayInputStream;

public class AuthenticationWorkFlow extends CommonOps {

    @Step("Insert to page home")
    public static void insertToPageHome()
    {
        startSession("chrome", "https://www.amazon.com/?language=en_US&currency=USD",
                15,"src/test/java/ReadDtat/data.xlsx");
    }

    @Step("Registration to web")
    public static String registration(){
        readExcel.readRegistration(fileName,8);
        UIActions.clickElement(AuthenticationPage.getLoginLink());
        UIActions.clickElement(AuthenticationPage.getAccountButton());
        UIActions.sendKeysToElement(AuthenticationPage.getUserName(),firstName+" "+lastName);
        UIActions.sendKeysToElement(AuthenticationPage.getEmail(),email);
        UIActions.sendKeysToElement(AuthenticationPage.getPassword(),password);
        UIActions.sendKeysToElement(AuthenticationPage.getPassword_check(),password);
        UIActions.clickElement(AuthenticationPage.getContinueButton());
        urlOne="https://www.amazon.com/ap/register";
        urlTwo=driver.getCurrentUrl();
        Allure.addAttachment("Registration", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        return urlOne;

    }

    @Step("Login to web")
    public static boolean login() {
        readExcel.readLogin(fileName,5);
        UIActions.clickElement(AuthenticationPage.getHomeIcon());
        UIActions.clickElement(AuthenticationPage.getLoginLink());
        UIActions.sendKeysToElement(AuthenticationPage.getEmail(),email);
        UIActions.clickElement(AuthenticationPage.getContinueButton());
        UIActions.sendKeysToElement(AuthenticationPage.getPassword(),password);
        UIActions.clickElement(AuthenticationPage.getSignInSubmit());
        Allure.addAttachment("Login", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        try{
            UIActions.hoverOverElement(AuthenticationPage.getLoginLink());
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Step("Logout from web")
    public static boolean logout()
    {
        actions=new Actions(driver);
        UIActions.hoverOverElement(AuthenticationPage.getLoginLink());
        UIActions.clickElement(AuthenticationPage.getSignoutButton());
        UIActions.sendKeysToElement(AuthenticationPage.getEmail(),email);
        UIActions.clickElement(AuthenticationPage.getContinueButton());
        Allure.addAttachment("Logout", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        if(true)
            return true;
        return false;
    }
}
