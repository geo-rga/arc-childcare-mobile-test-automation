package com.cube.qa.framework.pages.learn;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class LearnPageFull extends BasePage {

    private List<By> headerTitleLocators;
    private List<By> searchFieldLocators;
    private List<By> moreButtonLocators;
    private List<By> stayingSafeCategoryLocators;
    private List<By> stoppingSpreadCategoryLocators;
    private List<By> pickingUpHoldingLocators;
    private List<By> feedingLocators;
    private List<By> diaperingToiletingLocators;
    private List<By> routinesLocators;
    private List<By> beingALeaderLocators;
    private List<By> startingBabysittingBusinessLocators;
    private List<By> makingPlaytimeFunLocators;
    private List<By> guidingBehaviourLocators;
    private List<By> firstAidEmergenciesLocators;
    private List<By> forYouIncompleteCardLocators;
    private List<By> forYouCompleteCardLocators;
    private List<By> forYouTitleLocators;
    private List<By> forYouSubtitleLocators;

    public LearnPageFull(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            forYouIncompleteCardLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='For You, A tailored space just for you, with recommended topics and quizzes.']")
            );
            forYouCompleteCardLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='For You']")
            );
            forYouTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='For You']")
            );
            forYouSubtitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='A tailored space just for you, with recommended topics and quizzes.']")
            );
            headerTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Learn']")
            );
            searchFieldLocators = List.of(
                    By.xpath("//XCUIElementTypeSearchField[@name='Search...']")
            );
            moreButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='More']")
            );
            stayingSafeCategoryLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Staying Safe on the Job']")
            );
            stoppingSpreadCategoryLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Stopping the Spread of Germs']")
            );
            pickingUpHoldingLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Picking Up and Holding']")
            );
            feedingLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Feeding']")
            );
            diaperingToiletingLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Diapering and Toileting']")
            );
            routinesLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Maintaining Morning and Bedtime Routines ']"));
            beingALeaderLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Being a Leader ']"));
            startingBabysittingBusinessLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Starting Your Babysitting Business']"));
            makingPlaytimeFunLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Making Playtime Fun']"));
            guidingBehaviourLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Guiding Behaviour']"));
            firstAidEmergenciesLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='First Aid Emergencies']"));
        } else {
            forYouIncompleteCardLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_for_you']")
            );
            forYouCompleteCardLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/card_for_you']")
            );
            forYouTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title' and @text='For You']")
            );
            forYouSubtitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/subtitle']")
            );
            headerTitleLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/toolbar']//*[@text='Learn']"));
            searchFieldLocators = List.of(
                    By.xpath("//*[@resource-id='android:id/search_src_text']"));
            moreButtonLocators = List.of(
                    By.xpath("//*[@resource-id='com.cube.arc.childcare:id/more_btn']"));
            stayingSafeCategoryLocators = List.of(
                    By.xpath("//*[@text='Staying Safe on the Job']"));
            stoppingSpreadCategoryLocators = List.of(
                    By.xpath("//*[@text='Stopping the Spread of Germs']"));
            pickingUpHoldingLocators = List.of(
                    By.xpath("//*[@text='Picking Up and Holding']"));
            feedingLocators = List.of(
                    By.xpath("//*[@text='Feeding']"));
            diaperingToiletingLocators = List.of(
                    By.xpath("//*[@text='Diapering and Toileting']"));
            routinesLocators = List.of(
                    By.xpath("//*[@text='Maintaining Morning and Bedtime Routines']"));
            beingALeaderLocators = List.of(
                    By.xpath("//*[@text='Being a Leader']"));
            startingBabysittingBusinessLocators = List.of(
                    By.xpath("//*[@text='Starting Your Babysitting Business']"));
            makingPlaytimeFunLocators = List.of(
                    By.xpath("//*[@text='Making Playtime Fun']"));
            guidingBehaviourLocators = List.of(
                    By.xpath("//*[@text='Guiding Behaviour']"));
            firstAidEmergenciesLocators = List.of(
                    By.xpath("//*[@text='First Aid Emergencies']"));
        }
    }

    public boolean isHeaderTitleVisible() {
        return isVisible(headerTitleLocators);
    }

    public boolean isSearchFieldVisible() {
        return isVisible(searchFieldLocators);
    }

    public boolean isMoreButtonVisible() {
        return isVisible(moreButtonLocators);
    }

    public void tapMoreButton() {
        tap(moreButtonLocators);
    }

    public boolean isStayingSafeCategoryVisible() {
        scrollToFirstVisible(stayingSafeCategoryLocators);
        return isVisible(stayingSafeCategoryLocators);
    }

    public void tapStayingSafeCategory() {
        tap(stayingSafeCategoryLocators);
    }

    public boolean isStoppingSpreadCategoryVisible() {
        scrollToFirstVisible(stoppingSpreadCategoryLocators);
        return isVisible(stoppingSpreadCategoryLocators);
    }

    public void tapStoppingSpreadCategory() {
        tap(stoppingSpreadCategoryLocators);
    }

    public boolean isPickingUpHoldingVisible() {
        scrollToFirstVisible(pickingUpHoldingLocators);
        return isVisible(pickingUpHoldingLocators);
    }

    public void tapPickingUpHolding() {
        tap(pickingUpHoldingLocators);
    }

    public boolean isFeedingVisible() {
        scrollToFirstVisible(feedingLocators);
        return isVisible(feedingLocators);
    }

    public void tapFeeding() {
        tap(feedingLocators);
    }

    public boolean isDiaperingToiletingVisible() {
        scrollToFirstVisible(diaperingToiletingLocators);
        return isVisible(diaperingToiletingLocators);
    }

    public void tapDiaperingToileting() {
        tap(diaperingToiletingLocators);
    }

    public boolean isRoutinesVisible() {
        scrollToFirstVisible(routinesLocators);
        return isVisible(routinesLocators);
    }

    public void tapRoutines() {
        tap(routinesLocators);
    }

    public boolean isBeingALeaderVisible() {
        scrollToFirstVisible(beingALeaderLocators);
        return isVisible(beingALeaderLocators);
    }

    public void tapBeingALeader() {
        tap(beingALeaderLocators);
    }

    public boolean isStartingBabysittingBusinessVisible() {
        return isVisible(startingBabysittingBusinessLocators);
    }

    public void tapStartingBabysittingBusiness() {
        tap(startingBabysittingBusinessLocators);
    }

    public boolean isMakingPlaytimeFunVisible() {
        scrollToFirstVisible(makingPlaytimeFunLocators);
        return isVisible(makingPlaytimeFunLocators);
    }

    public void tapMakingPlaytimeFun() {
        tap(makingPlaytimeFunLocators);
    }

    public boolean isGuidingBehaviourVisible() {
        scrollToFirstVisible(guidingBehaviourLocators);
        return isVisible(guidingBehaviourLocators);
    }

    public void tapGuidingBehaviour() {
        tap(guidingBehaviourLocators);
    }

    public boolean isFirstAidEmergenciesVisible() {
        scrollToFirstVisible(firstAidEmergenciesLocators);
        return isVisible(firstAidEmergenciesLocators);
    }

    public void tapFirstAidEmergencies() {
        tap(firstAidEmergenciesLocators);
    }

    // For You Incomplete Card
    public boolean isForYouIncompleteCardVisible() {
        return isVisible(forYouIncompleteCardLocators);
    }
    public void tapForYouIncompleteCard() {
        tap(forYouIncompleteCardLocators);
    }

    // For You Complete Card
    public boolean isForYouCompleteCardVisible() {
        return isVisible(forYouCompleteCardLocators);
    }
    public void tapForYouCompleteCard() {
        tap(forYouCompleteCardLocators);
    }

    // For You Title
    public boolean isForYouTitleVisible() {
        return isVisible(forYouTitleLocators);
    }
    public boolean hasForYouTitleText(String text) {
        return hasText(forYouTitleLocators, text);
    }

    // For You Subtitle
    public boolean isForYouSubtitleVisible() {
        return isVisible(forYouSubtitleLocators);
    }
    public boolean hasForYouSubtitleText(String text) {
        return hasText(forYouSubtitleLocators, text);
    }
} 
