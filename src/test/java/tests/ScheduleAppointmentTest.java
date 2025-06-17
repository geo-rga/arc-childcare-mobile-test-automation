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

    @Test(groups = {"scheduling"})
    public void scrollToTest() {
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
}
