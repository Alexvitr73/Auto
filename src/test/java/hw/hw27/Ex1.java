package hw.hw27;

import hw.hw26.Waiters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.*;

import javax.lang.model.element.Element;
import java.util.Set;

public class Ex1 {

    @Test
    public void checkWebPageFourSite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/uk/");
        Actions actions = new Actions(driver);

        WebElement element = new Waiters(driver).waitToPresenceOfElementLocatedReturn(xpath("//a[text()='Для дорослих']"));
        actions.moveToElement(element).perform();

        WebElement element1 = (new Waiters(driver)).waitForVisabilityOfElementReturn(xpath("//a[text()='FrontEnd']"));
        actions.moveToElement(element1).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

        WebElement element2 = (new Waiters(driver)).waitForVisabilityOfElementReturn(xpath("//a[text()='Java']"));
        actions.moveToElement(element2).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

        WebElement element3 = (new Waiters(driver)).waitForVisabilityOfElementReturn(xpath("//a[text()='Quality Assurance (QA)']"));
        actions.moveToElement(element3).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        assertTrue(driver.getWindowHandles().size() == 4, "Тест не пройден");

        driver.quit();
    }

    @Test
    public void checkReferencePayAndDelivrySiteUhomki() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");

        Actions actions = new Actions(driver);
        WebElement element = new Waiters(driver).waitForElementToBeClickableReturn(xpath("//span[@class='site-menu__item']/a[text()='Оплата и доставка']"));
        actions.moveToElement(element).click().perform();
        assertTrue(driver.getCurrentUrl().equals("https://uhomki.com.ua/ru/oplata-i-dostavka/"), "Тест не пройден");

        driver.quit();
    }

    @Test
    public void searchSmesSpecEresSiteUhomki() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        Actions actions = new Actions(driver);
        WebElement element = new Waiters(driver).waitForVisabilityOfElementReturn(xpath("//input[@name='q']"));
        element.click();
        element.sendKeys("смесь");
        new Waiters(driver).waitForElementToBeClickableReturn(xpath("//a[contains(text(),'результаты')]")).click();
        WebElement element1 = new Waiters(driver).waitForVisabilityOfElementReturn(xpath("//h1[contains(text(),'Результаты')]"));
        assertTrue(element1.getText().contains("смесь"), "Тест не пройден");

        WebElement element2 = new Waiters(driver).waitForVisabilityOfElementReturn(xpath("//input[@name='q']"));
        element2.clear();
        element2.sendKeys("спесь");
        new Waiters(driver).waitForElementToBeClickableReturn(xpath("//button[@class='search__button']")).click();
        WebElement element3 = new Waiters(driver).waitForVisabilityOfElementReturn(xpath("//h1[contains(text(),'Результаты')]"));
        assertTrue(element3.getText().contains("спесь"), "Тест не пройден");

        WebElement element4 = new Waiters(driver).waitForVisabilityOfElementReturn(xpath("//input[@name='q']"));
        element4.clear();
        element4.sendKeys("ересь");
        new Waiters(driver).waitForElementToBeClickableReturn(xpath("//button[@class='search__button']")).click();
        WebElement element5 = new Waiters(driver).waitForVisabilityOfElementReturn(xpath("//h1[contains(text(),'Результаты')]"));
        assertTrue(element5.getText().contains("ересь"), "Тест не пройден");
        driver.quit();
    }

    @Test
    public void testCheckboxGuinnessworldrecords() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebElement checkbox = new Waiters(driver).waitForElementToBeClickableReturn(xpath("//input[@id='RememberMe']"));
        System.out.println("Чек-бокс выбран - " + checkbox.isSelected());
        assertFalse(checkbox.isSelected(), "Чекбокс уже выбран");
        checkbox.click();
        System.out.println("Чек-бокс выбран - " + checkbox.isSelected());
        assertTrue(checkbox.isSelected(), "Чекбокс не выбран");
        checkbox.click();
        System.out.println("Чек-бокс выбран - " + checkbox.isSelected());
        assertFalse(checkbox.isSelected(), "Чекбокс не выбран");
        driver.quit();
    }

    @Test
    public void testAlertShowMe() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        new Waiters(driver).waitForElementToBeClickableReturn(xpath("//input[@value='Show Me Alert']")).click();
        Alert alerts = driver.switchTo().alert();
        assertTrue(alerts.getText().equals("Hi.. This is alert message!"), "Тест не пройден !");
        alerts.accept();
        driver.quit();
    }
}