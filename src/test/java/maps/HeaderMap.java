package maps;
import org.openqa.selenium.By;


public class HeaderMap {

    //Localizadores o elementos de el encabezado

    public By shadyMeadows = By.xpath("//span[text()='Shady Meadows B&B']");
    public By rooms = By.xpath("//li[@class='nav-item']//a[text()='Rooms']"); //había 2 conicidencias, se busco otra jerarquia
    public By booking = By.xpath("//li[@class='nav-item']//a[text()='Booking']");
    public By  amenities = By.xpath("//li[@class='nav-item']//a[text()='Amenities']");
    public By  location = By.xpath("//li[@class='nav-item']//a[text()='Location']");
    public By  contact = By.xpath("//li[@class='nav-item']//a[text()='Contact']");
    public By  admin = By.xpath("//li[@class='nav-item']//a[text()='Admin']");

    

}//HeaderPageMap

