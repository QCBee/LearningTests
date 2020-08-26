package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebDriverFactory {
    private static WebDriver webDriver;

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void createInstance(String browserName) {

        WebDriver driver = null;

        if (browserName.toLowerCase().contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.toLowerCase().contains("internet")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserName.toLowerCase().contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        webDriver = driver;

    }

    public static void closeBrowser(){
        webDriver.quit();
    }

}

