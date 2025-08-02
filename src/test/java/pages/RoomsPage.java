package pages;

import maps.RoomsMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RoomsPage extends RoomsMap {
//extendiendo la clase RoomsMap

    public WebDriver driver;

    public RoomsPage (WebDriver driver) {
        this.driver = driver;
    }//Constructor Rooms section

    public void clickOnRooms() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(rooms));
        link.click();
    }//Rooms

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

    public void clickOnRoomsLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(linkToBackRooms));
        link.click();
    }//linkToBackRoom

    public void clickOnHomeLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(linkToBackHome));
        link.click();
    }//linkToBackHome

    //metodo scroll para ubicar el elemento
    public void scroll(WebElement element){
    Actions actions = new Actions(driver);
    actions.moveToElement(element);
    actions.perform();
    }//scroll

}//RoomsPage
