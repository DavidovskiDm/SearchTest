package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kefir on 18.03.2017.
 */
public class ResultPage {
    private WebDriver driver;
    private String menuLocator = "//*[contains(@class, 'bloko-control-group__main')]/input";

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public void searchByText(String textSearch) {
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(menuLocator))));
        driver.findElement(By.xpath(String.format(menuLocator)));

        WebElement search = driver.findElement(By.xpath(String.format(menuLocator)));
        search.click();
        search.sendKeys(textSearch);
        search.submit();
    }

}
