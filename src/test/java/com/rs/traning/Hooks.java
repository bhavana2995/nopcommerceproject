package com.rs.traning;

import com.rs.traning.drivers.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage{

    private String browser="";
    private String url="http://demo.nopcommerce.com";

    @Before
    public void setUp(){
        openBrowser(browser);
        navigate(url);
        manageBrowser();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
