package hw.hw25;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class AutmatizitionGoogle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        String firstDes = driver.getWindowHandle();
        Set<String> set1 = driver.getWindowHandles();

        WebElement searchText = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchText.click();
        searchText.sendKeys("https://www.guinnessworldrecords.com/account/register?"+Keys.ENTER);
        Actions actions= new Actions(driver);
        WebElement element1= driver.findElement(By.xpath("//h3[text()='Create account | Guinness World Records']"));
        Thread.sleep(2000);
        actions.moveToElement(element1).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String> set2=driver.getWindowHandles();
        set2.removeAll(set1);
        String secondDes=set2.iterator().next();

        WebElement elementGoogleX= driver.findElement(By.cssSelector("#tsf>div:nth-child(1)>div.A8SBwf>div.RNNXgb>div>div.dRYYxd>div.BKRPef>div>span>svg>path"));
        Thread.sleep(2000);
        elementGoogleX.click();
        WebElement element2=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        element2.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html"+Keys.ENTER);

        WebElement element3= driver.findElement(By.xpath("//h3[text()='AlertsDemo - H Y R Tutorials']"));
        actions.moveToElement(element3).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(5000);
        Set<String> set3=driver.getWindowHandles();
        set3.removeAll(set1);
        set3.removeAll(set2);
        String thirdDes=set3.iterator().next();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        WebElement iFrame1= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iFrame1);
        WebElement field1= driver.findElement(By.xpath("//input[@id='fname']"));
        field1.clear();
        field1.sendKeys("Oleksandr");
        WebElement field2= driver.findElement(By.xpath("//input[@id='lname']"));
        field2.clear();
        field2.sendKeys("Vitrenko");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(3000);
        WebElement elementTextframe=driver.findElement(By.cssSelector("body>div.w3-panel.w3-pale-yellow.w3-leftbar.w3-border-yellow>p"));
        System.out.println(elementTextframe.getText());

        driver.switchTo().window(secondDes);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Vitrenko");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Oleksandr");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='DateOfBirthDay']")).sendKeys("26");
        driver.findElement(By.xpath("//input[@id='DateOfBirthMonth']")).sendKeys("06");
        driver.findElement(By.xpath("//input[@id='DateOfBirthYear']")).sendKeys("1973");
        WebElement coUNtry = driver.findElement(By.id("Country"));
        Select country = new Select(coUNtry);
        country.selectByValue("UA");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='State']")).sendKeys("Kyiv");
        driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("my@email.ua");
        driver.findElement(By.xpath("//input[@id='ConfirmEmailAddress']")).sendKeys("my@email.ua");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("111111");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("222222"+Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//span[@for='ConfirmPassword']")).getText());

        driver.switchTo().window(thirdDes);
        WebElement alert1=driver.findElement(By.xpath("//button[@id='alertBox']"));
        WebElement alert2=driver.findElement(By.xpath("//button[@id='confirmBox']"));
        WebElement alert3=driver.findElement(By.xpath("//button[@id='promptBox']"));

        alert1.click();
        Alert alertfirst=driver.switchTo().alert();
        alertfirst.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        alert2.click();
        Alert alertSecond=driver.switchTo().alert();
        alertSecond.dismiss();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        alert3.click();
        Alert alertThird=driver.switchTo().alert();
        alertThird.sendKeys(": Final step of this task");
        alertThird.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        driver.quit();

    }

}
