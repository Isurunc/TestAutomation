package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By hoverOver = By.

    public  HoversPage (WebDriver driver) {
        this.driver = driver;
    }
   public Void hoverOverFigures (int index) {
       Actions actions = new Actions(driver);
       actions.moveToElement()
   }

}
