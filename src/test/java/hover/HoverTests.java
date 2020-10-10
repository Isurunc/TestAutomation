package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {

    @Test
    public void hoverUser1 () {
      var hoversPage = homePage.clickHovers();
      var caption = hoversPage.hoverOverFigures(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name", "Caption is displayed");
        Assert.assertEquals(caption.getLink(), "view Profile", "Caption link text is displayed");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "link incorrect");
    }
}
