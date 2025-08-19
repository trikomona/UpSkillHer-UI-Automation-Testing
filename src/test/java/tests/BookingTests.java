package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookingPage;

public class BookingTests extends Base {

    @Test
    public void CompleteFlowValidationToBookARoomWithValidKeys (){ //TC-011
        BookingPage booking = new BookingPage(driver);
        booking.clickOnBooking();
        booking.selectInputToChooseCheckIn();
        booking.selectMonthToCheckIn();
        booking.selectDayToCheckIn();
        booking.selectInputToChooseCheckOut();
        booking.selectMonthToCheckOut();
        booking.selectDayToCheckOut();
        booking.clickButtonOfAvailabilityAfterChooseDate();
        booking.clickOnBtnSingleRoom();
        booking.clickOnBtnReserveNow();
        booking.fillFormWithKeys("Pablito", "Camargo", "pablitocam@gmail.com", "9234067891234");
        booking.clickOnBtnReserveNow();
        String message = booking.getBookingConfirmationMessage(); //revisar este metodo por que falla la pagina
        Assert.assertTrue(message.contains("Booking Confirmed"), "El mensaje de confirmación no coincide");
    }//CompleteFlowValidationToBookARoomWithValidKeys


    @Test
    public void CompleteFlowValidationToBookARoomWithInvalidDates () {//TC-012
        BookingPage booking = new BookingPage(driver);
        booking.clickOnBooking();
        booking.selectInputToChooseCheckIn();
        booking.selectMonthWrongToCheckIn(); //esto me daría meses atras para la reserva
        booking.selectMonthWrongToCheckIn();
        booking.selectDayToCheckIn();
        booking.selectInputToChooseCheckOut();
        booking.selectMonthToCheckOut();
        booking.selectDayToCheckOut();
        booking.clickButtonOfAvailabilityAfterChooseDate();
        booking.clickOnBtnSingleRoom();
        booking.clickOnBtnReserveNow();
        booking.fillFormWithKeys("Juanita", "Perez", "juanitaperez@gmail.com", "1234567891234");
        booking.clickOnBtnReserveNow();
    }//CompleteFlowValidationToBookARoomWithInvalidKeys

    @Test
    public void FillTheFormPartiallyWithOutName () {   //TC-014   deberia fallar sin el nombre
        BookingPage booking = new BookingPage(driver);
        booking.clickOnBooking();
        booking.selectInputToChooseCheckIn();
        booking.selectMonthToCheckIn();
        booking.selectDayToCheckIn();
        booking.selectInputToChooseCheckOut();
        booking.selectMonthToCheckOut();
        booking.selectDayToCheckOut();
        booking.clickButtonOfAvailabilityAfterChooseDate();
        booking.clickOnBtnSingleRoom();
        booking.clickOnBtnReserveNow();
        booking.fillFormWithKeys("", "Camargo", "pablitocam@gmail.com", "9234067891234");
        booking.clickOnBtnReserveNow();
    }//FillTheFormPartiallyWithOutName


    @Test
    public void ValidateFuncionalityOfCancelButton () { //TC-0015
        BookingPage booking = new BookingPage(driver);
        booking.clickOnBooking();
        booking.selectInputToChooseCheckIn();
        booking.selectMonthToCheckIn();
        booking.selectDayToCheckIn();
        booking.selectInputToChooseCheckOut();
        booking.selectMonthToCheckOut();
        booking.selectDayToCheckOut();
        booking.clickButtonOfAvailabilityAfterChooseDate();
        booking.clickOnBtnSingleRoom();
        booking.clickOnBtnReserveNow();
        booking.fillFormWithKeys("Dino", "Cazares", "dinocazam@gmail.com", "9634437897834");
        booking.clickCancelReservation();
    }//ValidateFuncionalityOfCancelButton


}//BookingTests
