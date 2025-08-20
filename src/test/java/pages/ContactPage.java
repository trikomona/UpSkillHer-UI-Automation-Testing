package pages;

import maps.ContactMap;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContactPage extends ContactMap {
    //Extendiendo la clase ContactMap para usar los elementos que estan ahí

    public WebDriver driver;//instancia que controla el navegador
    public ContactPage (WebDriver driver) {
        this.driver = driver;
    }//Constructor ContactPAge

    //comienzan los metodos

    //metodo scroll para ubicar el elemento
    public void scroll(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }//scroll

    public void clickOnContact() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(contact));
        scroll(link);
        link.click();
    }//clickOnContact

    public boolean toFindFormInContactSection() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(cardOFForm));
            return true; // El elemento está presente
        } catch (TimeoutException e) {
            return false; // No apareció el elemento en el tiempo dado
        }
    }//isCardOfMapPresent

    public boolean allElementsOfFormIsEnable() {
        boolean allEnabled = true;

        List<By> formElements = List.of(inputName, inputEmail,inputPhone, inputSubject, txtMessage);

        for (By element : formElements) {
            WebElement webElement = driver.findElement(element);
            if (!webElement.isEnabled()) {
                System.out.println("Elemento no habilitado: " + element);
                allEnabled = false;
            }
        }

        return allEnabled;
    }//alElementsOfformIsEnable
//llenado de formulario
    public void fullFormInContactSection(String name, String email, String phone, String subject, String message) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(inputPhone).sendKeys(phone);
        driver.findElement(inputSubject).sendKeys(subject);
        driver.findElement(txtMessage).sendKeys(message);
    }
    public void clickOnButtonOfSubmit (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        scroll(link);
        link.click();

    }//clickOnButtonOfSubmit
    public String messageAfterClickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(msgContact));
        scroll(messageElement);
        return messageElement.getText();
    }//messageAfterClickSubmitButton

}//ContactPage
