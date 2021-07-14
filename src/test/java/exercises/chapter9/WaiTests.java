package exercises.chapter9;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaiTests extends BaseTest {

    @Test
    public void testWaitUntilHidden() {
        var loading = homePage.clickWaitExample().clickExample();
        loading.clickStartBtn();
        String text = loading.getResultBtn();
        assertEquals(text, "Hello World!");
    }
}
