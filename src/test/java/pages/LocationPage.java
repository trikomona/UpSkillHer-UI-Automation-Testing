package pages;

import maps.LocationMap;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LocationPage extends LocationMap {
    //extendiendo la clase de LocationMap para traernos los elementos

    public WebDriver driver;
    public LocationPage (WebDriver driver) {
        this.driver = driver;
    }//Constructor Location section

    //comienzan metodos para pruebas*********************************************

    //metodo scroll para ubicar el elemento
    public void scroll(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }//scroll

    public void clickOnLocation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(location));
        scroll(link);
        link.click();
    }//clickOnLocation

    //card de Contact Information

    public boolean isTextInContactCard(String text) {
        WebElement card = driver.findElement(cardContactInfo);
        Assert.assertTrue(card.getText().contains(text), "Este texto no esta dentro de la card Conact Information");
      return true;
    }//isTextInConactCard


    public void clickOnMap() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mapElement = wait.until(ExpectedConditions.elementToBeClickable(map));

        try {
            mapElement.click(); //da click en el mapa
            Assert.assertTrue(true, "El mapa respondió al click correctamente.");
        } catch (Exception e) {
            Assert.fail("No se pudo hacer click en el mapa: " + e.getMessage());
        }
    }//clickOnMap

    public boolean isCardOfMapPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(cardOfMap));
            return true; // El elemento está presente
        } catch (TimeoutException e) {
            return false; // No apareció el elemento en el tiempo dado
        }
    }//isCardOfMapPresent

}//LocationPage
