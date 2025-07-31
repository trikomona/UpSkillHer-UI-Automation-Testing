package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.RoomsPage;

public class RoomsTest extends Base {

    @Test

    public void SuccessfullyPageLoadedAndRoomsVisible (){
        RoomsPage rooms = new RoomsPage(driver);
        rooms.clickOnRooms();   // Hace clic en link Rooms

        //repito esa serie por que el link de Rooms no esta habilitado
        rooms.clickOnBtnSingleRoom(); //click en boton de habitacion Single
        rooms.clickOnHomeLink(); //click en link regresar a Home
        rooms.clickOnRooms();   // Hace clic en link Rooms

        rooms.clickOnBtnDoubleRoom(); //click en boton de habitacion doble
        rooms.clickOnHomeLink(); //click en link regresar a Home
        rooms.clickOnRooms();   // Hace clic en link Rooms

        rooms.clickOnBtnSuiteRoom(); //click en boton de habitacion Suite
        rooms.clickOnHomeLink(); //click en link regresar a Home
        rooms.clickOnRooms();   // Hace clic en link Rooms

    }//SuccessfullyPageLoadedAndRoomsVisible
}//RoomsTests
