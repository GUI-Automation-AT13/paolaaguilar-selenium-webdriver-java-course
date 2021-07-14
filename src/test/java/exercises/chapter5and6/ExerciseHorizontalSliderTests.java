package exercises.chapter5and6;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseHorizontalSliderTests extends BaseTest {

    @Test
    public void setSlideToFour() {
        var horizontalSlide = homePage.clickSlider();
        horizontalSlide.changeSlider("4");
        assertEquals(horizontalSlide.sliderValue(), "4", "Not has the correct value");
    }
}
