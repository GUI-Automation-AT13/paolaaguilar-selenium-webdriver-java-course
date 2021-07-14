package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By bodyText = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextLeftFrame() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = driver.findElement(bodyText).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getTextBottomFrame() {
        driver.switchTo().frame(bottomFrame);
        String text = driver.findElement(bodyText).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

}
