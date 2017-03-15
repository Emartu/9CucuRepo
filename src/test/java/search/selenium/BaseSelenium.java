package search.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseSelenium {
    public static WebDriver Instance = null;

    private BaseSelenium() {
    }


    public static WebDriver init() {
        System.setProperty("webdriver.chrome.driver", "resource\\chromedriver_win32(1)\\chromedriver.exe");
        if (Instance == null) {
            Instance = new ChromeDriver();
        }
        return Instance;
    }

    public static void close() {
        try {
            Instance.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            Instance = null;
        }
    }
}
