package tests;

import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;

public class QuizzesTests extends BaseTest {

    @Test(groups = {"smoke"})
    public void textQuestionCorrectTC18970() {
        continueAsGuest();
        openQuiz();

        textSelectQuestion.tapAnswerOption2();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.isCorrectMessageVisible();
        textSelectCorrect.tapNextButton();
    }

    @Test(groups = {"smoke"})
    public void imageQuestionCorrectTC18970() {
        continueAsGuest();
        openQuiz();

        textSelectQuestion.tapAnswerOption2();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.tapNextButton();

        secondTextSelectQuestion.tapAnswerOption4();
        secondTextSelectQuestion.tapCheckButton();
        secondTextSelectQuestion.tapNextButton();

        imageSelectQuestion.tapImageOption3();
        imageSelectQuestion.tapCheckButton();
        imageSelectCorrect.isCorrectMessageVisible();
    }

    @Test(groups = {"smoke"})
    public void validateQuizSuccessTC18979(){
        continueAsGuest();
        openQuiz();

        textSelectQuestion.tapAnswerOption2();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.tapNextButton();

        secondTextSelectQuestion.tapAnswerOption4();
        secondTextSelectQuestion.tapCheckButton();
        secondTextSelectQuestion.tapNextButton();

        imageSelectQuestion.tapImageOption3();
        imageSelectQuestion.tapCheckButton();
        imageSelectCorrect.tapFinishButton();

        quizSuccess.isCongratulationsTitleVisible();
        quizSuccess.isDescriptionTextVisible();
        quizSuccess.isShareButtonVisible();
        quizSuccess.isDoneButtonVisible();
    }

    @Test(groups = {"smoke"})
    public void validateQuizFailTC18984(){
        continueAsGuest();
        openQuiz();

        textSelectQuestion.tapAnswerOption1();
        textSelectQuestion.tapCheckButton();
        textSelectCorrect.tapNextButton();

        secondTextSelectQuestion.tapAnswerOption4();
        secondTextSelectQuestion.tapCheckButton();
        secondTextSelectQuestion.tapNextButton();

        imageSelectQuestion.tapImageOption3();
        imageSelectQuestion.tapCheckButton();
        imageSelectCorrect.tapFinishButton();

        quizFail.isFailTitleVisible();
        quizFail.isFailSubtitleVisible();
        quizFail.isQuizScoreVisible();
        quizFail.isRetryButtonVisible();
        quizFail.isDoneButtonVisible();
    }

    @Test(groups = {"wip"})
    public void blankQuestionCorrectTC23910() {
        continueAsGuest();
        learnTopics.tapAgeAppropriatePlayTopic();
        ageAppropriatePlay.scrollToFirstVisibleAdditionalResourcesHeader();
        ageAppropriatePlay.tapQuizCard();
        ageAppropriatePlay.tapConfirmButton();
        ageAppropriatePlayQuiz.tapAnswerOption1();
        ageAppropriatePlayQuiz.isCorrectMessageVisible();
        ageAppropriatePlayQuiz.tapNextQuestionButton();
    }
}
