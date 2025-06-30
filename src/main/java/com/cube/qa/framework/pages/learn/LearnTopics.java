package com.cube.qa.framework.pages.learn;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class LearnTopics extends BasePage {

    private List<By> learnHeaderLocators;
    private List<By> searchFieldLocators;
    private List<By> allTopicsHeaderLocators;
    private List<By> expectationsTopicLocators;

    public LearnTopics(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            learnHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Learn']")
            );
            searchFieldLocators = List.of(
                By.xpath("//XCUIElementTypeSearchField[@name='Search...']")
            );
            allTopicsHeaderLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='All Topics']")
            );
            expectationsTopicLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Expectations, Skills and Qualifications']")
            );
        } else {
            learnHeaderLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/toolbar']//android.widget.TextView[@text='Learn']")
            );
            searchFieldLocators = List.of(
                By.xpath("//*[@resource-id='android:id/search_src_text']")
            );
            allTopicsHeaderLocators = List.of(
                By.xpath("//*[@text='All Topics']")
            );
            expectationsTopicLocators = List.of(
                By.xpath("//*[@content-desc='Expectations, Skills and Qualifications. Incomplete']")
            );
        }
    }

    // Learn Header
    public boolean isLearnHeaderVisible() {
        return isVisible(learnHeaderLocators);
    }

    // Search Field
    public boolean isSearchFieldVisible() {
        return isVisible(searchFieldLocators);
    }

    // All Topics Header
    public boolean isAllTopicsHeaderVisible() {
        return isVisible(allTopicsHeaderLocators);
    }

    // Expectations Topic
    public boolean isExpectationsTopicVisible() {
        return isVisible(expectationsTopicLocators);
    }
    public void tapExpectationsTopic() {
        tap(expectationsTopicLocators);
    }
}
