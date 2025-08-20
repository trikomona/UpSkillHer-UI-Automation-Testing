package pages;

import maps.FooterMap;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FooterPage extends FooterMap {
    //Se extiende la clase para traer los elementos encontrados
    public WebDriver driver;//instancia que controla el navegador

    public FooterPage(WebDriver driver) {
        this.driver = driver;
    }//Constructor FooterPage

    //comienzan los metodos
    public void scroll(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }//scrollr;//instancia que controla el navegador

    public boolean isFooterPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(footer));
            return true; // El elemento está presente
        } catch (TimeoutException e) {
            return false; // No apareció el elemento en el tiempo dado
        }
    }//isFooterPresent

    public void validationOfFooter (){
        String actualText = driver.findElement(div1).getText();
        String expectedText = "Shady Meadows B&B";
        Assert.assertEquals(actualText, expectedText, "El texto en el footer no coincide.");
    }
    public void clickAndValidateFooterIcon(By element, String expectedWord) {
        WebElement el = driver.findElement(element);
        String text = el.getText();

        if (text == null || text.isEmpty()) {
            text = el.getAttribute("title");
        }
        if (text == null || text.isEmpty()) {
            text = el.getAttribute("aria-label");
        }
        // Validamos que contenga la palabra esperada
        Assert.assertTrue(text != null && text.toLowerCase().contains(expectedWord.toLowerCase()),
                "El elemento '" + text + "' no contiene la palabra esperada: " + expectedWord);

        el.click();
    }//clickAndValidateFooterIcon

}//FooterPage
