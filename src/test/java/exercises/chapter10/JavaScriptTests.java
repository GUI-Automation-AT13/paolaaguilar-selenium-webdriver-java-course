package exercises.chapter10;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollTable() {
        homePage.clickLargePage().scrollTable();
    }

    @Test
    public void testScrollInifinite() {
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }
}
