package maps;

import org.openqa.selenium.By;

public class ContactMap {
    public By contact = By.xpath("//li[@class='nav-item']//a[text()='Contact']");
    public By cardOFForm = By.xpath("//div[@class='card shadow']");
    //campos de los formularios
    public By inputName = By.xpath("//input[@id='name']");
    public By inputEmail = By.xpath("//input[@id='email']");
    public By inputPhone = By.xpath("//input[@id='phone']");
    public By inputSubject = By.xpath("//input[@id='subject']");
    public By txtMessage = By.xpath("//textarea[@id='description']");
    //boton de sumbit
    public By btnSubmit = By.xpath("//button[@class='btn btn-primary']");
    public By msgContact = By.xpath("//h3[text()='Thanks for getting in touch ']");
}//ContactMap
