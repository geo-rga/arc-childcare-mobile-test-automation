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

    @Test(groups = {"wip"})
    public void validateQuizSuccess(){
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

    @Test(groups = {"wip"})
    public void validateQuizFail(){
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

}
