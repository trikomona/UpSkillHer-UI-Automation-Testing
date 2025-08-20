package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.LocationPage;

public class ContactTests extends Base {

    @Test
    public void validateVisibilityOfFormInContactSection() { //TC-025
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickOnContact();
        Assert.assertTrue(contactPage.toFindFormInContactSection(), "El formulario no está visible");
    }//validateVisibilityOfFormInContactSection

    @Test
    public void validateInputAndTxtAreaInFormIsActive (){ //TC026
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickOnContact();
        contactPage.allElementsOfFormIsEnable();
        Assert.assertTrue(contactPage.allElementsOfFormIsEnable(), "Algunos campos del formulario no están activos.");
    }//validateInputAndTxtAreaInFormIsActive

    @Test
    public void SendFormFromContactSectionSuccessfully (){ //TC-027
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickOnContact();
        contactPage.fullFormInContactSection("Ivone Perez", "ivone@gmail.com",
                "123456789101", "I need help to get one room",
                "Hello i can´t do a reservation i belive that page is broken" );
        contactPage.clickOnButtonOfSubmit();
        contactPage.messageAfterClickSubmitButton();
        String actualMessage = contactPage.messageAfterClickSubmitButton(); //guarda el msj
        String expectedMessage = "Thanks for getting in touch"; // msj esperado
        Assert.assertTrue(
                actualMessage.contains(expectedMessage), //que contenga ese mensaje
                "El mensaje mostrado no contiene el texto esperado. " +
                        "\nEsperado: " + expectedMessage +
                        "\nActual: " + actualMessage
        );
    }//SendFormFromContactSectionSuccessfully

    @Test
    public void fieldsFilledInIncorrectlyWay (){  //TC-028
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickOnContact();
        contactPage.fullFormInContactSection("", "ivone@gmail.com",
                "123456789101", "",
                "Hello i can´t do a reservation i belive that page is broken" );
        contactPage.clickOnButtonOfSubmit();
        String actualMessage = contactPage.messageAfterClickSubmitButton(); //guarda el msj
        String expectedMessage = "Thanks for getting in touch"; // msj esperado
        Assert.assertTrue(
                actualMessage.contains(expectedMessage), //debe fallar por que no parece le mensaje de exito
                "El mensaje mostrado no contiene el texto esperado. " +
                        "\nEsperado: " + expectedMessage +
                        "\nActual: " + actualMessage
        );
    }//fieldsFilledInIncorrectlyWay
    @Test
    public void sectionOfContactDoesNotCharge() { //TC-029
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickOnContact();
        Assert.assertFalse(contactPage.toFindFormInContactSection(), "El formulario sí está visible y no debería estarlo");
    }//sectionOfContactDoesNotCharge



}//ContactTests
