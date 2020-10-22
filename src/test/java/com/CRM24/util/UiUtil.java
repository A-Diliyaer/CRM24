package com.CRM24.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Set;

public class UiUtil {

    static String parentWindow;
    static WebDriver driver = Driver.getDriver();
    static Actions action = new Actions(Driver.getDriver());
    static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


    public static String get_xpath(String format, String value){
        return String.format(format,value);
    }

    public static String get_xpath(String format, String valueA, String valueB){
        return String.format(format,valueA,valueB);
    }

    public static WebElement get_webElement(String xpath){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public static WebElement get_webElement(String format, String value){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(get_xpath(format,value))));
    }

    public static WebElement get_webElement(String format, String valueA, String valueB){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(get_xpath(format,valueA,valueB))));
    }

    public static void clickElement(String xpath){
        wait.until(ExpectedConditions.elementToBeClickable(get_webElement(xpath))).click();
    }

    public static void clickElement(String format, String value){
        wait.until(ExpectedConditions.elementToBeClickable(get_webElement(format,value))).click();
    }
    public static void clickElement(String format, String valueA, String valueB){
        wait.until(ExpectedConditions.elementToBeClickable(get_webElement(format,valueA,valueB))).click();
    }

    public static void sendTextToElement(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public static void sendTextToElement(String xpath, String input){
        get_webElement(xpath).clear();
        get_webElement(xpath).sendKeys(input);
    }

    public static void sendTextToElement(String format, String value, String input){
        get_webElement(format,value).clear();
        get_webElement(format,value).sendKeys(input);
    }

    public static void sendTextToElement(String format, String valueA, String valueB, String input){
        get_webElement(format,valueA,valueB).clear();
        get_webElement(format,valueA,valueB).sendKeys(input);
    }

    public static void moveToElement(String xpath){
        action.moveToElement(get_webElement(xpath)).perform();
    }

    public static void moveToElement(String format,String value){
        action.moveToElement(get_webElement(format,value)).perform();
    }

    public static void moveToElement(String format,String valueA, String valueB){
        action.moveToElement(get_webElement(format,valueA,valueB)).perform();
    }

    public static String getTextFromElement(String xpath){
        return wait.until(ExpectedConditions.visibilityOf(get_webElement(xpath))).getText().trim();
    }

    public static String getTextFromElement(WebElement element){
        return element.getText();
    }

    public static String getTextFromElement(String format, String value){
        return wait.until(ExpectedConditions.visibilityOf(get_webElement(format,value))).getText().trim();
    }

    public static String getTextFromElement(String format, String valueA,String valueB){
        return wait.until(ExpectedConditions.visibilityOf(get_webElement(format,valueA,valueB))).getText().trim();
    }

    public static void dragAndDropElement(WebElement A, WebElement B){
        action.dragAndDrop(A,B).perform();
    }

    public static boolean elementDisplayed(String format, String value){
        return wait.until(ExpectedConditions.visibilityOf(get_webElement(format,value))).isDisplayed();
    }

    public static boolean elementDisplayed(String xpath){
        return wait.until(ExpectedConditions.visibilityOf(get_webElement(xpath))).isDisplayed();
    }

    public static void driverSwitchFrame(String xpath){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(get_webElement(xpath)));
    }

    public static void driverSwitchDefault(){
        driver.switchTo().defaultContent();
    }

    public static void switchToChildWindow(){
        Set<String> windows = driver.getWindowHandles();
        for (String each : windows){
            if (!each.equals(parentWindow)){
                driver.switchTo().window(each);
            }
        }
    }

    public static void getParentWindow(){
        parentWindow=driver.getWindowHandle();
    }

    public static void switchToParentWindow(){
        driver.switchTo().window(parentWindow);
    }

    public static String getCurrentUrl(){
       return driver.getCurrentUrl();
    }

    public static String getTitle(){
        return driver.getTitle();
    }

    public static String add(String A, String B){
        return A+B;
    }

    public static WebElement getStaleElement(String xpath){
        wait.until(ExpectedConditions.stalenessOf(get_webElement(xpath)));
        return get_webElement(xpath);
    }

}
