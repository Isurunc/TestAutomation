package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passWordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword (String password) {
        driver.findElement(passWordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton () {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
