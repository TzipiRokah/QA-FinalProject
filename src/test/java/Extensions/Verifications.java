package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Verifications extends CommonOps {
    @Step("Verify url")
    public static void verifyUrl(String urlOne,String urlTwo) {
        Assert.assertEquals(urlOne,urlTwo);
    }

    @Step("Verify result is true")
    public static void verifyTrue(boolean result) {
        Assert.assertTrue(result);
    }

    @Step("Verify number")
    public static void verifyInt(int numberOne,int numberTwo) {
        Assert.assertEquals(numberOne,numberTwo);
    }

    @Step("Verify String")
    public static void verifyString(String stringOne,String stringTwo) {
        Assert.assertEquals(stringOne,stringTwo);
    }

    @Step("Verify between two String")
    public static void verifyTwoString(String stringOne,String stringTwo,String string) {
        Assert.assertEquals(stringOne,stringTwo);
    }

}
