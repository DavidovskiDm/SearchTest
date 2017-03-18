package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertFalse;

/**
 * Created by Kefir on 18.03.2017.
 */
public class ResultSearchPage {
    private WebDriver driver;
    private String menuLocator = "//*[contains(@class, 'search-result-item__head')]//a[contains(.,'%s')]";

    public ResultSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void resultAnalys(String text) {
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(menuLocator, text))));
        driver.findElement(By.xpath(String.format(menuLocator, text)));

        List<WebElement> elements = driver.findElements(By.xpath(String.format(menuLocator, text)));
        assertFalse(elements.size()==0);
    }
    }
