package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollTable() {
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }
}
