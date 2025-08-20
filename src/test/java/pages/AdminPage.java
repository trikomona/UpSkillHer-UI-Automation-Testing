package pages;

import maps.AdminMap;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage extends AdminMap {
    //extendemos clase AdminMap para traer los elementos encontrados
    public WebDriver driver;//instancia que controla el navegador

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }//Constructor AdminPage

    //comienzan los metodos
    public void scroll(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }//scroll

    public void clickOnAdmin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(admin));
        scroll(link);
        link.click();
    }//clickOnAdmin

    public boolean isCardOfAdminPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(cardLogin));
            return true; // El elemento está presente
        } catch (TimeoutException e) {
            return false; // No apareció el elemento en el tiempo dado
        }
    }//isCardOfAdminPresent

    public void fullFormInAdminSection(String name, String pass) {
        driver.findElement(userName).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
    }//fullFormInAdminSection

    public void clickOnButtonLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        scroll(link);
        link.click();
    }//clickOnButtonLogin

    public boolean isContainerInAdminSection() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(containerInsideAdmin));
            return true; // El elemento está presente
        } catch (TimeoutException e) {
            return false; // No apareció el elemento en el tiempo dado
        }
    }//isCardOfAdminPresent

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(alertMsg));
        return driver.findElement(alertMsg).getText();  //obtiene el mensaje de error
    }
}//getErrorMessage
