package hw.hw22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_10 {

    private static class Url {
        private static final String uHomki = "https://uhomki.com.ua/ru/koshki/1074/";
        private static final String dANat = "https://dan-it.com.ua/";
        private static final String w3schools = "https://www.w3schools.com/";
        private static final String iDea = "https://www.jetbrains.com/idea/";
        private static final String iDeaWindows = "https://www.jetbrains.com/idea/download/#section=windows";


    }

    private static class Locators {
        private static final By findEnterClassName = By.className("userbar__button-text");
        private static final By findClassText = By.linkText("Вход");
        private static final By findXpassText = By.xpath("//span[text () = 'Вход']");
        private static final By findXpassClassName = By.xpath("//span[@class = 'userbar__button-text']");
        private static final By findXpassFirstButtom = By.xpath("//span[@class='site-menu__item is-active']//a[@class='site-menu__link']");
        private static final By findXpassSecondButtom = By.xpath("//a[contains(@class,'products-menu__title-link')][contains(text(),'Собаки/кошки общее')]");
        private static final By allowUkrainian = By.linkText("Українська");
        private static final By textITeducation = By.xpath("//h1[contains(text(),'IT-освіта')]");
        private static final By dEtalies = By.xpath("//a[contains(text(),'Детальніше')]");
        private static final By aQuarims = By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div/div" +
                "/div/div/ul/li[8]/div[2]/ul/li[2]/a/span");
        private static final By tellDANIT = By.xpath("/html/body/header/div/a[2]/span");
        private static final By dANITOFFline = By.xpath("//li[@class='banner-meta__item banner-meta__item--main banner-meta__item--main--offline']" +
                "//p[@class='banner-meta__name']");
        private static final By w3schoolID1 = By.id("navbtn_tutorials");
        private static final By w3schoolID2 = By.id("navbtn_references");
        private static final By w3schoolID3 = By.id("navbtn_exercises");
        private static final By w3schoolID4 = By.id("cert_navbtn");
        private static final By w3schoolID5 = By.id("signupbtn_topnav");
        private static final By w3schoolID6 = By.id("w3loginbtn");
        private static final By w3schoolID7 = By.id("nav_translate_btn");
        private static final By w3schoolID8 = By.id("nav_search_btn");
        private static final By w3schoolID9 = By.id("learntocode_searchbtn");
        private static final By w3schoolID10 = By.id("learntocode_searchbtn");
        private static final By danITStudents = By.xpath("//p[@class ='main-info__title'][1]/../../../div[1]/ul/li[3]");
        private static final By iDeaDownLoad = By.xpath("//a[@class='wt-col-inline menu-second__" +
                "download-button wt-button wt-button_size_s wt-button_mode_primary']");
        private static final By iDeACookies = By.xpath("//button[contains(text(),'ccept All')]");
        private static final By iDeaDownLoadWinLeft = By.xpath("//*[@id=\"download-block\"]/section[1]/div/div/div[2]/div/" +
                "div[1]/div[2]/div[1]/div/div[1]/div/div[2]/span/a");
        private static final By iDeaDownLoadWinRight = By.xpath("//*[@id=\"download-block\"]/section[1]/div/div/div[2]/div" +
                "/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/span/a");


        // ЗАДАНИЕ 1
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
        /*driver.get(Url.uHomki);
        Thread.sleep(2000);*/
//        1-ый тип локатора
//        driver.findElement(Locators.findEnterClassName).click();

//        2-ой тип локатора
//        driver.findElement(Locators.findClassText).click();

//        3-ий тип локатора
//        driver.findElement(Locators.findXpassText).click();

//        4-ий тип локатора
//        driver.findElement(Locators.findEnterClassName).click();

            // ЗАДАНИЕ 2

 /*       driver.findElement(Locators.findXpassFirstButtom).click();
        Thread.sleep(2000);
        driver.findElement(Locators.findXpassSecondButtom).click();*/


            // ЗАДАНИЕ 3

       /* driver.get(Url.dANat);
            Thread.sleep(2000);
        driver.findElement(Locators.allowUkrainian).click();
            Thread.sleep(2000);
            driver.findElement(Locators.textITeducation);
            Thread.sleep(2000);
            driver.findElement(Locators.dEtalies).click();*/

            // ЗАДАНИЕ 4

            /*driver.get(Url.uHomki);
            Thread.sleep(2000);
            driver.findElement(Locators.aQuarims);*/

            // ЗАДАНИЕ 5

           /* driver.get(Url.dANat);
            Thread.sleep(2000);
            driver.findElement(Locators.allowUkrainian).click();
            Thread.sleep(2000);
            driver.findElement(Locators.tellDANIT).click();*/

            // ЗАДАНИЕ 6

           /* driver.get(Url.dANat);
            Thread.sleep(2000);
            driver.findElement(Locators.allowUkrainian).click();
            Thread.sleep(2000);
            driver.findElement(Locators.dANITOFFline);*/

            // ЗАДАНИЕ 7

            /*driver.get(Url.w3schools);
            Thread.sleep(2000);
            driver.findElement(Locators.w3schoolID7).click();*/

            // ЗАДАНИЕ 8

      /*  driver.get(Url.dANat);
        Thread.sleep(2000);
        driver.findElement(Locators.allowUkrainian).click();
        Thread.sleep(2000);
        driver.findElement(Locators.danITStudents);*/

            // ЗАДАНИЕ 9

            driver.get(Url.iDea);
            Thread.sleep(2000);
            driver.findElement(Locators.iDeACookies).click();
            Thread.sleep(2000);
            driver.findElement(Locators.iDeaDownLoad).click();

            // ЗАДАНИЕ 10

        /*driver.get(Url.iDeaWindows);
        Thread.sleep(2000);
        driver.findElement(Locators.iDeACookies).click();
        Thread.sleep(2000);
        driver.findElement(Locators.iDeaDownLoadWinLeft);
        driver.findElement(Locators.iDeaDownLoadWinRight);*/

        }
    }
}

