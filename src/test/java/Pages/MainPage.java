package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kefir on 16.03.2017.
 */
public class MainPage {
    private WebDriver driver;
    private String menuLocator = "//*[contains(@id, 'mainmenu')]//a[contains(.,'%s')]";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void btnMenu(String text) {
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(menuLocator, text))));
        driver.findElement(By.xpath(String.format(menuLocator, text)));
        WebElement login = driver.findElement(By.xpath(String.format(menuLocator, text)));
        login.click();
    }
}