package hw.hw23.Ex5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoWay {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("Хорек");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='search-results__img']")).click();
        driver.findElement(By.xpath("//span[text()='К сравнению']")).click();
        driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("Медведь");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='Белый медведь 6х5х6см']")).click();
        driver.findElement(By.xpath("//span[text()='К сравнению']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Сравнение']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='compare-close j-close']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
