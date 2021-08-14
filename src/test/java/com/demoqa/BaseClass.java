package com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void initSetup () {
        System.setProperty("webdriver.edge.driver", "c:\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @AfterClass
    public void finish () {
        driver.quit();
    }
}
