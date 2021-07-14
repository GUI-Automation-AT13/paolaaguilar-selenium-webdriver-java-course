package exercises.chapter5and6;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplay(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is correct");
        assertEquals(caption.getLinkText(), "View profile", "Caption link is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect");
    }
}
