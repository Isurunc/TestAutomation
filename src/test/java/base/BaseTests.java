package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        // inputsLink.click();
        // List<WebElement> links = driver.findElements(By.tagName("a"));
//  System.out.println(links.size());
// System.out.println(driver.getTitle());
    }

    @AfterClass
   public void tearDown () {
       driver.close();
       driver.quit();
        }


}
