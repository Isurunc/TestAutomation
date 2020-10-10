package dropdowns;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption () {
      var dropDownPage=   homePage.clickDropDown();
      String option = "Option 1";

      dropDownPage.selectFromDropDown("Option 1");
      var selectedOptions = dropDownPage.getSelectedOptions();
     Assert.assertEquals (selectedOptions.size(),1);
     Assert.assertTrue(selectedOptions.contains(option), "option is not selected");
    }

}
