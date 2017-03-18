package Test;

import Pages.MainPage;
import Pages.ResultPage;
import Pages.ResultSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Kefir on 16.03.2017.
 */


public class SearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setUP () {
        driver = new ChromeDriver();
        driver.get("https://www.tut.by/");
    }

    @Parameters({"text","textSearch"})
    @Test
    public  void runTest(String text, String textSearch) {
        MainPage mainpage = new MainPage(driver);
        mainpage.btnMenu(text);
        ResultPage resultpage = new ResultPage(driver);
        resultpage.searchByText(textSearch);
        ResultSearchPage analys = new ResultSearchPage(driver);
        analys.resultAnalys(textSearch);
    }

    @AfterMethod
    public void setDown() {
        if (driver != null)
            driver.quit();
    }

}
