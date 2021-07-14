package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertBtn = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerAcceptBtn = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerAcceptPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertBtn).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void triggerConfirm() {
        driver.findElement(triggerAcceptBtn).click();
    }

    public void triggerPrompt() {
        driver.findElement(triggerAcceptPrompt).click();
    }

    public void setPromptText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}
