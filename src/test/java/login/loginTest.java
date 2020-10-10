package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class loginTest extends BaseTests {

    @Test
    public void testSucessfulLogin () {
       LoginPage loginPage =  homePage.clickFormAuthentication();
       loginPage.enterUsername("tomsmith");
       loginPage.enterPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage =   loginPage.clickLoginButton();
       assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area! x" , "This is my message: it's passed");


    }
}
