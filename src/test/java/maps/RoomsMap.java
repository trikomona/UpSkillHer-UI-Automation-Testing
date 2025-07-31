package maps;

import org.openqa.selenium.By;

public class RoomsMap {

    //Localizadores de los elementos en pagina Rooms

    public By rooms = By.xpath("//li[@class='nav-item']//a[text()='Rooms']");
    public By btnSingleRoom = By.xpath("(//a[@class='btn btn-primary'])[1]");
    public By btnDoubleRoom = By.xpath("(//a[@class='btn btn-primary'])[2]");
    public By btnSuiteRoom = By.xpath("(//a[@class='btn btn-primary'])[3]");

    //en el link de LinkToBackRooms use un xpath anidado, usando el and para agregar el sig el,ento del tag
    public By linkToBackRooms = By.xpath("//a[@class='text-decoration-none' and text()='Rooms']");
    public By linkToBackHome = By.xpath("//a[@class='text-decoration-none' and text()='Home']");

}//RoomsMap
