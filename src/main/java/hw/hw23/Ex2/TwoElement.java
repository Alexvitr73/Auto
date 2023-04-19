package hw.hw23.Ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class TwoElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");

        tWoElement(driver,"//a[text()='Apply now']","//a[text()='APPLY']");
        Thread.sleep(2000);
        driver.quit();

    }
    static void tWoElement(WebDriver driver, String xpath1, String xpath2) {

        WebElement element1 = driver.findElement(By.xpath(xpath1));
        WebElement element2 = driver.findElement(By.xpath(xpath2));

        if (element1.getLocation().y < element2.getLocation().y) {
            System.out.println("Первый элемент находится выше второго");
        }
        if (element1.getLocation().x > element2.getLocation().x) {
            System.out.println("Второй элемент находиться выше первого");
        }
        else if(element1.getLocation().y == element2.getLocation().y) {
            System.out.println("Элементы находятся на одной линии по горизонтали");
        }

            if (element1.getLocation().x < element2.getLocation().x) {
                System.out.println("Первый элемент находится левее второго");
            }
            if (element1.getLocation().x > element2.getLocation().x) {
                System.out.println("Второй элемент находиться левее первого");
            }
            else if (element1.getLocation().x == element2.getLocation().x) {
                System.out.println("Элементы находятся на одной линии по вертикали");
            }

        if ((element1.getSize().height*element1.getSize().width) < (element2.getSize().height*element2.getSize().width)) {
            System.out.println("Площадь второго элемента больше первого");
        }
        if ((element1.getSize().height*element1.getSize().width) > (element2.getSize().height*element2.getSize().width)) {
            System.out.println("Площадь первого элемента больше второго");
        }
        else if ((element1.getSize().height*element1.getSize().width) == (element2.getSize().height*element2.getSize().width)) {
            System.out.println("Площади элементов равны");
        }
            }
    }