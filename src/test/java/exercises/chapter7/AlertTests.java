package exercises.chapter7;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert() {
        var alert = homePage.clickAlert();
        alert.triggerAlert();
        alert.alert_clickToAccept();
        assertEquals(alert.getResult(), "You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertPage = homePage.clickAlert();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Message is not the same");
    }

    @Test
    public void testGetTextFromPromptAlert() {
        var alertPage = homePage.clickAlert();
        alertPage.triggerPrompt();
        String text = "TAU Rules!";
        alertPage.setPromptText(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You entered: " + text);
    }
}
