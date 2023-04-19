package hw.hw23.Ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Fivepages {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://uhomki.com.ua/ru/koshki/1074/");
        String decr1 = driver.getWindowHandle();
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String decr2 = set2.iterator().next();
        driver.switchTo().window(decr2);
        driver.navigate().to("https://zoo.kiev.ua/");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set3 = driver.getWindowHandles();
        set3.removeAll(set1);
        set3.removeAll(set2);
        String decr3 = set3.iterator().next();
        driver.switchTo().window(decr3);
        driver.navigate().to(" https://www.w3schools.com/");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set4 = driver.getWindowHandles();
        set4.removeAll(set1);
        set4.removeAll(set2);
        set4.removeAll(set3);
        String decr4 = set4.iterator().next();
        driver.switchTo().window(decr4);
        driver.navigate().to(" https://taxi838.ua/ru/dnepr/");
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> set5 = driver.getWindowHandles();
//        System.out.println(set5);
        set5.removeAll(set1);
        set5.removeAll(set2);
        set5.removeAll(set3);
        set5.removeAll(set4);
        String decr5 = set5.iterator().next();
        driver.switchTo().window(decr5);
        driver.navigate().to(" https://klopotenko.com/");

        ArrayList<String> descritions = new ArrayList<>(driver.getWindowHandles());
        for (String decr : descritions) {
            driver.switchTo().window(decr);
            Thread.sleep(2000);
            System.out.println("URL : " + driver.getCurrentUrl());
            System.out.println("Title : " + driver.getTitle());
            if (driver.getTitle().contains("зоопарк")) {
                driver.close();}
            }
        driver.quit();
        }
    }