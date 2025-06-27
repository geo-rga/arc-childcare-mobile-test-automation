package com.cube.qa.framework.pages;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class SkillSelectionPage extends BasePage {

    private List<By> questionTitleLocators;
    private List<By> questionSubtitleLocators;
    private List<By> skillOptionLocators;
    private List<By> nextButtonLocators;
    private List<By> selectionCounterLocators;

    private List<By> skillStartingBusinessLocators;
    private List<By> skillBeingLeaderLocators;
    private List<By> skillStayingSafeLocators;
    private List<By> skillStoppingGermsLocators;
    private List<By> skillPickingUpLocators;
    private List<By> skillFeedingLocators;
    private List<By> skillDiaperingLocators;
    private List<By> skillMorningRoutineLocators;
    private List<By> skillPlaytimeLocators;
    private List<By> skillGuidingBehaviorLocators;
    private List<By> skillFirstAidLocators;

    public SkillSelectionPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            questionTitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Please select the areas you would like to develop your skills further']")
            );
            questionSubtitleLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Select as many answers as you would like']")
            );
            skillOptionLocators = List.of(
                By.xpath("//XCUIElementTypeButton[contains(@name, ' ')]")
            );
            nextButtonLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Next']")
            );
            selectionCounterLocators = List.of(
                By.xpath("//XCUIElementTypeStaticText[@name='Select at least 1']")
            );

            skillStartingBusinessLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Starting Your Babysitting Business']")
            );
            skillBeingLeaderLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Being a Leader ']")
            );
            skillStayingSafeLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Staying Safe on the Job']")
            );
            skillStoppingGermsLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Stopping the Spread of Germs']")
            );
            skillPickingUpLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Picking Up and Holding']")
            );
            skillFeedingLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Feeding']")
            );
            skillDiaperingLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Diapering and Toileting']")
            );
            skillMorningRoutineLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Maintaining Morning and Bedtime Routines ']")
            );
            skillPlaytimeLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Making Playtime Fun']")
            );
            skillGuidingBehaviorLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='Guiding Behavior']")
            );
            skillFirstAidLocators = List.of(
                By.xpath("//XCUIElementTypeButton[@name='First Aid Emergencies ']")
            );

        } else {
            questionTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_question']")
            );
            questionSubtitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_description']")
            );
            skillOptionLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/title']")
            );
            nextButtonLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/cta_next']")
            );
            selectionCounterLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/tv_selection_counter']")
            );

            skillStartingBusinessLocators = List.of(
                By.xpath("//*[@text='Starting Your Babysitting Business']")
            );
            skillBeingLeaderLocators = List.of(
                By.xpath("//*[@text='Being a Leader ']")
            );
            skillStayingSafeLocators = List.of(
                By.xpath("//*[@text='Staying Safe on the Job']")
            );
            skillStoppingGermsLocators = List.of(
                By.xpath("//*[@text='Stopping the Spread of Germs']")
            );
            skillPickingUpLocators = List.of(
                By.xpath("//*[@text='Picking Up and Holding']")
            );
            skillFeedingLocators = List.of(
                By.xpath("//*[@text='Feeding']")
            );
            skillDiaperingLocators = List.of(
                By.xpath("//*[@text='Diapering and Toileting']")
            );
            skillMorningRoutineLocators = List.of(
                By.xpath("//*[@text='Maintaining Morning and Bedtime Routines ']")
            );
            skillPlaytimeLocators = List.of(
                By.xpath("//*[@text='Making Playtime Fun']")
            );
            skillGuidingBehaviorLocators = List.of(
                By.xpath("//*[@text='Guiding Behavior']")
            );
            skillFirstAidLocators = List.of(
                By.xpath("//*[@text='First Aid Emergencies ']")
            );
        }
    }

    // Question Title
    public boolean isQuestionTitleVisible() {
        return isVisible(questionTitleLocators);
    }
    public boolean hasQuestionTitleText(String text) {
        return hasText(questionTitleLocators, text);
    }

    // Question Subtitle
    public boolean isQuestionSubtitleVisible() {
        return isVisible(questionSubtitleLocators);
    }
    public boolean hasQuestionSubtitleText(String text) {
        return hasText(questionSubtitleLocators, text);
    }

    // Skill Options
    public boolean areSkillOptionsVisible() {
        return isVisible(skillOptionLocators);
    }

    // Next Button
    public boolean isNextButtonVisible() {
        return isVisible(nextButtonLocators);
    }
    public void tapNextButton() {
        tap(nextButtonLocators);
    }

    // Selection Counter
    public boolean isSelectionCounterVisible() {
        return isVisible(selectionCounterLocators);
    }
    public boolean hasSelectionCounterText(String text) {
        return hasText(selectionCounterLocators, text);
    }

    // Individual Skill Taps
    public void tapSkillStartingBusiness() {
        tap(skillStartingBusinessLocators);
    }
    public void tapSkillBeingLeader() {
        tap(skillBeingLeaderLocators);
    }
    public void tapSkillStayingSafe() {
        tap(skillStayingSafeLocators);
    }
    public void tapSkillStoppingGerms() {
        tap(skillStoppingGermsLocators);
    }
    public void tapSkillPickingUp() {
        tap(skillPickingUpLocators);
    }
    public void tapSkillFeeding() {
        tap(skillFeedingLocators);
    }
    public void tapSkillDiapering() {
        tap(skillDiaperingLocators);
    }
    public void tapSkillMorningRoutine() {
        tap(skillMorningRoutineLocators);
    }
    public void tapSkillPlaytime() {
        tap(skillPlaytimeLocators);
    }
    public void tapSkillGuidingBehavior() {
        tap(skillGuidingBehaviorLocators);
    }
    public void tapSkillFirstAid() {
        tap(skillFirstAidLocators);
    }
}
