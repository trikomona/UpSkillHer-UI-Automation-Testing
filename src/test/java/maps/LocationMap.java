package maps;

import org.openqa.selenium.By;

public class LocationMap {
    //Localizadores de los elementos en seccion Booking que nos lleva a Location

    public By contactInformation = By.xpath("//h3[text()='Contact Information']");
    public By location = By.xpath("//li[@class='nav-item']//a[text()='Location']");
    public By address = By.xpath("//h5[text()='Address']");
    public By phone = By.xpath("//h5[text()='Phone']");
    public By email = By.xpath("//h5[text()='Email']");
    public By infoTxt = By.xpath("//h4[text()='Getting Here']");
    public By map = By.xpath("//div[@class='pigeon-overlays']");
    //card de Contact Information
    public By cardContactInfo = By.xpath("//div[@class='col-lg-6']//div[@class='card-body']");
    public By cardOfMap = By.xpath("//div[@class='card-body p-0']");


}//LocationMap

