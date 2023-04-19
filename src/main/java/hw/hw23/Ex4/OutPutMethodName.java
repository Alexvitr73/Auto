package hw.hw23.Ex4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class OutPutMethodName {
    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");

        //Список 1 - xpath1=//a[@class='products-menu__title-link']
        //Список 2 - xpath1= //li[@class='footer__menu-item ']

        lIstOfElement(driver,"//li[@class='footer__menu-item ']");
    }
    static void lIstOfElement(WebDriver driver, String xpath1) throws InterruptedException {

        driver.findElements(By.xpath(xpath1));
        Thread.sleep(2000);
        ArrayList<WebElement> listOfElem = new ArrayList<>(driver.findElements(By.xpath(xpath1)));
        for(WebElement webElement:listOfElem){
            System.out.println(webElement.getText());
        }
        driver.quit();

}
}
