package com.cube.qa.arcblood.utils;

import com.cube.qa.arcblood.config.ConfigLoader;
import com.cube.qa.arcblood.config.TestConfig;

// TODO: Import your page objects here for pages that will be used in most tests (e.g. log in or key flows)
import com.cube.qa.arcblood.pages.LoginPage;
import com.cube.qa.arcblood.testdata.loader.UserDataLoader; // ✅ Add this import

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

    @Parameters({"platform", "build", "udid", "fullReset", "env"})
    @BeforeMethod
    public void setUp(@Optional("android") String platformFromXml,
                      @Optional("") String buildFromXml,
                      @Optional("") String udidFromXml,
                      @Optional("false") String fullResetFromXml,
                      @Optional("staging") String envFromXml, // ✅ Default to "staging" if not provided
                      Method method) {

        // Load config
        config = ConfigLoader.load(platformFromXml, buildFromXml, udidFromXml, fullResetFromXml, envFromXml);

        // ✅ Inject environment into UserDataLoader for environment-specific data lookup
        UserDataLoader.setEnvironment(config.getEnv());

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
