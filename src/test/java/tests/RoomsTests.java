package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.RoomsPage;

public class RoomsTests extends Base {
//prueba TC-009-TC-010

    @Test

    public void SuccessfullyPageLoadedAndRoomsVisible (){
        RoomsPage rooms = new RoomsPage(driver);
        rooms.clickOnRooms();   // Hace clic en link Rooms

        //probar Single Room
        rooms.clickOnBtnSingleRoom(); //click en boton de habitacion Single
        rooms.clickOnHomeLink(); //click en link regresar a Home
        rooms.clickOnRooms();   // Hace clic en link Rooms

        rooms.clickOnBtnDoubleRoom(); //click en boton de habitacion doble
        rooms.clickOnHomeLink();
        rooms.clickOnRooms();

        rooms.clickOnBtnSuiteRoom(); //click en boton de habitacion Suite
        rooms.clickOnHomeLink(); //click en link regresar a Home
        rooms.clickOnRooms();   // Hace clic en link Rooms

    }//SuccessfullyPageLoadedAndRoomsVisible
}//RoomsTests
