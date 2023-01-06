package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory2 {

    public static WebDriver getDriver(String browser) {
        String operatingSystem = System.getProperty("os.name").toLowerCase();

        if (operatingSystem.contains("windows") && browser.equalsIgnoreCase("safari")) {
            return null;
        } else if (operatingSystem.contains("mac") && browser.equalsIgnoreCase("edge")) {
            return null;
        } else {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                return new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                return new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "path/to/edgedriver");
                return new EdgeDriver();
            } else if (browser.equalsIgnoreCase("safari")) {
                return new SafariDriver();
            } else {
                return null;
            }
        }
    }


}
