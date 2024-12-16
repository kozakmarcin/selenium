package dev.selenium.page;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class MainPage {
    public static final By documentationButton = By.cssSelector("#main_navbar>ul>li:nth-child(3)>a");

    public void pressDocumentationButton(TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();
        wait.until(ExpectedConditions.elementToBeClickable(documentationButton)).click();
    }
}
