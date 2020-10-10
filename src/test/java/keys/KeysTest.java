package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class KeysTest extends BaseTests {

    @Test
    public void testBackSpace () {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
       Assert.assertEquals((keyPage.getResult()), "You entered: BACK_SPACE");
    }

}
