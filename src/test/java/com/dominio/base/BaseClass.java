package com.dominio.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void initSetup () {
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @AfterClass
    public void finish () {
        driver.quit();
    }

    public void startPage (String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
}
