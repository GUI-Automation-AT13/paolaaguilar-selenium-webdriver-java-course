package exercises.chapter4.dropdown;

import exercises.chapter4.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption() {
        var dropDowPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDowPage.selectFromDropdown(option);
        var selectedOptions = dropDowPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
