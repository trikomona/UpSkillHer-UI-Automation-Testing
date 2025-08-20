package maps;

import org.openqa.selenium.By;

public class FooterMap {
    public By footer = By.xpath("//footer[@class='bg-dark text-white py-5']");
    //primer div y elementos
    public By div1 = By.xpath("//div[@class='col-md-4']//h5[text()='Shady Meadows B&B']");
    public By faceIcono = By.xpath("//i[@class='bi bi-facebook']");
    public By instaIcono = By.xpath("//i[@class='bi bi-instagram']");
    public By twitterIcono = By.xpath("//i[@class='bi bi-twitter']");
    //segundo div y elementos
    public By div2 = By.xpath("//div[@class='col-md-4']//h5[text()='Contact Us']");

    public By div3 = By.xpath("//div[@class='col-md-4']//h5[text()='Quick Links']");
    public By homeLink = By.xpath("//a[@class='text-white text-decoration-none']");
    public By roomsLink = By.xpath("//a[@class='text-white text-decoration-none']");
    public By bookingink = By.xpath("//a[@class='text-white text-decoration-none']");
    public By contactLink = By.xpath("//a[@class='text-white text-decoration-none']");
    //tercer div
}//FooterMap
