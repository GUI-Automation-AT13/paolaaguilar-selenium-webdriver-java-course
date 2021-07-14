package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By resultText = By.cssSelector("#finish h4");

    public DynamicLoadingExample2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn() {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultText));
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }

    public String getTextStartBtn() {
        return driver.findElement(startBtn).getText();
    }
}
