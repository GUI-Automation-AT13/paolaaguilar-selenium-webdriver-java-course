package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editoriIFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentionBtn = By.cssSelector("[title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editoriIFrameId);
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void clickBtnDecreaseInde() {
        driver.findElement(decreaseIndentionBtn).click();
    }

    public String getTextFromArea() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
