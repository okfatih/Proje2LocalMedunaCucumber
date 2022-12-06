package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Wait;


import java.util.concurrent.TimeUnit;

public class Driver {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static ThreadLocal<String> browsers = new ThreadLocal<>();

    private static int timeout = 5;
    private static Wait<WebDriver> shortWait;
    /**
     * this method returns the threadlocal webDriver
     *
     * @return WebDriver
     */
    public static WebDriver getDriver() {

        if (browsers.get() == null) {
            browsers.set("chrome");
        }

        if (driver.get() == null) {
            switch (browsers.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
                case "ie":
                case "internet explorer":
                    WebDriverManager.iedriver().setup();
                    driver.set(new InternetExplorerDriver());
                    break;
                case "edge":
                case "msedge":
                    WebDriverManager.edgedriver().setup();
                    driver.set(new EdgeDriver());
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver.set(new OperaDriver());
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
            }

        }

        driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get().manage().window().maximize();

        return driver.get();
    }


    /**
     * quit the threadLocal WebDriver
     */
    public static void closeDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.set(null);
        }
    }
    public void waitAndSendText(WebElement element, String text, int timeout) throws InterruptedException {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }
    public void waitAndSendTextWithDefaultTime(WebElement element, String text) throws InterruptedException {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }
}
