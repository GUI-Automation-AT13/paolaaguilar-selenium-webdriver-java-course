package exercises.chapter8;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseNestedFramesTests extends BaseTest {

    @Test
    public void getLeftFrameText() {
        var nested = homePage.clickNestedFrames();
        String text = nested.getTextLeftFrame();
        assertEquals(text, "LEFT");
    }

    @Test
    public void getBottomFrameText() {
        var nested = homePage.clickNestedFrames();
        String text = nested.getTextBottomFrame();
        assertEquals(text, "BOTTOM");
    }
}
