package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userNameTxt = By.id("username");
    private By passwordTxt = By.id("password");
    private By loginBtn = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String username) {
        driver.findElement(userNameTxt).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTxt).sendKeys(password);
    }

    public SecureAreaPage clickLoginBtn() {
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }
}
