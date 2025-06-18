package com.cube.qa.framework.pages.profileTab;

import com.cube.qa.framework.pages.BasePage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import java.util.List;

public class ProfileTabMenuItems extends BasePage {

    private List<By> scheduleAppointmentLocators;
    private List<By> scheduleAppointmentDescriptionLocators;
    private List<By> donorCardLocators;
    private List<By> donorCardDescriptionLocators;
    private List<By> bloodJourneyLocators;
    private List<By> bloodJourneyDescriptionLocators;
    private List<By> donationHistoryLocators;
    private List<By> donationHistoryDescriptionLocators;
    private List<By> healthChartsLocators;
    private List<By> healthChartsDescriptionLocators;
    private List<By> manageAppointmentsLocators;
    private List<By> manageAppointmentsDescriptionLocators;
    private List<By> notesLocators;
    private List<By> notesDescriptionLocators;
    private List<By> aboutDonatingBloodLocators;
    private List<By> aboutDonatingBloodDescriptionLocators;
    private List<By> captureTheMomentLocators;
    private List<By> captureTheMomentDescriptionLocators;
    private List<By> contactUsLocators;
    private List<By> contactUsDescriptionLocators;
    private List<By> settingsLocators;
    private List<By> settingsDescriptionLocators;

    public ProfileTabMenuItems(AppiumDriver driver, String platform) {
        super(driver);

        if (platform.equalsIgnoreCase("ios")) {
            scheduleAppointmentLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Schedule New Appointment']"));
            scheduleAppointmentDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Choose a time, location and donation type']"));
            donorCardLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Donor Card']"));
            donorCardDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Your digital donor card']"));
            bloodJourneyLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Blood Journey']"));
            bloodJourneyDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='See your blood journey']"));
            donationHistoryLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Donation History']"));
            donationHistoryDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='View past donations and health records']"));
            healthChartsLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Health Charts']"));
            healthChartsDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='See how your blood pressure and hemoglobin have changed over time']"));
            manageAppointmentsLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Manage Appointments']"));
            manageAppointmentsDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Reschedule, cancel and get directions']"));
            notesLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Notes']"));
            notesDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Add useful information about medication, donations, etc.']"));
            aboutDonatingBloodLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='About Donating Blood']"));
            aboutDonatingBloodDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Eligibility, the process and more']"));
            captureTheMomentLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Capture the Moment']"));
            captureTheMomentDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Share a selfie']"));
            contactUsLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Contact Us']"));
            contactUsDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Contact the Red Cross']"));
            settingsLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Settings']"));
            settingsDescriptionLocators = List.of(By.xpath("//XCUIElementTypeStaticText[@name='Customize your app settings']"));
        } else {
            scheduleAppointmentLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/schedule_new_appointment']"));
            scheduleAppointmentDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Choose a time, location and donation type']"));
            donorCardLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/donation_card']"));
            donorCardDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Your digital donor card']"));
            bloodJourneyLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/blood_journey']"));
            bloodJourneyDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='See your blood journey']"));
            donationHistoryLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/donation_history']"));
            donationHistoryDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='View past donations and health records']"));
            healthChartsLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/health_charts']"));
            healthChartsDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and contains(@text, 'blood pressure')]"));
            manageAppointmentsLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/appointments_card']"));
            manageAppointmentsDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and contains(@text, 'Reschedule')]"));
            notesLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/notes']"));
            notesDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and contains(@text, 'useful information')]"));
            aboutDonatingBloodLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/more_info']"));
            aboutDonatingBloodDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and contains(@text, 'Eligibility')]"));
            captureTheMomentLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/selfie']"));
            captureTheMomentDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Share a selfie']"));
            contactUsLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/feedback']"));
            contactUsDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Contact the Red Cross']"));
            settingsLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/settings']"));
            settingsDescriptionLocators = List.of(By.xpath("//*[@resource-id='com.cube.arc.blood:id/cell_body' and @text='Customize your app settings']"));
        }
    }

    // Scroll and Tap Functions
    public void scrollToAndTapScheduleAppointment() { scrollToElement(scheduleAppointmentLocators.get(0)); tapScheduleAppointment(); }
    public void scrollToAndTapDonorCard() { scrollToElement(donorCardLocators.get(0)); tapDonorCard(); }
    public void scrollToAndTapBloodJourney() { scrollToElement(bloodJourneyLocators.get(0)); tapBloodJourney(); }
    public void scrollToAndTapDonationHistory() { scrollToElement(donationHistoryLocators.get(0)); tapDonationHistory(); }
    public void scrollToAndTapHealthCharts() { scrollToElement(healthChartsLocators.get(0)); tapHealthCharts(); }
    public void scrollToAndTapManageAppointments() { scrollToElement(manageAppointmentsLocators.get(0)); tapManageAppointments(); }
    public void scrollToAndTapNotes() { scrollToElement(notesLocators.get(0)); tapNotes(); }
    public void scrollToAndTapAboutDonatingBlood() { scrollToElement(aboutDonatingBloodLocators.get(0)); tapAboutDonatingBlood(); }
    public void scrollToAndTapCaptureTheMoment() { scrollToElement(captureTheMomentLocators.get(0)); tapCaptureTheMoment(); }
    public void scrollToAndTapContactUs() { scrollToElement(contactUsLocators.get(0)); tapContactUs(); }
    public void scrollToAndTapSettings() { scrollToElement(settingsLocators.get(0)); tapSettings(); }

    // Tap and Visibility Functions
    public boolean isScheduleAppointmentVisible() { return isVisible(scheduleAppointmentLocators); }
    public void tapScheduleAppointment() { tap(scheduleAppointmentLocators); }
    public boolean isScheduleAppointmentDescriptionVisible() { return isVisible(scheduleAppointmentDescriptionLocators); }

    public boolean isDonorCardVisible() { return isVisible(donorCardLocators); }
    public void tapDonorCard() { tap(donorCardLocators); }
    public boolean isDonorCardDescriptionVisible() { return isVisible(donorCardDescriptionLocators); }

    public boolean isBloodJourneyVisible() { return isVisible(bloodJourneyLocators); }
    public void tapBloodJourney() { tap(bloodJourneyLocators); }
    public boolean isBloodJourneyDescriptionVisible() { return isVisible(bloodJourneyDescriptionLocators); }

    public boolean isDonationHistoryVisible() { return isVisible(donationHistoryLocators); }
    public void tapDonationHistory() { tap(donationHistoryLocators); }
    public boolean isDonationHistoryDescriptionVisible() { return isVisible(donationHistoryDescriptionLocators); }

    public boolean isHealthChartsVisible() { return isVisible(healthChartsLocators); }
    public void tapHealthCharts() { tap(healthChartsLocators); }
    public boolean isHealthChartsDescriptionVisible() { return isVisible(healthChartsDescriptionLocators); }

    public boolean isManageAppointmentsVisible() { return isVisible(manageAppointmentsLocators); }
    public void tapManageAppointments() { tap(manageAppointmentsLocators); }
    public boolean isManageAppointmentsDescriptionVisible() { return isVisible(manageAppointmentsDescriptionLocators); }

    public boolean isNotesVisible() { return isVisible(notesLocators); }
    public void tapNotes() { tap(notesLocators); }
    public boolean isNotesDescriptionVisible() { return isVisible(notesDescriptionLocators); }

    public boolean isAboutDonatingBloodVisible() { return isVisible(aboutDonatingBloodLocators); }
    public void tapAboutDonatingBlood() { tap(aboutDonatingBloodLocators); }
    public boolean isAboutDonatingBloodDescriptionVisible() { return isVisible(aboutDonatingBloodDescriptionLocators); }

    public boolean isCaptureTheMomentVisible() { return isVisible(captureTheMomentLocators); }
    public void tapCaptureTheMoment() { tap(captureTheMomentLocators); }
    public boolean isCaptureTheMomentDescriptionVisible() { return isVisible(captureTheMomentDescriptionLocators); }

    public boolean isContactUsVisible() { return isVisible(contactUsLocators); }
    public void tapContactUs() { tap(contactUsLocators); }
    public boolean isContactUsDescriptionVisible() { return isVisible(contactUsDescriptionLocators); }

    public boolean isSettingsVisible() { return isVisible(settingsLocators); }
    public void tapSettings() { tap(settingsLocators); }
    public boolean isSettingsDescriptionVisible() { return isVisible(settingsDescriptionLocators); }
}
