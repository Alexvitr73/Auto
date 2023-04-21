package hw.hw24.Ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class ChoiceAuto {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        WebElement markaAuto = driver.findElement(By.id("Carlist"));
        Select MarkaAuto = new Select(markaAuto);
        MarkaAuto.selectByValue("Renault Car");
        List<WebElement> elements = MarkaAuto.getOptions();
        System.out.println("Автомобили доступные для выбора : ");
        for (WebElement element : elements) {
            System.out.print(element.getText() + ", ");
            System.out.print("\b\b.");
        }
        WebElement countryRightSelect = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select CountryRightSelect = new Select(countryRightSelect);
        CountryRightSelect.selectByVisibleText("France");
        CountryRightSelect.selectByVisibleText("Germany");
        CountryRightSelect.selectByVisibleText("Italy");
        CountryRightSelect.selectByVisibleText("Spain");
        WebElement arrowRight = driver.findElement(By.xpath("//input[@value='->']"));
        arrowRight.click();
        Thread.sleep(2000);

        WebElement dataLeft = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select CountryLeftTable = new Select(dataLeft);
        List<WebElement> elements1 = CountryLeftTable.getOptions();
        System.out.println("\nСтраны из первой таблицы : ");
        for (WebElement element : elements1) {
            System.out.print(element.getText() + ", ");
        }
        System.out.print("\b\b.");

        WebElement dataRight = driver.findElement(By.xpath("//select[@name='ToLB']"));
        Select CountryRightTable = new Select(dataRight);
        List<WebElement> elements2 = CountryRightTable.getOptions();
        System.out.println("\nСтраны из второй таблицы : ");
        for (WebElement element : elements2) {
            System.out.print(element.getText() + ", ");
        }
        System.out.print("\b\b.");

        driver.quit();
    }

}
