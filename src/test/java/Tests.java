import Extensions.Verifications;
import Utilities.Variables;
import WorkFlow.SearchWorkFlow;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import WorkFlow.AuthenticationWorkFlow;
import WorkFlow.ShoppingCartWorkFlow;

public class Tests extends Variables {

    @BeforeClass(description = "Start Web")
    @Description("Start Web")
    public void start(){
        AuthenticationWorkFlow.insertToPageHome();
    }

    @Test(description = "Test user Authentication")
    @Description("Verify user Authentication")
    public void test01_Authentication() {
        Verifications.verifyUrl(AuthenticationWorkFlow.registration(),urlTwo);
        Verifications.verifyTrue(AuthenticationWorkFlow.login());
    }

    @Test(description = "Test Shopping cart")
    @Description("Verify Shopping cart")
    public void test02_ShoppingCart() {
        Verifications.verifyTrue(ShoppingCartWorkFlow.searchItem());
        Verifications.verifyTrue(ShoppingCartWorkFlow.addToCart());
        Verifications.verifyTrue(ShoppingCartWorkFlow.insertToCart());
        Verifications.verifyInt(ShoppingCartWorkFlow.itemInCart(),1);
        Verifications.verifyInt(ShoppingCartWorkFlow.cartUpdate(),2);
        Verifications.verifyString(ShoppingCartWorkFlow.deleteFromCart(),"Your Amazon Cart is empty.");
    }

    @Test(description = "Test Search")
    @Description("Verify Search")
    public void test03_Search() {
        Verifications.verifyTrue(SearchWorkFlow.searchItem());
        Verifications.verifyTrue(SearchWorkFlow.resultsContainSearchTerm());
        Verifications.verifyTrue(SearchWorkFlow.priceRange());
        Verifications.verifyTrue(SearchWorkFlow.shortByHighToLow());
        Verifications.verifyTrue(SearchWorkFlow.colorChoice());
    }
}
