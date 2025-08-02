package maps;

import org.openqa.selenium.By;

public class BookingMap {


    //Localizadores de los elementos en seccion Booking que nos lleva a Roonms

    //*****************************SELECCIONAR FECHA PARA RESERVAR*******************
    public By booking = By.xpath("//li[@class='nav-item']//a[text()='Booking']");

    //boton de check in con sus botones de meses next y previous month
    public By checkIn = By.xpath("//label[@for='checkin']/following::input[@class='form-control'][1]");
    public By btnCheckInRightMonth =By.xpath("//button[@aria-label='Next Month']");
    public By btnCheckInLeftMonth = By.xpath("//button[@aria-label='Previous Month']");
    //el día puede cambiar depende la prueba, en este caso esta en 3
    public By btnDayCheckIn = By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='3']");

    //boton checkout con sus botnes de meses next y previous month
    public By checkOut = By.xpath("//label[@for='checkout']/following::input[@class='form-control'][1]");
    public By btnCheckOutRightMonth =By.xpath("//button[@aria-label='Next Month']");
    public By btnCheckOutLeftMonth = By.xpath("//button[@aria-label='Previous Month']");
    //el día puede cambiar depende la prueba, en este caso esta en 15
    public By btnDayCheckOut = By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='15']");
//************************************************TERMINA SELECCIONAR FECHA *****************************


    public  By btnChkAvailability = By.xpath("//button[text()='Check Availability']");

    //rooms para escoger
    public By btnSingleRoom = By.xpath("(//a[@class='btn btn-primary'])[1]");
    public By btnDoubleRoom = By.xpath("(//a[@class='btn btn-primary'])[2]");
    public By btnSuiteRoom = By.xpath( "(//a[@class='btn btn-primary'])[3]");

    //boton Reserv now
    public By btnReserveNow = By.xpath("//button[text()='Reserve Now']");
    //llenado de formulario
    public By inputFirsName = By.xpath("//input[@placeholder='Firstname']");
    public By inputLastName = By.xpath("//input[@placeholder='Lastname']");
    public By inputEmail = By.xpath("//input[@placeholder='Email']");
    public By inputPhone = By.xpath("//input[@placeholder='Phone']");

    //botones debajo de formulario
    public By btnReserveNow2 = By.xpath("//button[text()='Reserve Now']");
    public By btnCancel = By.xpath("//button[text()='Cancel']");

}//Booking Map
