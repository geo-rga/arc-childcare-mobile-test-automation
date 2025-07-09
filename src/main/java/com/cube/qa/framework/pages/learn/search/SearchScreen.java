package com.cube.qa.framework.pages.learn.search;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class SearchScreen extends BasePage {

    private List<By> searchInputLocators;
    private List<By> cancelButtonLocators;
    private List<By> learnResultsTitleLocators;
    private List<By> firstResultTitleLocators;
    private List<By> firstResultSubtitleLocators;
    private List<By> firstResultButtonLocators;

    public SearchScreen(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            searchInputLocators = List.of(
                By.xpath("//XCUIElementTypeSearchField[@name='Search...']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Cancel']")
            );
            learnResultsTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='2 Learn Results']")
            );
            firstResultTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Leadership Skills']")
            );
            firstResultSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Suggested Result']")
            );
            firstResultButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Leadership Skills, Suggested Result']")
            );

        } else {
            searchInputLocators = List.of(
                By.xpath("//*[@resource-id='android:id/search_src_text']")
            );
            cancelButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/button_cancel']")
            );
            learnResultsTitleLocators = List.of(
                By.xpath("//android.widget.TextView[@text='2 Learn Results']")
            );
            firstResultTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_result_title' and @text='Leadership Skills']")
            );
            firstResultSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/text_chip_suggested']")
            );
            firstResultButtonLocators = List.of(
                    By.xpath("//android.widget.LinearLayout[@clickable='true'][.//*[@resource-id='com.cube.arc.childcare:id/text_result_title' and @text='Leadership Skills']]")
            );
        }
    }

    // Search Input
    public boolean isSearchInputVisible() {
        return isVisible(searchInputLocators);
    }
    public void enterSearchText(String text) {
        enterText(searchInputLocators, text);
    }
    public void clearSearchInput() {
        clear(searchInputLocators);
    }

    // Cancel Button
    public boolean isCancelButtonVisible() {
        return isVisible(cancelButtonLocators);
    }
    public void tapCancelButton() {
        tap(cancelButtonLocators);
    }

    // Learn Results Title
    public boolean isLearnResultsTitleVisible() {
        return isVisible(learnResultsTitleLocators);
    }
    public boolean hasLearnResultsTitleText(String text) {
        return hasText(learnResultsTitleLocators, text);
    }

    // First Result Title
    public boolean isFirstResultTitleVisible() {
        return isVisible(firstResultTitleLocators);
    }
    public boolean hasFirstResultTitleText(String text) {
        return hasText(firstResultTitleLocators, text);
    }

    // First Result Subtitle
    public boolean isFirstResultSubtitleVisible() {
        return isVisible(firstResultSubtitleLocators);
    }
    public boolean hasFirstResultSubtitleText(String text) {
        return hasText(firstResultSubtitleLocators, text);
    }

    // First Result Button
    public boolean isFirstResultButtonVisible() {
        return isVisible(firstResultButtonLocators);
    }
    public void tapFirstResultButton() {
        tap(firstResultButtonLocators);
    }
} 
