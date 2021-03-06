package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication () {
        clickLink("Form Authentication");
        return new LoginPage (driver);
    }

    public DropDownPage clickDropDown () {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHovers () {
        clickLink ("hovers");
        return new HoversPage (driver);
    }

    public KeyPressPage clickKeyPresses() {
    clickLink("Key Presses");
    return new KeyPressPage (driver);
    }

    //generic method
    private void clickLink (String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
