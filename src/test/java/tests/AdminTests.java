package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LocationPage;

public class AdminTests extends Base {

    @Test
    public void validateIfCardOfAdminIsPresent (){ //TC021
        AdminPage adminPage = new AdminPage(driver);
        adminPage.clickOnAdmin();
        Assert.assertTrue(adminPage.isCardOfAdminPresent(),"la tarjeta de Admin, no esta preente");
    }//validateErrorWhenLocationIsLoading

    @Test
    public void accessToAdminSectionWithValidCredentials (){ //TC-031 extend
        AdminPage adminPage = new AdminPage(driver);
        adminPage.clickOnAdmin();
        adminPage.fullFormInAdminSection("admin", "password");
        adminPage.clickOnButtonLogin();
        adminPage.isContainerInAdminSection();
        Assert.assertTrue(adminPage.isContainerInAdminSection(), "El contenedor no está presente en la sección de Admin.");
    }//accessToAdminSectionWithValidCredentials

    @Test
    public void accessToAdminSectionWithInvalidCredentials (){ //TC-031
        AdminPage adminPage = new AdminPage(driver);
        adminPage.clickOnAdmin();
        adminPage.fullFormInAdminSection("falso", "falso");
        adminPage.clickOnButtonLogin();
        adminPage.isContainerInAdminSection();
        String expectedMessage = "Invalid credentials";
        Assert.assertEquals(adminPage.getErrorMessage(), expectedMessage, "El mensaje de error no coincide.");
    }//accessToAdminSectionWithInvalidCredentials
}//AdminTests
