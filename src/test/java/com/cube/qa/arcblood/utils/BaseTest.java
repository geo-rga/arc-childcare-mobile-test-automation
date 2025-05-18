package com.cube.qa.arcblood.utils;

import com.cube.qa.arcblood.config.ConfigLoader;
import com.cube.qa.arcblood.config.TestConfig;

// TODO: Import your page objects here for pages that will be used in most tests (e.g. log in or key flows)
import com.cube.qa.arcblood.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import java.lang.reflect.Method;


public class BaseTest {

    protected AppiumDriver driver;
    protected TestConfig config;

    // TODO: Add your page objects here for pages that will be used in most tests (e.g. log in or key flows)
    protected LoginPage loginPage;

    protected void log(String message) {
        String prefix = "[" + config.getPlatform().toUpperCase() +
                " | Thread-" + Thread.currentThread().getId() + "]";
        System.out.println(prefix + " " + message);
    }

    @Parameters({"platform", "build", "udid", "fullReset"})
    @BeforeMethod
    public void setUp(@Optional("android") String platformFromXml,
                      @Optional("") String buildFromXml,
                      @Optional("") String udidFromXml,
                      @Optional("false") String fullResetFromXml,
                      Method method) {

        // Load config
        config = ConfigLoader.load(platformFromXml, buildFromXml, udidFromXml, fullResetFromXml);
        driver = DriverManager.createDriver(
                config.getPlatform(),
                config.getBuildPath(),
                config.getUdid(),
                config.isFullReset()
        );

        // TODO: Initialize page objects that will be used in most tests (e.g. log in or key flows)
        loginPage = new LoginPage(driver, config.getPlatform());

        // ✅ Automatically log the test starting
        log("▶ STARTING TEST: " + method.getName());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
