package maps;

import org.openqa.selenium.By;

public class AdminMap {
    public By admin = By.xpath("//li[@class='nav-item']//a[text()='Admin']");
    //login
    public By cardLogin = By.xpath("//div[@class='card']");
    public By userName = By.xpath("//input[@id='username']");
    public By password = By.xpath("//input[@id='password']");
    public By btnLogin = By.xpath("//button[@type='submit']");
    public By containerInsideAdmin = By.xpath("//div[@class='container']");
    public By alertMsg = By.xpath("//div[text()='Invalid credentials']");

}//AdminMap
