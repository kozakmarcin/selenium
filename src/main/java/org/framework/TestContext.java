package org.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class TestContext {
    private WebDriver driver;
    private Wait<WebDriver> wait;

    public TestContext(){
        setup();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Wait<WebDriver> getWait() {
        return wait;
    }

    private void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);



        driver.get("https://www.selenium.dev/");

    }

    public void terdown(){
        driver.quit();
    }
}
