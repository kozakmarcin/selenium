package dev.selenium.component;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SearchComponent {
    private static final By searchComponent = By.cssSelector("#docsearch-1");
    private static final By inputText = By.cssSelector("#docsearch-input");
    private static final By resetButton = By.cssSelector(".DocSearch-Reset");
    private static final By firstFoundOption = By.cssSelector("#docsearch-item-0");



    public void clickOnSearchButton(TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();
        wait.until(elementToBeClickable(searchComponent)).click();
    }

    public void inputTextToSearchField(TestContext testContext, String text){
        Wait<WebDriver> wait = testContext.getWait();
        wait.until(elementToBeClickable(inputText)).sendKeys(text);
    }

    public void clickResetButton(TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();
        wait.until(elementToBeClickable(resetButton)).click();
    }

    public void clickFirstSearchHit(TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();
        wait.until(elementToBeClickable(firstFoundOption)).click();
    }






}
