package tests;
import com.cube.qa.framework.testdata.loader.UserDataLoader;
import com.cube.qa.framework.testdata.model.User;
import com.cube.qa.framework.utils.BaseTest;
import org.testng.annotations.Test;
import com.cube.qa.framework.utils.HelperFunctions;

public class ScheduleAppointmentTest extends BaseTest {

    @Test(groups = {"scheduling", "smoke"})
    public void verifyUsersCanScheduleABloodAppointment() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        loginToApp(user.username, user.password);

        profileTabMenuItems.tapScheduleAppointment();
        smartSchedulingPage.tapStartOver();
        donationTypePage.tapBloodTitle();
        dayPage.tapNext14Days();
        timePage.tapAfternoonOption();
        locationPage.tapHomeZipCode();
        driveResultsPage.tapSeeTimesButton();
        driveResultsPage.tapGiveBloodButton();
        confirmAppointmentPage.tapConfirmButton();
        appointmentConfirmedPage.isThankYouMessageVisible();
        appointmentConfirmedPage.isDynamicTextVisible("Blood");
        appointmentConfirmedPage.tapDoneButton();
    }

    @Test(groups = {"scheduling"})
    public void verifyUsersCanScheduleAPowerRedAppointment() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        loginToApp(user.username, user.password);

        profileTabMenuItems.tapScheduleAppointment();
        smartSchedulingPage.tapStartOver();
        donationTypePage.tapPowerRedTitle();
        dayPage.tapNext14Days();
        timePage.tapAfternoonOption();
        locationPage.tapHomeZipCode();
        driveResultsPage.tapSeeTimesButton();
        driveResultsPage.tapGivePowerRedButton();
        confirmAppointmentPage.tapConfirmButton();
        appointmentConfirmedPage.isThankYouMessageVisible();
        appointmentConfirmedPage.isDynamicTextVisible("Power Red");
        appointmentConfirmedPage.tapDoneButton();
    }

    @Test(groups = {"scheduling"})
    public void verifyUsersCanScheduleAPlateletsAppointment() {
        User user = UserDataLoader.findUser(u -> u.hasDonations);
        loginToApp(user.username, user.password);

        profileTabMenuItems.tapScheduleAppointment();
        smartSchedulingPage.tapStartOver();
        donationTypePage.tapPlateletsTitle();
        dayPage.tapNext14Days();
        timePage.tapAfternoonOption();
        locationPage.tapHomeZipCode();
        driveResultsPage.tapSeeTimesButton();
        driveResultsPage.tapGivePlateletsButton();
        confirmAppointmentPage.tapConfirmButton();
        appointmentConfirmedPage.isThankYouMessageVisible();
        appointmentConfirmedPage.isDynamicTextVisible("Platelets");
        appointmentConfirmedPage.tapDoneButton();
    }

    @Test(groups = {"scheduling"})
    public void verifyUsersCanScheduleAbPlasmaAppointment() {
        User user = UserDataLoader.findUser(u -> u.eligibility.abPlasma.equals("now"));
        loginToApp(user.username, user.password);

        profileTabMenuItems.tapScheduleAppointment();
        smartSchedulingPage.tapStartOver();
        donationTypePage.tapAbPlasmaTitle();
        dayPage.tapNext14Days();
        timePage.tapAfternoonOption();
        locationPage.tapHomeZipCode();
        driveResultsPage.tapSeeTimesButton();
        driveResultsPage.tapGiveABPlasmaButton();
        confirmAppointmentPage.tapConfirmButton();
        appointmentConfirmedPage.isThankYouMessageVisible();
        appointmentConfirmedPage.isDynamicTextVisible("AB Plasma");
        appointmentConfirmedPage.tapDoneButton();
    }

    // Sponsor Code Tests
    @Test(groups = {"scheduling", "sponsor code"})
    public void verifySponsorCodeBannerDisplays() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("ARC");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.isSponsorCodeAppliedLabelVisible();
        donationTypePage.isDynamicTextVisible("ARC");
        donationTypePage.isSponsorCodeEditButtonVisible();
    }

    @Test(groups = {"scheduling", "sponsor code"})
    public void verifyEditOpensSponsorCodePopUp() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("ARC");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.isSponsorCodeEditButtonVisible();
        donationTypePage.tapSponsorCodeEditButton();
        donationTypePage.isSponsorCodeModalTitleVisible();
        donationTypePage.isSponsorCodeModalDoneButtonVisible();
        donationTypePage.isSponsorCodeModalCancelButtonVisible();
    }

    @Test(groups = {"scheduling", "sponsor code"})
    public void verifyCancelEditRetainsPreviousSponsorCode() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("ARC");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.tapSponsorCodeEditButton();
        donationTypePage.tapSponsorCodeModalCancelButton();
        donationTypePage.isSponsorCodeAppliedLabelVisible();
        donationTypePage.isDynamicTextVisible("ARC");
    }

    @Test(groups = {"scheduling", "sponsor code"})
    public void verifyEditSponsorDisplaysUpdatedDriveResults() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("ARC");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.tapSponsorCodeEditButton();
        donationTypePage.enterSponsorCode("GILKEY");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.tapBloodTitle();
        donationTypePage.isDynamicTextVisible("Gilkey School Community Center");
    }

    @Test(groups = {"scheduling", "sponsor code"})
    public void validateSponsorCodeInfoScreen() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeWhatIsThisButton();
        donationTypePage.isSponsorCodeInfoTitleVisible();
        donationTypePage.isSponsorCodeInfoDescriptionVisible();
    }

    @Test(groups = {"scheduling", "sponsor code"})
    public void verifyInvalidSponsorCodeErrorDisplays() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("INVALIDCODE123");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.tapBloodTitle();

        donationTypePage.isSponsorCodeNotFoundTitleVisible();
        donationTypePage.isSponsorCodeNotFoundDescriptionVisible();
        donationTypePage.isTryAgainButtonVisible();
    }

    @Test(groups = {"scheduling", "sponsor code", "smoke"})
    public void verifyUsersCanBookSponsorCodeAppointment() {
        User user = UserDataLoader.findUser(u -> !u.hasDonations);
        loginToApp(user.username, user.password);

        profileTabMenuItems.tapScheduleAppointment();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("ARC");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.tapBloodTitle();
        driveResultsPage.tapSeeTimesButton();
        driveResultsPage.tapGiveBloodButton();
        confirmAppointmentPage.tapConfirmButton();
        appointmentConfirmedPage.isThankYouMessageVisible();
        appointmentConfirmedPage.isDynamicTextVisible("Blood");
        appointmentConfirmedPage.tapDoneButton();
    }

    @Test(groups = {"scheduling", "sponsor code"})
    public void verifyDateRangeSelectionIsNotPresentWhenSearchingForSponsorCodeDrive() {
        welcomePage.tapScheduleAppointmentButton();
        donationTypePage.tapSponsorCodeButton();
        donationTypePage.enterSponsorCode("ARC");
        donationTypePage.tapSponsorCodeModalDoneButton();
        donationTypePage.tapBloodTitle();
        dayPage.isDayTitleNotVisible();
    }

}
