package dev.selenium.component;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class TableComponent {
    private static final By kotlinOptionInTable = By.cssSelector("#tabs-03-05-tab");

    public void clickOnKotlinButton(TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();
        wait.until(d -> {
            d.findElement(kotlinOptionInTable).click();
            return true;
        });
    }
}
