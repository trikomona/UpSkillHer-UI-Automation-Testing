package tests;
import base.Base;
import org.testng.Assert;
import pages.HeaderPage;
import org.testng.annotations.Test;

public class HeaderTests extends Base {
    //pruebas TC-001 a TC-007, PERO Amenities en teoria deberia fallar, por que no carga nada

    @Test
    public void ClickOnLinkShadyMeadowsOfHeader() {
        HeaderPage header = new HeaderPage(driver);  //instancia la clase
        //se comienza a llamar con los metodos
        header.clickOnShadyMeadows();   // Hace clic en Shady Meadows
        //Validación con assert para corroborar la prueba
        Assert.assertTrue(driver.getCurrentUrl().contains("automationintesting.online"),
                "No es la URL esperada");
    }//ClickOnLinkShadyMeadowsOfHeader

    @Test
    public void ClickOnLinkRoomsOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnRooms();
        Assert.assertTrue(driver.getCurrentUrl().contains("#rooms"),
                "No es la URL esperada");
    }//ClickOnLinkRoomsOfHeader

    @Test
    public void ClickOnLinkBookingOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnBooking();
        Assert.assertTrue(driver.getCurrentUrl().contains("#booking"),
                "No es la URL esperada");
    }//ClickOnLinkBookingOfHeader

    @Test
    public void ClickOnLinkAmentiesOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnAmenities();
        Assert.assertTrue(driver.getCurrentUrl().contains("#amenities"),
                "No es la URL esperada");;
    }//ClickOnLinkAmentiesOfHeader

    @Test
    public void ClickOnLinkLocationOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnLocation();
        Assert.assertTrue(driver.getCurrentUrl().contains("#location"),
                "No es la URL esperada");;
    }//ClickOnLinkLocationOfHeader

    @Test
    public void ClickOnLinkContactOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnContact();
        Assert.assertTrue(driver.getCurrentUrl().contains("#contact"),
                "No es la URL esperada");
    }//ClickOnLinkContactOfHeader

    @Test
    public void ClickOnLinkAdminOfHeader() {
        HeaderPage header = new HeaderPage(driver);
        header.clickOnAdmin();
        Assert.assertTrue(driver.getCurrentUrl().contains("/admin"),
                "No es la URL esperada");
    }//ClickOnLinkAdminOfHeader

}//HeaderTests
