package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

    public WebDriver driver;  //public para que se pueda acceder a el desde otras clases



    @BeforeMethod

    public void setUp() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationintesting.online/");

    }//SetUp

    @AfterMethod

    public void tearDown() {

        driver.quit(); //Cerrar navegador

        //se debe comentar eldriver.quit(); y agregar esta instruccion para ver si esta haciendo lo correcto
        // public void tearDown() throws InterruptedException {
    }//tearDown

}//Base Class
