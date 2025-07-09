package com.cube.qa.framework.utils;

import com.cube.qa.framework.config.ConfigLoader;
import com.cube.qa.framework.config.TestConfig;

import com.cube.qa.framework.pages.BottomNavBar;
import com.cube.qa.framework.pages.givecare.GiveCareCall;
import com.cube.qa.framework.pages.givecare.GiveCareTab;
import com.cube.qa.framework.pages.learn.LearnPageFull;
import com.cube.qa.framework.pages.learn.LearnTopics;
import com.cube.qa.framework.pages.learn.foryou.*;
import com.cube.qa.framework.pages.learn.search.SearchResult;
import com.cube.qa.framework.pages.learn.search.SearchScreen;
import com.cube.qa.framework.pages.learn.topic.AgeAppropriatePlay;
import com.cube.qa.framework.pages.learn.topic.LearnTopicDetail;
import com.cube.qa.framework.pages.learn.topic.lesson.*;
import com.cube.qa.framework.pages.learn.topic.quiz.*;
import com.cube.qa.framework.pages.onboarding.ForgotPasswordWebViewPage;
import com.cube.qa.framework.pages.onboarding.HelpLoggingInPage;
import com.cube.qa.framework.pages.onboarding.SignInPageErrors;
import com.cube.qa.framework.pages.WhatsNewPage;
import com.cube.qa.framework.pages.deviceHelpers.AndroidHelpersPage;
import com.cube.qa.framework.pages.deviceHelpers.IOSHelpersPage;
import com.cube.qa.framework.pages.onboarding.PermissionsPage;
import com.cube.qa.framework.pages.onboarding.SignInPage;
import com.cube.qa.framework.pages.onboarding.TermsOfServicePage;
import com.cube.qa.framework.pages.onboarding.WelcomePage;
import com.cube.qa.framework.testdata.loader.UserDataLoader; // ✅ Add this import

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.*;
import org.testng.ITestContext; // added for Extent listener
import tests.SearchTests;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Thread.sleep;

public class BaseTest {

    protected AppiumDriver driver;
    protected TestConfig config;

    protected AndroidHelpersPage androidHelpersPage;
    protected IOSHelpersPage iosHelpersPage;

    // TODO: Add your page objects here for pages that will be used in most tests (e.g. log in or key flows)
    protected WelcomePage welcomePage;
    protected SignInPage signInPage;
    protected PermissionsPage permissionsPage;
    protected TermsOfServicePage termsOfServicePage;
    protected WhatsNewPage whatsNewPage;
    protected SignInPageErrors signInPageErrors;
    protected HelpLoggingInPage helpLoggingInPage;
    protected ForgotPasswordWebViewPage forgotPasswordWebViewPage;
    protected LearnPageFull learnPageFull;
    protected PersonalizedJourneyPage personalizedJourneyPage;
    protected UserTypeQuestionPage userTypeQuestionPage;
    protected SkillSelectionPage skillSelectionPage;
    protected PersonalisationCompletePage personalisationCompletePage;
    protected ForYouPage forYouPage;
    protected PersonalisedQuiz personalisedQuiz;
    protected LearnTopics learnTopics;
    protected LearnTopicDetail learnTopicDetail;
    protected LessonIntroPage lessonIntroPage;
    protected LessonOverlay lessonOverlay;
    protected LessonPageOne lessonPageOne;
    protected LessonPageTwo lessonPageTwo;
    protected LessonPageThree lessonPageThree;
    protected LessonPageFour lessonPageFour;
    protected LessonPageFive lessonPageFive;
    protected LessonSuccess lessonSuccess;
    protected QuizReadyPopUp quizReadyPopUp;
    protected TextSelectQuestion textSelectQuestion;
    protected TextSelectCorrect textSelectCorrect;
    protected TextSelectIncorrect textSelectIncorrect;
    protected ImageSelectQuestion imageSelectQuestion;
    protected ImageSelectCorrect imageSelectCorrect;
    protected ImageSelectIncorrect imageSelectIncorrect;
    protected SecondTextSelectQuestion secondTextSelectQuestion;
    protected QuizSuccess quizSuccess;
    protected QuizFail quizFail;
    protected AgeAppropriatePlay ageAppropriatePlay;
    protected AgeAppropriatePlayQuiz ageAppropriatePlayQuiz;
    protected SearchResult searchResult;
    protected SearchScreen searchScreen;
    protected BottomNavBar bottomNavBar;
    protected GiveCareCall giveCareCall;
    protected GiveCareTab giveCareTab;


    protected void log(String message) {
        String prefix = "[" + config.getPlatform().toUpperCase() +
                " | Thread-" + Thread.currentThread().getId() + "]";
        System.out.println(prefix + " " + message);
    }

    // Call to check if the current platform is Android or iOS
    protected boolean isAndroid() {
        return config.getPlatform().equalsIgnoreCase("android");
    }

    protected boolean isIOS() {
        return config.getPlatform().equalsIgnoreCase("ios");
    }

    // Call these functions to accept or dismiss permissions
    public void acceptPermissions() {
        try {
            sleep(1000); // 1-second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupt status
            System.out.println("⚠️ Interrupted during sleep: " + e.getMessage());
        }

        if (isIOS()) {
            iosHelpersPage.acceptIOSAlert();
        } else {
            androidHelpersPage.acceptAndroidPermission();
        }
    }

    public void dismissPermissions() {
        try {
            sleep(1000); // 1-second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupt status
            System.out.println("⚠️ Interrupted during sleep: " + e.getMessage());
        }

        if (isIOS()) {
            iosHelpersPage.dismissIOSAlert();
        } else {
            androidHelpersPage.dismissAndroidPermission();
        }
    }

    public void login(String user, String password) {
        welcomePage.tapSignInButton();
        signInPage.enterEmail(user);
        if (isIOS()) {
            signInPage.enterPassword(password + "\n");
        } else {
            signInPage.enterPassword(password);
        }
        signInPage.tapContinueButton();
    }

    public void continueAsGuest() {
        welcomePage.tapContinueAsGuestButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.tapContinueButton();
    }

    public void continueWithAccount(String user, String password) {
        welcomePage.tapSignInButton();
        signInPage.enterEmail(user);
        if (isIOS()) {
            signInPage.enterPassword(password + "\n");
        } else {
            signInPage.enterPassword(password);
        }
        signInPage.tapContinueButton();
        permissionsPage.tapSkipButton();
        termsOfServicePage.tapAcceptAndContinueButton();
        whatsNewPage.tapContinueButton();
    }

    public void personalisationFlow() {
        learnPageFull.tapForYouIncompleteCard();
        personalizedJourneyPage.tapBeginButton();
        userTypeQuestionPage.tapOtherOption();
        userTypeQuestionPage.tapNextButton();
        skillSelectionPage.tapSkillStartingBusiness();
        skillSelectionPage.tapSkillBeingLeader();
        skillSelectionPage.tapSkillStayingSafe();
        skillSelectionPage.tapSkillStoppingGerms();
        skillSelectionPage.tapNextButton();
        personalisationCompletePage.tapBackToLearnButton();
    }

    public void completeForYouShowPage() {
        learnPageFull.tapForYouIncompleteCard();
        personalizedJourneyPage.tapBeginButton();
        userTypeQuestionPage.tapOtherOption();
        userTypeQuestionPage.tapNextButton();
        skillSelectionPage.tapSkillStartingBusiness();
        skillSelectionPage.tapSkillBeingLeader();
        skillSelectionPage.tapSkillStayingSafe();
        skillSelectionPage.tapSkillStoppingGerms();
        skillSelectionPage.tapNextButton();
        personalisationCompletePage.tapTakeMeToMyPageButton();
    }

    public void locationPermissions(String location) {
        HashMap<String, String> args = new HashMap<>();
        args.put("action", "accept");

        switch (location) {
            case "once":
                args.put("buttonLabel", "Allow Once");
                break;
            case "all":
                args.put("buttonLabel", "Allow While Using App");
                break;
            case "deny":
                args.put("buttonLabel", "Don't Allow");
                break;
            default:
                throw new IllegalArgumentException("Unknown location permission option: " + location);
        }
        driver.executeScript("mobile: alert", args);
    }

    public void selectAlert(String alertText) throws InterruptedException {
        Thread.sleep(2000);
        HashMap<String, String> args = new HashMap<>();
        args.put("action", "accept");
        args.put("buttonLabel", alertText);
        driver.executeScript("mobile: alert", args);

    }

    public void openQuiz(){
        learnTopics.tapExpectationsTopic();
        learnTopicDetail.scrollToFirstVisibleAdditionalResourcesHeader();
        learnTopicDetail.tapQuizCard();
        quizReadyPopUp.tapConfirmButton();
    }

    public static void performSwipe(AppiumDriver driver, Point start, Point end) {
        final PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.getX(), start.getY()))
                .addAction(FINGER.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(FINGER.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end.getX(), end.getY()))
                .addAction(FINGER.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));
    }

    public static void swipeLeft(AppiumDriver driver, int iteration) {
        Dimension size = driver.manage().window().getSize();
        int height = size.getHeight();
        int width = size.getWidth();

        Point start = new Point((int) (width * 0.8), height / 2);
        Point end = new Point((int) (width * 0.2), height / 2);

        for (int i = 0; i < iteration; i++) {
            performSwipe(driver, start, end);
        }
    }

    public static void swipeRight(AppiumDriver driver, int iteration) {
        Dimension size = driver.manage().window().getSize();
        int height = size.getHeight();
        int width = size.getWidth();

        Point start = new Point((int) (width * 0.2), height / 2);
        Point end = new Point((int) (width * 0.8), height / 2);

        for (int i = 0; i < iteration; i++) {
            performSwipe(driver, start, end);
        }
    }

    @Parameters({"platform", "build", "buildNumber", "deviceName", "udid", "fullReset", "env", "isSimulator", "platformVersion"})
    @BeforeMethod(alwaysRun = true)
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

        androidHelpersPage = new AndroidHelpersPage(driver);
        iosHelpersPage = new IOSHelpersPage(driver);

        // TODO: Initialize page objects
        welcomePage = new WelcomePage(driver, config.getPlatform());
        signInPage = new SignInPage(driver, config.getPlatform());
        permissionsPage = new PermissionsPage(driver, config.getPlatform());
        termsOfServicePage = new TermsOfServicePage(driver, config.getPlatform());
        whatsNewPage = new WhatsNewPage(driver, config.getPlatform());
        signInPageErrors = new SignInPageErrors(driver, config.getPlatform());
        helpLoggingInPage = new HelpLoggingInPage(driver, config.getPlatform());
        forgotPasswordWebViewPage = new ForgotPasswordWebViewPage(driver, config.getPlatform());
        learnPageFull = new LearnPageFull(driver, config.getPlatform());
        personalizedJourneyPage = new PersonalizedJourneyPage(driver, config.getPlatform());
        userTypeQuestionPage = new UserTypeQuestionPage(driver, config.getPlatform());
        skillSelectionPage = new SkillSelectionPage(driver, config.getPlatform());
        personalisationCompletePage = new PersonalisationCompletePage(driver, config.getPlatform());
        forYouPage = new ForYouPage(driver, config.getPlatform());
        personalisedQuiz = new PersonalisedQuiz(driver, config.getPlatform());
        learnTopics = new LearnTopics(driver, config.getPlatform());
        learnTopicDetail = new LearnTopicDetail(driver, config.getPlatform());
        lessonIntroPage = new LessonIntroPage(driver, config.getPlatform());
        lessonOverlay = new LessonOverlay(driver, config.getPlatform());
        lessonPageOne = new LessonPageOne(driver, config.getPlatform());
        lessonPageTwo = new LessonPageTwo(driver, config.getPlatform());
        lessonPageThree = new LessonPageThree(driver, config.getPlatform());
        lessonPageFour = new LessonPageFour(driver, config.getPlatform());
        lessonPageFive = new LessonPageFive(driver, config.getPlatform());
        lessonSuccess = new LessonSuccess(driver, config.getPlatform());
        quizReadyPopUp = new QuizReadyPopUp(driver, config.getPlatform());
        textSelectQuestion = new TextSelectQuestion(driver, config.getPlatform());
        textSelectCorrect = new TextSelectCorrect(driver, config.getPlatform());
        textSelectIncorrect = new TextSelectIncorrect(driver, config.getPlatform());
        imageSelectQuestion = new ImageSelectQuestion(driver, config.getPlatform());
        imageSelectCorrect = new ImageSelectCorrect(driver, config.getPlatform());
        imageSelectIncorrect = new ImageSelectIncorrect(driver, config.getPlatform());
        secondTextSelectQuestion = new SecondTextSelectQuestion(driver, config.getPlatform());
        quizSuccess = new QuizSuccess(driver, config.getPlatform());
        quizFail = new QuizFail(driver, config.getPlatform());
        ageAppropriatePlay = new AgeAppropriatePlay(driver, config.getPlatform());
        ageAppropriatePlayQuiz = new AgeAppropriatePlayQuiz(driver, config.getPlatform());
        searchResult = new SearchResult(driver, config.getPlatform());
        searchScreen = new SearchScreen(driver, config.getPlatform());
        bottomNavBar = new BottomNavBar(driver, config.getPlatform());
        giveCareCall = new GiveCareCall(driver, config.getPlatform());
        giveCareTab = new GiveCareTab(driver, config.getPlatform());

        // ✅ Automatically log the test starting
        log("▶ STARTING TEST: " + method.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
