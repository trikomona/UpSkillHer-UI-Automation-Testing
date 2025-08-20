package tests;
import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LocationPage;

public class LocationTests extends Base {
    @Test
    public void validateContactInfoTextIsPresent() { //TC020
        LocationPage location = new LocationPage(driver);
        location.clickOnLocation();
        location.isTextInContactCard("Contact Information");
        location.isTextInContactCard("Address");
        location.isTextInContactCard("Phone");
        location.isTextInContactCard("Email"); //El assert esta dentro del metodo en LocationPage
    }//validateContactInfoTextIsPresent

    @Test
    public void validateErrorWhenLocationIsLoading (){ //TC021
        LocationPage location = new LocationPage(driver);
        location.clickOnLocation();
        boolean isTextPresent = location.isTextInContactCard("Contact Information"); //si el texto esta presente
        Assert.assertFalse(isTextPresent, "El texto 'Contact Information' apareció, por lo que la página sí cargó (y no debería).");
    }//validateErrorWhenLocationIsLoading

    @Test
    public void validateMapCardIsPresent() { //TC022
        LocationPage location = new LocationPage(driver);
        location.clickOnLocation();
        Assert.assertTrue(location.isCardOfMapPresent(),
                "La tarjeta del mapa no está presente en la página.");
    }//validateMapCardIsPresent

    @Test
    public void validateInformativeTxtInsideCardContactInformation(){ //TC024
        LocationPage location = new LocationPage(driver);
        location.clickOnLocation();
        location.isTextInContactCard("Getting Here");
        //me gustaria validar el mensaje debajo de Getting Here, pero es largo, quiero ver la manera de inresarlo en un archivo de texto, pero no recuerdo ocmo se hace
    }//validateInformativeTxtInsideCardContactInformation


    @Test
    public void validateInteractiveMapInLocationSection (){ //TC023
        LocationPage location = new LocationPage(driver);
        location.clickOnLocation();
        location.clickOnMap();
    }//validateInteractiveMapInLocationSection
}//LocationTests
