package maps;

import org.openqa.selenium.By;

public class FooterMap {
    public By footer = By.xpath("//footer[@class='bg-dark text-white py-5']");
    public By div1 = By.xpath("//div[@class='col-md-4']//h5[text()='Shady Meadows B&B']");
    public By div2 = By.xpath("//div[@class='col-md-4']//h5[text()='Contact Us']");
    public By div3 = By.xpath("//div[@class='col-md-4']//h5[text()='Quick Links']");
}//FooterMap
