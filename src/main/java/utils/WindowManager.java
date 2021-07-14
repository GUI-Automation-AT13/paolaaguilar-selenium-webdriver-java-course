package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goToUrl(String url) {
        navigate.to(url);
    }

    public void switchToTab(String nameTab) {
        var windows = driver.getWindowHandles();
        //System.out.println("tabs "+windows.size());
        //windows.forEach(System.out::println);

        for(String window: windows) {
            //System.out.println("Swithc windows " +window);
            driver.switchTo().window(window);

            //System.out.println("current window "+ driver.getTitle());

            if(nameTab.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void SwitchNextWindow() {
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
