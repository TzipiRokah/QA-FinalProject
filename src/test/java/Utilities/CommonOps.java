package Utilities;

import ReadDtat.ReadFromExcel;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Variables {

    public static void startSession(String BrowserName, String URL, int Timeout,String FileName){
        browserName=BrowserName;
        url=URL;
        timeout=Timeout;
        initWeb();
        readExcel=new ReadFromExcel();
        actions=new Actions(driver);
        fileName=FileName;

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Step("Initialize Web")
    public static void initWeb() {
        switch (browserName) {
            case "chrome":
                driver = initChromeDriver();
                break;
            case "firefox":
                driver = initFirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Type");
        }

        driver.manage().window().maximize();
        setDriverTimeoutAndWait();
        driver.get(url);
        ManagePages.initializeWebPages();
    }

    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public static void setDriverTimeoutAndWait() {
        driver.manage().timeouts().implicitlyWait(Long.parseLong(String.valueOf(timeout)), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(String.valueOf(timeout)));
    }


}
