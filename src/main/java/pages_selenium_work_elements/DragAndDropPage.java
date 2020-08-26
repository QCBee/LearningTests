package pages_selenium_work_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.time.Duration;

public class DragAndDropPage {
    private final WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    //List of used locators
    private By elementToBeDragAndDropped = By.id ("fourth");
    private By elementPosition = By.id ("amt7");
    private By elementAfterChanges = By.xpath("//*//*[@data-id = '2' and contains(text(),'5000')]");

    public void navigateTo(String pageUrl){
        WebDriverFactory.getDriver().get(pageUrl);
    }

    public boolean doesElementToBeDragAndDroppedShownOnStartPosition(){
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(10).getSeconds());
        return wait.until(ExpectedConditions.presenceOfElementLocated(elementToBeDragAndDropped)).isDisplayed();
    }

    public boolean doesNewElementPositionAvailable(){
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(10).getSeconds());
        return wait.until(ExpectedConditions.presenceOfElementLocated(elementPosition)).isDisplayed();
    }

    public void dragAndDropElement(){
        WebElement From = WebDriverFactory.getDriver().findElement(elementToBeDragAndDropped);
        WebElement To = WebDriverFactory.getDriver().findElement(elementPosition);
        Actions builder = new Actions(WebDriverFactory.getDriver());
        builder.dragAndDrop(From,To).perform();
    }

    public boolean isToElementPositionChanged(){
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(10).getSeconds());
        return wait.until(ExpectedConditions.presenceOfElementLocated(elementAfterChanges)).isEnabled();
    }
}