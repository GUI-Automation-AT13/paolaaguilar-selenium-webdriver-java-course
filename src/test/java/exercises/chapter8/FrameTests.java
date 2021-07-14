package exercises.chapter8;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg() {
        var editor = homePage.clickWysiEditor();
        editor.clearTextArea();
        String text = "Hello";
        String text2 = "World!";
        editor.setTextArea(text);
        editor.clickBtnDecreaseInde();
        editor.setTextArea(text2);
        assertEquals(editor.getTextFromArea(), text + text2, "Text from Text area is different from what supposed to");
    }
}
