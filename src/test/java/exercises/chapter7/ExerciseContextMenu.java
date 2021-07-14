package exercises.chapter7;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseContextMenu extends BaseTest {

    @Test
    public void getAlertTextFromContextMenu() {
        var context = homePage.clickContentMenu();
        context.rightClickSquare();
        String alert = context.getAlertText();
        context.acceptAlert();
        assertEquals(alert, "You selected a context menu");
    }
}
