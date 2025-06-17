package com.cube.qa.framework.pages.scheduling;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class AppointmentConfirmedPage extends BasePage {

    private List<By> appointmentConfirmedTitleLocators;
    private List<By> thankYouMessageLocators;
    private List<By> feedbackPromptLocators;
    private List<By> loveButtonLocators;
    private List<By> likeButtonLocators;
    private List<By> dislikeButtonLocators;
    private List<By> addToCalendarButtonLocators;
    private List<By> shareAppointmentButtonLocators;
    private List<By> aboutDonatingButtonLocators;
    private List<By> getDirectionsButtonLocators;
    private List<By> doneButtonLocators;
    private List<By> feedbackThanksMessageLocators;
    private List<By> feedbackSubmittedIconLocators;
    private List<By> feedbackQuestionLocators;
    private List<By> skipButtonLocators;
    private List<By> submitFeedbackButtonLocators;
    private List<By> feedbackOptionSignInLocators;
    private List<By> feedbackOptionSchedulingLocators;
    private List<By> feedbackOptionSufficientLocators;
    private List<By> feedbackOptionMoreInfoLocators;
    private List<By> feedbackOptionContactLocators;

    public AppointmentConfirmedPage(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            appointmentConfirmedTitleLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Appointment Confirmed']"));
            thankYouMessageLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'thank you for choosing to donate')]"));
            feedbackPromptLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='How was your scheduling experience today?']"));
            loveButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='love']"));
            likeButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='like']"));
            dislikeButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='dislike']"));
            addToCalendarButtonLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Add to Calendar']"));
            shareAppointmentButtonLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Share Appointment']"));
            aboutDonatingButtonLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='About Donating']"));
            getDirectionsButtonLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Get Directions']"));
            doneButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='DONE']"));
            feedbackThanksMessageLocators = List.of(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Thank you for your feedback')]"));
            feedbackSubmittedIconLocators = List.of(By.xpath("//XCUIElementTypeImage[@name='feedbackSubmitted']"));
            feedbackQuestionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Which of these is most important to improve (optional)?']"));
            skipButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Skip']"));
            submitFeedbackButtonLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='SUBMIT']"));
            feedbackOptionSignInLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Sign in / Forgot username or password']"));
            feedbackOptionSchedulingLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Scheduling an appointment with ease']"));
            feedbackOptionSufficientLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Having sufficient drive options (location, date, time)']"));
            feedbackOptionMoreInfoLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Ability to get more information digitally before booking']"));
            feedbackOptionContactLocators = List.of(By.xpath("//XCUIElementTypeButton[@name='Ability to quickly contact a live person for assistance']"));
        } else {
            appointmentConfirmedTitleLocators = List.of(By.xpath("//*[@text='Appointment Confirmed']"));
            thankYouMessageLocators = List.of(By.xpath("//*[contains(@text, 'thank you for choosing to donate')]"));
            feedbackPromptLocators = List.of(By.xpath("//*[@text='How was your scheduling experience today?']"));
            loveButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/love_button']"));
            likeButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/like_button']"));
            dislikeButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/dislike_button']"));
            addToCalendarButtonLocators = List.of(By.xpath("//*[@text='Add to Calendar']"));
            shareAppointmentButtonLocators = List.of(By.xpath("//*[@text='Share Appointment']"));
            aboutDonatingButtonLocators = List.of(By.xpath("//*[@text='About Donating']"));
            getDirectionsButtonLocators = List.of(By.xpath("//*[@text='Get Directions']"));
            doneButtonLocators = List.of(By.xpath("//*[@text='DONE']"));
            feedbackThanksMessageLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/title' and contains(@text, 'Thank you for your feedback')]"));
            feedbackSubmittedIconLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/feedback_submitted_icon']"));
            feedbackQuestionLocators = List.of(By.xpath("//*[@text='Which of these is most important to improve (optional)?']"));
            skipButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/skip']"));
            submitFeedbackButtonLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/submit']"));
            feedbackOptionSignInLocators = List.of(By.xpath("//*[@text='Sign in / Forgot username or password']"));
            feedbackOptionSchedulingLocators = List.of(By.xpath("//*[@text='Scheduling an appointment with ease']"));
            feedbackOptionSufficientLocators = List.of(By.xpath("//*[@text='Having sufficient drive options (location, date, time)']"));
            feedbackOptionMoreInfoLocators = List.of(By.xpath("//*[@text='Ability to get more information digitally before booking']"));
            feedbackOptionContactLocators = List.of(By.xpath("//*[@text='Ability to quickly contact a live person for assistance']"));
        }
    }

    // Appointment Confirmed Title
    public boolean isAppointmentConfirmedTitleVisible() { return isVisible(appointmentConfirmedTitleLocators); }

    // Thank You Message
    public boolean isThankYouMessageVisible() { return isVisible(thankYouMessageLocators); }

    // Feedback Prompt
    public boolean isFeedbackPromptVisible() { return isVisible(feedbackPromptLocators); }

    // Love Button
    public boolean isLoveButtonVisible() { return isVisible(loveButtonLocators); }
    public void tapLoveButton() { tap(loveButtonLocators); }

    // Like Button
    public boolean isLikeButtonVisible() { return isVisible(likeButtonLocators); }
    public void tapLikeButton() { tap(likeButtonLocators); }

    // Dislike Button
    public boolean isDislikeButtonVisible() { return isVisible(dislikeButtonLocators); }
    public void tapDislikeButton() { tap(dislikeButtonLocators); }

    // Add to Calendar
    public boolean isAddToCalendarVisible() { return isVisible(addToCalendarButtonLocators); }
    public void tapAddToCalendar() { tap(addToCalendarButtonLocators); }

    // Share Appointment
    public boolean isShareAppointmentVisible() { return isVisible(shareAppointmentButtonLocators); }
    public void tapShareAppointment() { tap(shareAppointmentButtonLocators); }

    // About Donating
    public boolean isAboutDonatingVisible() { return isVisible(aboutDonatingButtonLocators); }
    public void tapAboutDonating() { tap(aboutDonatingButtonLocators); }

    // Get Directions
    public boolean isGetDirectionsVisible() { return isVisible(getDirectionsButtonLocators); }
    public void tapGetDirections() { tap(getDirectionsButtonLocators); }

    // Done Button
    public boolean isDoneButtonVisible() { return isVisible(doneButtonLocators); }
    public void tapDoneButton() { tap(doneButtonLocators); }

    // Feedback Thank You Message
    public boolean isFeedbackThanksMessageVisible() { return isVisible(feedbackThanksMessageLocators); }

    // Feedback Submitted Icon
    public boolean isFeedbackSubmittedIconVisible() { return isVisible(feedbackSubmittedIconLocators); }

    // Feedback Question
    public boolean isFeedbackQuestionVisible() { return isVisible(feedbackQuestionLocators); }

    // Skip Button
    public boolean isSkipButtonVisible() { return isVisible(skipButtonLocators); }
    public void tapSkipButton() { tap(skipButtonLocators); }

    // Submit Feedback Button
    public boolean isSubmitFeedbackButtonVisible() { return isVisible(submitFeedbackButtonLocators); }
    public void tapSubmitFeedbackButton() { tap(submitFeedbackButtonLocators); }

    // Feedback Options
    public boolean isFeedbackOptionSignInVisible() { return isVisible(feedbackOptionSignInLocators); }
    public void tapFeedbackOptionSignIn() { tap(feedbackOptionSignInLocators); }

    public boolean isFeedbackOptionSchedulingVisible() { return isVisible(feedbackOptionSchedulingLocators); }
    public void tapFeedbackOptionScheduling() { tap(feedbackOptionSchedulingLocators); }

    public boolean isFeedbackOptionSufficientVisible() { return isVisible(feedbackOptionSufficientLocators); }
    public void tapFeedbackOptionSufficient() { tap(feedbackOptionSufficientLocators); }

    public boolean isFeedbackOptionMoreInfoVisible() { return isVisible(feedbackOptionMoreInfoLocators); }
    public void tapFeedbackOptionMoreInfo() { tap(feedbackOptionMoreInfoLocators); }

    public boolean isFeedbackOptionContactVisible() { return isVisible(feedbackOptionContactLocators); }
    public void tapFeedbackOptionContact() { tap(feedbackOptionContactLocators); }
}
