package hw.hw24.Ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenaVideo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
       WebElement firstCircle = driver.findElement(By.cssSelector("body>svg>text"));

        Thread.sleep(10000);
        WebElement secondCircle = driver.findElement(By.cssSelector("body >svg>circle:nth-child(4)"));
        int x= secondCircle.getLocation().x+(secondCircle.getSize().width)/2;
        int y=secondCircle.getLocation().y+(secondCircle.getSize().height)/2;
        actions.dragAndDropBy(firstCircle,x,y).build().perform();
//
        Thread.sleep(10000);
        WebElement firstCircle1= driver.findElement(By.cssSelector("body>svg>text"));
        WebElement secondCircle1=driver.findElement(By.cssSelector("body >svg>circle:nth-child(4)"));

        actions.dragAndDrop(firstCircle1,secondCircle1).build().perform();

//
        Thread.sleep(10000);
        WebElement firstCircle2= driver.findElement(By.cssSelector("body>svg>text"));
        WebElement secondCircle2 = driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)"));
        actions.moveToElement(firstCircle2).clickAndHold().moveToElement(secondCircle2,8,8).release().build().perform();
//
        Thread.sleep(10000);
        WebElement firstCircle3= driver.findElement(By.cssSelector("body>svg>text"));
        WebElement secondCircle3 = driver.findElement(By.cssSelector("body >svg>circle:nth-child(4)"));
        actions.moveToElement(firstCircle3).clickAndHold().moveToElement(secondCircle3).release().build().perform();

//
        Thread.sleep(10000);
        WebElement firstCircle4= driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)"));
        WebElement secondCircle4 = driver.findElement(By.cssSelector("body >svg>circle:nth-child(4)"));
        actions.dragAndDrop(firstCircle4,secondCircle4).build().perform();
//
        Thread.sleep(10000);
        WebElement firstCircle5= driver.findElement(By.cssSelector("body>svg>circle:nth-child(7)"));
        WebElement secondCircle5 = driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)"));
        actions.moveToElement(firstCircle5).clickAndHold().moveToElement(secondCircle5,8,8).release().build().perform();
//
        Thread.sleep(10000);
        WebElement firstCircle6= driver.findElement(By.cssSelector("body>svg>circle:nth-child(7)"));
        WebElement secondCircle6 = driver.findElement(By.cssSelector("body >svg>circle:nth-child(4)"));
        /*int x6= secondCircle5.getLocation().x+(secondCircle6.getSize().width)/2;
        int y6=secondCircle5.getLocation().y+(secondCircle6.getSize().height)/2;*/
        actions.moveToElement(firstCircle6).clickAndHold().moveToElement(secondCircle6,8,-8).release().build().perform();
//
        Thread.sleep(10000);
        WebElement finishText = driver.findElement(By.cssSelector("#postcard-back-content > textarea"));
        finishText.click();
        finishText.sendKeys("Задание выполнено !!! УРА !!!");
        Thread.sleep(2000);
        finishText.sendKeys(Keys.ENTER);

        driver.quit();
    }
}
