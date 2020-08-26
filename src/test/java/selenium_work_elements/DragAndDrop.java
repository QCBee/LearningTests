package selenium_work_elements;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages_selenium_work_elements.DragAndDropPage;
import utils.WebDriverFactory;


public class DragAndDrop {
    DragAndDropPage dragAndDropPage = null;

    //List of needed locators
    String linkUrl = "http://demo.guru99.com/test/drag_drop.html";

    @BeforeTest
    public void setUp() {
        WebDriverFactory.createInstance("Firefox");
        dragAndDropPage = new DragAndDropPage(WebDriverFactory.getDriver());
    }

    @Test
    public void dragAndDropFirstElement(){
        dragAndDropPage.navigateTo(linkUrl);
        Assert.assertTrue(dragAndDropPage.doesElementToBeDragAndDroppedShownOnStartPosition());
        Assert.assertTrue(dragAndDropPage.doesNewElementPositionAvailable());

        dragAndDropPage.dragAndDropElement();
        Assert.assertTrue(dragAndDropPage.isToElementPositionChanged());
    }

    @AfterMethod
    public void tearDown(){
        WebDriverFactory.closeBrowser();
    }

}
