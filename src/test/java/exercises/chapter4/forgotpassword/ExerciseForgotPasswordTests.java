package exercises.chapter4.forgotpassword;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ExerciseForgotPasswordTests extends BaseTest {

    @Test
    public void unExistingForgotPasswordRecovery() {
        var forgotPass = homePage.clickForgotPassword();
        forgotPass.setEmail("some.email@gmail.com");
        var responsePage = forgotPass.clickRetrieve();
        assertTrue(responsePage.getText().contains("Internal Server Error"), "Email sent correctly");
    }
}
