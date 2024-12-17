package dev.selenium.page;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWaitPage {
    private static final By linkFoundedByText = By.xpath("//*[contains(text(),'fixed implicit wait')]");

    public String getTextFromFoundedTag(TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();

        return wait.until(d -> d.findElement(linkFoundedByText).getText());

    }

}
