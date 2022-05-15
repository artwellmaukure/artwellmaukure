package login;

import base.BseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BseTests {
    @Test
    public void testsuccessfullogin(){

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                .contains("You logged into a secure area!") ,
                "Alert text is incorrect");


    }
}
