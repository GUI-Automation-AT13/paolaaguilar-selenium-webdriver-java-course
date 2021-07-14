package exercises.chapter5and6;

import exercises.chapter4.base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTest {

    @Test
    public void testBackspace() {
        var keyPage = homePage.clickPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var keyPage = homePage.clickPresses();
        keyPage.enterPi();
    }
}
