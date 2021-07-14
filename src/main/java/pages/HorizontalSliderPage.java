package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By spanValue = By.id("range");
    private By sliderInput = By.cssSelector(".sliderContainer input");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeSlider(String value) {
        while (!sliderValue().equals(value))
        driver.findElement(sliderInput).sendKeys(Keys.ARROW_RIGHT);
    }

    public String sliderValue() {
        return driver.findElement(spanValue).getText();
    }
}
