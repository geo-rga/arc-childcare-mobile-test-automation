package com.cube.qa.arcblood.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.time.Duration;
import java.util.List;

public class BasePage {

    protected final AppiumDriver driver;
    private final Duration defaultTimeout = Duration.ofSeconds(30); // Adjust as needed

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    /**
     * Tries each locator; if none succeed within timeout, throws AssertionError
     * whose message is the *field name* of the locator list, e.g.
     *   "biometricNotNow not displayed"
     */
    protected WebElement waitForVisibility(List<By> locators) {
        for (By locator : locators) {
            try {
                System.out.println("🔍 Trying visibilityOfElementLocated: " + locator);
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
            } catch (Exception e) {
                System.out.println("❌ Locator failed: " + locator + " – " + e.getMessage());
            }
        }
        // nothing matched → fail as an assertion
        String fieldName = findFieldNameFor(locators);
        throw new AssertionError(fieldName + " not displayed");
    }

    /**
     * Reflectively finds which field in the page subclass holds this exact
     * locator list, so we can name it in the AssertionError.
     */
    private String findFieldNameFor(List<By> locators) {
        Class<?> cls = this.getClass();
        for (Field f : cls.getDeclaredFields()) {
            if (List.class.isAssignableFrom(f.getType())) {
                f.setAccessible(true);
                try {
                    if (f.get(this) == locators) {
                        return f.getName();
                    }
                } catch (IllegalAccessException ignored) { }
            }
        }
        return "element";
    }

    protected WebElement waitForPresence(List<By> locators) {
        for (By locator : locators) {
            try {
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.presenceOfElementLocated(locator));
            } catch (Exception ignored) {}
        }
        throw new RuntimeException("No present element found from locator list.");
    }

    protected WebElement waitToBeClickable(List<By> locators) {
        for (By locator : locators) {
            try {
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.elementToBeClickable(locator));
            } catch (Exception ignored) {}
        }
        throw new RuntimeException("No clickable element found from locator list.");
    }

    protected boolean waitForInvisibility(By locator) {
        return new WebDriverWait(driver, defaultTimeout)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected boolean waitForTextToBePresent(By locator, String text) {
        return new WebDriverWait(driver, defaultTimeout)
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }
}
