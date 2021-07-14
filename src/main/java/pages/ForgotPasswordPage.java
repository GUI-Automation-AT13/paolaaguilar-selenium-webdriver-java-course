package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By email = By.id("email");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String emailText) {
        driver.findElement(email).sendKeys(emailText);
    }

    public EmailSentPage clickRetrieve() {
        driver.findElement(By.cssSelector("#form_submit")).click();
        return new EmailSentPage(driver);
    }
}
