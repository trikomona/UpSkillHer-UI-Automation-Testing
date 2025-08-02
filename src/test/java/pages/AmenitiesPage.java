package pages;

import maps.AmenitiesMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmenitiesPage extends AmenitiesMap {
    public WebDriver driver;

    public AmenitiesPage (WebDriver driver) {
        this.driver = driver;
    }//Constructor AmenitiesPAge

    public void scroll(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }//scroll

    public void clickOnAmenities() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(amenities));
        scroll(link);
        link.click();
    }//Booking

    public boolean isAmenitiesSectionDisplayed() {  //Validar que aparezca la palabra amenites en la seccion amenities
        List<WebElement> elements = driver.findElements(sectionAmenities);
        return !elements.isEmpty() && elements.get(0).isDisplayed(); //esta vacio o si lo muestra
    }//isAmenitiesSectionDisplayed
}//AmenitiesPage
