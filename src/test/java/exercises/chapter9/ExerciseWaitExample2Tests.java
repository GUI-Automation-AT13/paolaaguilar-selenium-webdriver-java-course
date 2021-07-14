package exercises.chapter9;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseWaitExample2Tests extends BaseTest {

    @Test
    public void waitForExample2ResultText() {
        var loading = homePage.clickWaitExample().clickExample2();
        loading.clickStartBtn();
        String text = loading.getResultText();
        assertEquals(text, "Hello World!");
    }
}
