package tests;

import base.Base;
import pages.HeaderPage;
import org.testng.annotations.Test;

public class HeaderTests extends Base {
    //pruebas TC-001 a TC-008, PERO Amenities en teoria deberia fallar, por que no carga nada

    @Test
    public void ClickOnLinkShadyMeadowsOfHeader() {
        HeaderPage header = new HeaderPage(driver);  //instancia la clase
        //se comienza a llamar con los metodos
        header.clickOnShadyMeadows();   // Hace clic en Shady Meadows
    }//ClickOnLinkShadyMeadowsOfHeader
    @Test
    public void ClickOnLinkRoomsOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnRooms();
    }
    @Test
    public void ClickOnLinkBookingOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnBooking();
    }
    @Test
    public void ClickOnLinkAmentiesOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnAmenities();
    }
    @Test
    public void ClickOnLinkLocationOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnLocation();
    }
    @Test
    public void ClickOnLinkContactOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnContact();
    }
    @Test
    public void ClickOnLinkAdminOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnAdmin();
    }

}//HeaderTests
