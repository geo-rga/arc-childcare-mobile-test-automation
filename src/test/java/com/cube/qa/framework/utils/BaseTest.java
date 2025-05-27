package com.cube.qa.framework.utils;

import com.cube.qa.framework.config.ConfigLoader;
import com.cube.qa.framework.config.TestConfig;

// TODO: Import your page objects here for pages that will be used in most tests (e.g. log in or key flows)
import com.cube.qa.framework.pages.onboarding.BiometricPermissionsPage;
import com.cube.qa.framework.pages.onboarding.LoginPage;
import com.cube.qa.framework.pages.onboarding.WelcomePage;
import com.cube.qa.framework.pages.profileTab.MenuItems;
import com.cube.qa.framework.testdata.loader.UserDataLoader; // ✅ Add this import

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import org.testng.ITestContext; // added for Extent listener
import java.lang.reflect.Method;

public class BaseTest {

    protected AppiumDriver driver;
    protected TestConfig config;

    // TODO: Add your page objects here for pages that will be used in most tests (e.g. log in or key flows)
    protected LoginPage loginPage;
    protected WelcomePage welcomePage;
    protected BiometricPermissionsPage biometricPermissionsPage;
    protected MenuItems menuItems;

    protected void log(String message) {
        String prefix = "[" + config.getPlatform().toUpperCase() +
                " | Thread-" + Thread.currentThread().getId() + "]";
        System.out.println(prefix + " " + message);
    }

    @Parameters({"platform", "build", "buildNumber", "deviceName", "udid", "fullReset", "env", "isSimulator", "platformVersion"})
    @BeforeMethod
    public void setUp(ITestContext ctx,
                      @Optional("android") String platformFromXml,
                      @Optional("") String buildFromXml,
                      @Optional("") String buildNumberFromXml,
                      @Optional("") String deviceNameFromXml,
                      @Optional("") String udidFromXml,
                      @Optional("false") String fullResetFromXml,
                      @Optional("staging") String envFromXml,
                      @Optional("false") String isSimulatorFromXml,
                      @Optional("") String platformVersionFromXml,
                      Method method) {

        // Load config
        config = ConfigLoader.load(platformFromXml, buildFromXml, udidFromXml, fullResetFromXml, envFromXml, isSimulatorFromXml, deviceNameFromXml, platformVersionFromXml);

        // ✅ Inject environment into UserDataLoader for environment-specific data lookup
        UserDataLoader.setEnvironment(config.getEnv());

        driver = DriverManager.createDriver(
                config.getPlatform(),
                config.getBuildPath(),
                config.getUdid(),
                config.isFullReset(),
                config.isSimulator(),
                config.getDeviceName(),
                config.getPlatformVersion()
        );

        // register driver for the Extent listener to capture screenshots
        ctx.setAttribute("driver", driver);

        // TODO: Initialize page objects that will be used in most tests (e.g. log in or key flows)
        loginPage = new LoginPage(driver, config.getPlatform());
        welcomePage = new WelcomePage(driver, config.getPlatform());
        biometricPermissionsPage = new BiometricPermissionsPage(driver, config.getPlatform());
        menuItems = new MenuItems(driver, config.getPlatform());

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
