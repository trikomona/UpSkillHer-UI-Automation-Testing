package pages;

import maps.BookingMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookingPage extends BookingMap {
    //extendiendo la clase de BookingMap para traernos los elementos

    public WebDriver driver;

    public BookingPage (WebDriver driver) {
        this.driver = driver;
    }//Constructor Booking section

    //comienzan metodos para pruebas
    //metodo scroll para ubicar el elemento
    public void scroll(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }//scroll


    public void clickOnBooking() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(booking));
        scroll(link);
        link.click();
    }//Booking

    //Seleccionar el recuadro para activar calendario Check in *********************************
    public void selectInputToChooseCheckIn () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(checkIn));
        scroll(link);
        link.click();
    }//SelectInputToChooseCheckIn

    //seleccionar mes y dia de check in
    public void selectMonthToCheckIn () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnCheckInRightMonth));
        link.click();
        //nota puede ser que necesite el metodo scroll tambien
    }//SelectMonthToCheckIn

    public void selectMonthWrongToCheckIn (){             //escoge mes atras es decir mes pasado
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnCheckInLeftMonth));
            link.click();

    }//SelectMonthWrongToCheckIn
    public void selectDayToCheckIn (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnDayCheckIn));
        scroll(link);
        link.click();
        //try {
          //  Thread.sleep(5000);
        //} catch (InterruptedException e) {
         //   e.printStackTrace();
        //}
    }//SelectDayToCheckIn

    //Seleccionar el recuadro para activar calendario Check Out *******************************
    public void selectInputToChooseCheckOut () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(checkOut));
        scroll(link);
        link.click();
    }//SelectInputToChooseCheckIn

    //seleccionar mes y dia de check in
    public void selectMonthToCheckOut (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnCheckOutRightMonth));
        link.click();
        //nota puede ser que necesite el metodo scroll tambien
    }//SelectMonthToCheckOut
    public void selectDayToCheckOut (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnDayCheckOut));
        scroll(link);
        link.click();

    }//SelectDayToCheckIn

    public void clickButtonOfAvailabilityAfterChooseDate (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnChkAvailability));
        scroll(link);
        link.click();

    }//ClickButtonOfAvailabilityAfterChooseDate

    //****************************Rooms***********************************************
    public void clickOnBtnSingleRoom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnSingleRoom));
        scroll(link); //metodo scroll, se usa para encontrar el elemento
        link.click();
    }//btnSingleRoom

    public void clickOnBtnDoubleRoom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnDoubleRoom));
        scroll(link);
        link.click();
    }//btnDoubleRoom

    public void clickOnBtnSuiteRoom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnSuiteRoom));
        scroll(link);
        link.click();
    }//btnSuiteRoom



    public void clickOnBtnReserveNow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnReserveNow));
        scroll(link);
        link.click();
    }//clickOnBtnReserveNow

    public String getBookingConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement confirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Booking Confirmed')]")));
        return confirmation.getText(); // trim() elimina espacios al inicio o final
    }

  // **************************Forumulario*****************************************************
  public void fillFormWithKeys(String firstName, String lastName, String email, String phone) {
      driver.findElement(inputFirsName).sendKeys(firstName);
      driver.findElement(inputLastName).sendKeys(lastName);
      driver.findElement(inputEmail).sendKeys(email);
      driver.findElement(inputPhone).sendKeys(phone);
      try {
       Thread.sleep(3000);
      } catch (InterruptedException e) {  //lo agregue con la finalidad de ver el comportamiento, se debe borrar
        e.printStackTrace();
      }
  }//fillFormWithKeys


    public void clickCancelReservation() {
        WebElement cancelBtn = driver.findElement(btnCancel);
        scroll(cancelBtn);
        cancelBtn.click();
    }//clickCancelReservation

    public String getMessageText(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement messageElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(msjNameIsRequired)
        );
        return messageElement.getText();
    }

}//BookingPage

