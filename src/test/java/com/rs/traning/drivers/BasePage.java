package com.rs.traning.drivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    public void openBrowser(String name) {
        if (name.equalsIgnoreCase("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void manageBrowser(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void navigate(String url){
        driver.get(url);
    }
}
