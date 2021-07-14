package exercises.chapter11;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator() {
        homePage.clickWaitExample().clickExample();
        getWindowmanager().goBack();
        getWindowmanager().refreshPage();
        getWindowmanager().goForward();
        getWindowmanager().goToUrl("https://www.google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowmanager().switchToTab("New Window");
    }
}
