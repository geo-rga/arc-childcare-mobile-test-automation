package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LocationPage extends BasePage {

    private List<By> nearCurrentLocationLocators;
    private List<By> anotherLocationLocators;
    private List<By> homeZipCodeLocators;
    private List<By> homeZipCodeLabelLocators;
    private List<By> cancelButtonLocators;
    private List<By> searchFieldLocators;

    public LocationPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            nearCurrentLocationLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Near Current Location']"));
            anotherLocationLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Another Location']"));
            homeZipCodeLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Home ZIP Code']"));
            homeZipCodeLabelLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Your ZIP:')]"));
            cancelButtonLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Cancel']"));
            searchFieldLocators = List.of(By.xpath("//XCUIElementTypeTextField"));
        } else {
            nearCurrentLocationLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_location_near']"));
            anotherLocationLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_location_another']"));
            homeZipCodeLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointment_location_home']"));
            homeZipCodeLabelLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and contains(@text, 'Your ZIP:')]"));
            cancelButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cancel_action']"));
            searchFieldLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/search_src_text']"));
        }
    }

    // Near Current Location
    public boolean isNearCurrentLocationVisible() { return isVisible(nearCurrentLocationLocators); }
    public void tapNearCurrentLocation() { tap(nearCurrentLocationLocators); }

    // Another Location
    public boolean isAnotherLocationVisible() { return isVisible(anotherLocationLocators); }
    public void tapAnotherLocation() { tap(anotherLocationLocators); }

    // Home ZIP Code
    public boolean isHomeZipCodeVisible() { return isVisible(homeZipCodeLocators); }
    public void tapHomeZipCode() { tap(homeZipCodeLocators); }

    // Home ZIP Code Label (Dynamic Text)
    public boolean isHomeZipCodeLabelVisible() { return isVisible(homeZipCodeLabelLocators); }
    public String getHomeZipCodeLabelText() { return getText(homeZipCodeLabelLocators); }

    // Cancel Button
    public boolean isCancelButtonVisible() { return isVisible(cancelButtonLocators); }
    public void tapCancelButton() { tap(cancelButtonLocators); }

    // Search Field
    public boolean isSearchFieldVisible() { return isVisible(searchFieldLocators); }
    public void enterTextInSearchField(String text) { enterText(searchFieldLocators, text); }
    public void clearSearchField() { clear(searchFieldLocators); }
}
