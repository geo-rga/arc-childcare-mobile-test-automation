package com.cube.qa.framework.pages.learn.topic.quiz;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

import java.util.List;

public class QuizReadyPopUp extends BasePage {

    private List<By> quizReadyTitleLocators;
    private List<By> quizReadyMessageLocators;
    private List<By> cancelButtonLocators;
    private List<By> confirmButtonLocators;

    public QuizReadyPopUp(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            quizReadyTitleLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name='Ready to take the quiz?']")
            );
            quizReadyMessageLocators = List.of(
                    By.xpath("//XCUIElementTypeStaticText[@name=\"You haven’t completed all the lessons in this topic yet. Are you sure you want to take the quiz now?\"]")
            );
            cancelButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Cancel']")
            );
            confirmButtonLocators = List.of(
                    By.xpath("//XCUIElementTypeButton[@name='Yes, I’m ready']")
            );
        } else {
            quizReadyTitleLocators = List.of(
                By.xpath("//*[@resource-id='com.cube.arc.childcare:id/alertTitle' and @text='Ready to take the quiz?']")
            );
            quizReadyMessageLocators = List.of(
                By.xpath("//*[@resource-id='android:id/message' and contains(@text,'You haven’t completed all the lessons')]")
            );
            cancelButtonLocators = List.of(
                By.xpath("//*[@resource-id='android:id/button2' and @text='CANCEL']")
            );
            confirmButtonLocators = List.of(
                By.xpath("//*[@resource-id='android:id/button1' and @text='YES, I’M READY']")
            );
        }
    }

    // Quiz Ready Title
    public boolean isQuizReadyTitleVisible() {
        return isVisible(quizReadyTitleLocators);
    }

    // Quiz Ready Message
    public boolean isQuizReadyMessageVisible() {
        return isVisible(quizReadyMessageLocators);
    }

    // Cancel Button
    public boolean isCancelButtonVisible() {
        return isVisible(cancelButtonLocators);
    }
    public void tapCancelButton() {
        tap(cancelButtonLocators);
    }

    // Confirm Button
    public boolean isConfirmButtonVisible() {
        return isVisible(confirmButtonLocators);
    }
    public void tapConfirmButton() {
        tap(confirmButtonLocators);
    }
} 
