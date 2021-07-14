package exercises.chapter7;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void uploadFile(){
        var uploadFile = homePage.clickFileUpload();
        uploadFile.uploadFile("/Users/pao/Desktop/JalaSoft/GUI Automation/TAU web driver course/paolaaguilar-selenium-webdriver-java-course/resources/chromedriver");
        assertEquals(uploadFile.getUploadedFiles(), "chromedriver");
    }
}
