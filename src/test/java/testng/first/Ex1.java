package testng.first;

import hw.hw26.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertNotEquals;

public class Ex1 {

    @Test
    public void checkWebPageTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://klopotenko.com/");
        WebElement element = (new Waiters(driver).waitToPresenceOfElementLocatedReturn(By.xpath("//a[@aria-label='dismiss cookie message']")));
        element.click();
        assertTrue(driver.getTitle().equals("Євген Клопотенко - Кулінарні рецепти від Євгена Клопотенка"), "Названия страниц не совпадают, я ожидал другого");
        assertFalse(driver.getTitle().equals("Євген Клоп4отенко - Кулінарні рецепти від Євгена Клопотенка"), "Названия страниц не совпадают," +
                " я ожидал другого");
        assertEquals(driver.getTitle(), "Євген Клопотенко - Кулінарні рецепти від Євгена Клопотенка", "Названия страниц не совпадают");
        assertNotEquals(driver.getTitle(), "Євген Клопот4енко - Кулінарні рецепти від Євгена Клопотенка", "Названия страниц не совпадают");
        driver.quit();
    }
}
