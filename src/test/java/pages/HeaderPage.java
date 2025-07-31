
package pages;
import maps.HeaderMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HeaderPage extends HeaderMap {
//extendiendo la clase HeaderPageMap en HeaderPage

public WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }//Constructor HeaderPAge


    //metodo para cada uno de los links del encabezado ***nota buscar una manera mas simple
    //en este caso es necesaria la espera por que al abrir la página, no se puede localizar el elemento
    //nota respecto a duración, tal vezlo puedo agregar en el SetUp
    public void clickOnShadyMeadows() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(shadyMeadows));
        link.click();
    }//ShadyMeadows
    public void clickOnRooms() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(rooms));
        link.click();
    }//Rooms
    public void clickOnBooking() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(booking));
        link.click();
    }//Booking
    public void clickOnAmenities() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(amenities));
        link.click();
    }//Amenities
    public void clickOnLocation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(location));
        link.click();
    }//location
    public void clickOnContact() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(contact));
        link.click();
    }//Contact
    public void clickOnAdmin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(amenities));
        link.click();
    }//Admin




}//HeaderPage











