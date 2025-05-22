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
    private final Duration defaultTimeout = Duration.ofSeconds(30);

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    // === Core wait methods ===

    protected WebElement waitForVisibility(List<By> locators) {
        String fieldName = findFieldNameFor(locators);
        for (By locator : locators) {
            try {
                System.out.println("🔍 Trying visibilityOfElementLocated: " + locator);
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
            } catch (Exception e) {
                System.out.println("❌ Locator failed: " + locator + " – " + e.getMessage());
            }
        }
        throw new RuntimeException(fieldName + " not visible");
    }

    protected WebElement waitForPresence(List<By> locators) {
        String fieldName = findFieldNameFor(locators);
        for (By locator : locators) {
            try {
                System.out.println("🔍 Trying presenceOfElementLocated: " + locator);
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.presenceOfElementLocated(locator));
            } catch (Exception e) {
                System.out.println("❌ Locator failed: " + locator + " – " + e.getMessage());
            }
        }
        throw new RuntimeException(fieldName + " not present");
    }

    protected WebElement waitToBeClickable(List<By> locators) {
        String fieldName = findFieldNameFor(locators);
        for (By locator : locators) {
            try {
                System.out.println("🔍 Trying elementToBeClickable: " + locator);
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.elementToBeClickable(locator));
            } catch (Exception e) {
                System.out.println("❌ Locator failed: " + locator + " – " + e.getMessage());
            }
        }
        throw new RuntimeException(fieldName + " not clickable");
    }

    protected boolean waitForInvisibility(List<By> locators) {
        String fieldName = findFieldNameFor(locators);
        for (By locator : locators) {
            try {
                System.out.println("🔍 Waiting for invisibility: " + locator);
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.invisibilityOfElementLocated(locator));
            } catch (Exception e) {
                System.out.println("❌ Invisibility failed: " + locator + " – " + e.getMessage());
            }
        }
        throw new RuntimeException(fieldName + " not invisible");
    }

    protected boolean waitForTextToBePresent(List<By> locators, String text) {
        String fieldName = findFieldNameFor(locators);
        for (By locator : locators) {
            try {
                System.out.println("🔍 Waiting for text '" + text + "' in: " + locator);
                return new WebDriverWait(driver, defaultTimeout)
                        .until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
            } catch (Exception e) {
                System.out.println("❌ Text wait failed: " + locator + " – " + e.getMessage());
            }
        }
        throw new RuntimeException("Text '" + text + "' not found in " + fieldName);
    }

    // === Abstracted interaction methods ===

    protected void tap(List<By> locators) {
        waitToBeClickable(locators).click();
    }

    protected void enterText(List<By> locators, String text) {
        WebElement el = waitForVisibility(locators);
        el.clear();
        el.sendKeys(text);
    }

    protected boolean isVisible(List<By> locators) {
        return waitForVisibility(locators).isDisplayed(); // throws RuntimeException if not found
    }

    protected boolean isInvisible(List<By> locators) {
        return waitForInvisibility(locators); // throws RuntimeException if not found
    }

    protected boolean hasText(List<By> locators, String expectedText) {
        return waitForTextToBePresent(locators, expectedText); // throws RuntimeException if not found
    }

    /**
     * getText() Retrieves the visible text from the element.
     */
    protected String getText(List<By> locators) {
        return waitForVisibility(locators).getText();
    }

    /**
     * clear() Clears any existing text from an editable field.
     */
    protected void clear(List<By> locators) {
        waitForVisibility(locators).clear();
    }

    /**
     * isChecked()	Checks if a checkbox or toggle is currently checked.
     */
    protected boolean isChecked(List<By> locators) {
        return waitForVisibility(locators).isSelected();
    }

    /**
     * isUnchecked() Checks if a checkbox or toggle is currently unchecked.
     */
    protected boolean isUnchecked(List<By> locators) {
        return !waitForVisibility(locators).isSelected();
    }

    // === Reflection for better error output ===

    private String findFieldNameFor(List<By> locators) {
        Class<?> cls = this.getClass();
        for (Field f : cls.getDeclaredFields()) {
            if (List.class.isAssignableFrom(f.getType())) {
                f.setAccessible(true);
                try {
                    if (f.get(this) == locators) {
                        return f.getName();
                    }
                } catch (IllegalAccessException ignored) {}
            }
        }
        return "element";
    }
}
