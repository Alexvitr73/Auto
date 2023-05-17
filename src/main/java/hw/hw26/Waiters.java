package hw.hw26;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

public class Waiters {
    private final WebDriver driver;
    private static final long EXPLICITY_WAIT = 20;

    public Waiters(WebDriver driver) {
        this.driver = driver;
    }


    private FluentWait<WebDriver> fluentWait(Long duration) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    private void waitForFunction(Function function, Long timeOutInSeconds) {
        FluentWait<WebDriver> wait = fluentWait(timeOutInSeconds);
        wait.until(function);
    }

    //    ForVisabilityOfElement - ожидание появления элемента
    public void waitForVisabilityOfElement(WebElement element) {
        waitForFunction(ExpectedConditions.visibilityOf(element), EXPLICITY_WAIT);
    }

    public void waitForVisabilityOfElement(By by) {
        waitForFunction(ExpectedConditions.visibilityOf(driver.findElement(by)), EXPLICITY_WAIT);
    }

    public WebElement waitForVisabilityOfElementReturn(WebElement element) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForVisabilityOfElementReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    //    presenceOfElementLocated() - ожидание проверка наличия элемента

    public void waitToPresenceOfElementLocated(By by) {
        waitForFunction(ExpectedConditions.presenceOfElementLocated(by), EXPLICITY_WAIT);
    }

    public WebElement waitToPresenceOfElementLocatedReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //    textToBePresentInElementValue() - ожидание проверки текста, который должен присутствовать в значении элемента()

    public void waitTextToBePresentInElementValue(WebElement element, String text) {
        waitForFunction(ExpectedConditions.textToBePresentInElementValue(element, text), EXPLICITY_WAIT);
    }

    public void waitTextToBePresentInElementValue(By by, String text) {
        waitForFunction(ExpectedConditions.textToBePresentInElementValue(by, text), EXPLICITY_WAIT);
    }

    //    ForinvisibilityOf() - ожидание пропажи элемента
    public void waitForInVisabilityOfElement(WebElement element) {
        waitForFunction(ExpectedConditions.invisibilityOf(element), EXPLICITY_WAIT);
    }

    public void waitForInVisabilityOfElement(By by) {
        waitForFunction(ExpectedConditions.invisibilityOf(driver.findElement(by)), EXPLICITY_WAIT);
    }

    //    titleContains() - ожидание заголовок содержит

    public void waitFortitleContains(String text) {
        waitForFunction(ExpectedConditions.titleContains(text), EXPLICITY_WAIT);
    }

    //    titleIS() - ожидание текста заголовока

    public void waitForTitleIsOfElement(String text) {
        waitForFunction(ExpectedConditions.titleIs(text), EXPLICITY_WAIT);
    }

    //    elementToBeClickable() - ожидание когда элемент будет кликабельным
    public void waitForElementToBeClickable(WebElement element) {
        waitForFunction(ExpectedConditions.elementToBeClickable(element), EXPLICITY_WAIT);
    }

    public void waitForElementToBeClickable(By by) {
        waitForFunction(ExpectedConditions.elementToBeClickable(driver.findElement(by)), EXPLICITY_WAIT);
    }

    public WebElement waitForElementToBeClickableReturn(WebElement element) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitForElementToBeClickableReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementToBeClickable(by));
    }

    //    elementToBeSelected() - ожидание когда элемент будет активным для выбора
    public void waitForElementToBeSelected(WebElement element) {
        waitForFunction(ExpectedConditions.elementToBeSelected(element), EXPLICITY_WAIT);
    }

    public void waitForElementToBeSelected(By by) {
        waitForFunction(ExpectedConditions.elementToBeSelected(driver.findElement(by)), EXPLICITY_WAIT);
    }

    //    elementSelectionStateToBe() - ожидание состояния выбора елемента, котрое должно быть
    public void waitForElementSelectionStateToBe(WebElement element, Boolean znak) {
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(element, znak), EXPLICITY_WAIT);
    }

    public void waitForElementSelectionStateToBe(By by, Boolean znak) {
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(driver.findElement(by), znak), EXPLICITY_WAIT);
    }

    //    visibilityOfElementLocated() - ожидание видимости расположенного элемента
    public void waitForVisabilityOfLocated(By by) {
        waitForFunction(ExpectedConditions.visibilityOfElementLocated(by), EXPLICITY_WAIT);
    }

    public WebElement waitvisibilityOfElementLocatedReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //     frameToBeAvailableAndSwitchToIt()  - ожидание frame активный для переключения на него
    public void waitForframeToBeAvailableAndSwitchToIt(WebElement element) {
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element), EXPLICITY_WAIT);
    }

    public void waitForframeToBeAvailableAndSwitchToIt(By by) {
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by), EXPLICITY_WAIT);
    }

    //    alertIsPresent() - ожидание появления alerta
    public void waitForAlertIsPresent() {
        waitForFunction(ExpectedConditions.alertIsPresent(), EXPLICITY_WAIT);
    }
}


