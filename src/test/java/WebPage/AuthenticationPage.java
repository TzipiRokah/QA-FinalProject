package WebPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {

    //Registration

    @FindBy(css = "#createAccountSubmit")
    private static WebElement accountButton;
    @FindBy(css = "#ap_customer_name")
    private static WebElement userName;

    @FindBy(css = "#ap_email")
    private static WebElement email;

    @FindBy(css = "#ap_password")
    private static WebElement password;

    @FindBy(css = "#ap_password_check")
    private static WebElement password_check;

    @FindBy(css = "#continue")
    private static WebElement continueButton;

    @FindBy(css = "[class=\"a-icon a-icon-logo\"]")
    private static WebElement homeIcon;

    //--

    public  static WebElement getAccountButton(){
        return accountButton;
    }

    public  static WebElement getUserName(){
        return userName;
    }

    public  static WebElement getEmail(){
        return email;
    }

    public  static WebElement getPassword(){
        return password;
    }

    public static WebElement getPassword_check(){return password_check;}

    public static WebElement getContinueButton(){return continueButton;}

    public static WebElement getHomeIcon(){return homeIcon;}



    //Login

    @FindBy(css = "#nav-link-accountList")
    private static WebElement loginLink;

    @FindBy(css = "#signInSubmit")
    private static WebElement signInSubmit;

    //--

    public  static WebElement getLoginLink(){
        return loginLink;
    }

    public static WebElement getSignInSubmit(){
        return signInSubmit;
    }


    //Logout

    @FindBy(css = "#nav-item-signout")
    private static WebElement signoutButton;

    //--

    public static WebElement getSignoutButton(){return signoutButton;}





}
