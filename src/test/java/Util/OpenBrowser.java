package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author priyankap on 29/1/19
 */

public class OpenBrowser {

    private void chrome() {
        System.setProperty("webdriver.chrome.driver", "/home/priyankap/Installations/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wavemakeronline.com");
        driver.close();
    }
    private void firefox(){
        System.setProperty("webdriver.gecko.driver","/home/priyankap/Installations/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wavemakeronline.com");
        driver.close();
    }

    @Test
    public void openAndCloseChrome() {
        chrome();
    }

    @Test
    private void openAndCloseFirefox(){
       firefox();
    }
}