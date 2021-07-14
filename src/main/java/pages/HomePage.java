package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuth() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressedPage clickPresses() {
        clickLink("Key Presses");
        return new KeyPressedPage(driver);
    }

    public HorizontalSliderPage clickSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickAlert() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContentMenu() {
        clickLink("Context Menu");
        return  new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiEditor() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public NestedFramesPage clickNestedFrames() {
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    public DynamicLoadingPage clickWaitExample() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepPage clickLargePage() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepPage(driver);
    }

    public InfinityScrollPage clickInfiniteScrollPage() {
        clickLink("Infinite Scroll");
        return new InfinityScrollPage(driver);
    }

    public MultipleWindows clickMultipleWindows() {
        clickLink("Multiple Windows");
        return new MultipleWindows(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
