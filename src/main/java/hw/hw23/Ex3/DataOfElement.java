package hw.hw23.Ex3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataOfElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");

        nEwElement(driver, "//input[@name='radio_theme_mode']");

        //  Для проверки //a[@id='signupbtn_topnav']
                         //input[@name='radio_theme_mode']
    }

    static void nEwElement(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));

        try {
            if ((element.getAttribute("id") == "")) {
                throw new NullAttribute();
            } else {
                System.out.println("Аттрибут id = " + element.getAttribute("id"));
            }
        } catch (NullAttribute name) {
            System.out.println("Аттрибут id - " + name.getMessage());
        }
//
        try {
            if ((element.getTagName() == "")) {
                throw new NullAttribute();
            } else {
                System.out.println("Аттрибут tag name = " + element.getTagName());
            }
        } catch (NullAttribute name) {
            System.out.println("Аттрибут tag name - " + name.getMessage());
        }
//
        try {
            if ((element.getAttribute("class") == "")) {
                throw new NullAttribute();
            } else {
                System.out.println("Аттрибут class = " + element.getAttribute("class"));
            }
        } catch (NullAttribute name) {
            System.out.println("Аттрибут class - " + name.getMessage());
        }
//
        try {
            if ((element.getAttribute("name") == "")) {
                throw new NullAttribute();}
            else {
                System.out.println("Аттрибут name = " + element.getAttribute("name"));}
        }
        catch (NullAttribute name) {
            System.out.println("Аттрибут name = " + name.getMessage());
        }
//
        try {
            if (element.getText() == "") {
                throw new NullAttribute();
            } else {
                System.out.println("Аттрибут text = " + element.getText());
            }
        } catch (NullAttribute name) {
            System.out.println("Аттрибут text - " + name.getMessage());
        }
//

        System.out.println("Координаты центра элемента = "+(element.getLocation().x + (element.getSize().width) / 2) +
                ";" + ((element.getLocation().y + (element.getSize().height) / 2)));
        driver.quit();
    }

}

