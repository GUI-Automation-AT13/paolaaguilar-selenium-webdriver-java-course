package exercises.chapter11;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ExerciseTabNavigateExample2Tests extends BaseTest {

    @Test
    public void navigateExample2Tab() {
        var example = homePage.clickWaitExample().openNewTabExample2();
        getWindowmanager().SwitchNextWindow();
        assertEquals(example.getTextStartBtn(), "Start");
    }
}
