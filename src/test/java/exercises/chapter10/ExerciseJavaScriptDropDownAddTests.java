package exercises.chapter10;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ExerciseJavaScriptDropDownAddTests extends BaseTest {

    @Test
    public void testAddAttributeToDropdown() {
        var dropDown = homePage.clickDropDown();
        dropDown.addAttributeDroopdown();
        var selectOpt = List.of("Option 1", "Option 2");
        selectOpt.forEach(dropDown::selectFromDropdown);
        var selectedOptions = dropDown.getSelectedOption();
        assertTrue(selectedOptions.containsAll(selectOpt));
        assertEquals(selectedOptions.size(), selectOpt.size());
    }
}
