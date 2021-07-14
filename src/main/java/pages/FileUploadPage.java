package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadBtn() {
        driver.findElement(uploadBtn).click();
    }

    /**
     * Provides path of file to the form then clicks upload btn
     * @param absolutePathOfFile the complete path of file to upload
     */
    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadBtn();
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadedFiles).getText();
    }
}
