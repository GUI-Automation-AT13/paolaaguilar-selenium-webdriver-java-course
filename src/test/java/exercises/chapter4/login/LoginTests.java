package exercises.chapter4.login;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuth();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureArea = loginPage.clickLoginBtn();
        assertTrue(secureArea.getAlertText().contains("You logged into a secure area!"));
    }
}
