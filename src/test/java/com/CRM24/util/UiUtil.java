package com.CRM24.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UiUtil {

    private static String parentWindow;
    private static WebDriverWait wait;
    private static WebDriver driver;
    private static Actions action;

    public static void initUi(){
        driver = Driver.getDriver();
        wait = Driver.getWait();
        action = Driver.getActions();
    }

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

    public static List<WebElement> getWebElements(String format,String value){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(get_xpath(format,value))));
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
        action = new Actions(Driver.getDriver());
        action.moveToElement(get_webElement(xpath)).perform();
    }

    public static void moveToElement(String format,String value){
        action = new Actions(Driver.getDriver());
        action.moveToElement(get_webElement(format,value)).perform();
    }

    public static void moveToElement(String format,String valueA, String valueB){
        action = new Actions(Driver.getDriver());
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

    public static List<String> getListOfTextFromElements(String format, String value){
        List<String> listOfText = new ArrayList<>();
        List<WebElement> listOfElements = getWebElements(format,value);
        for (WebElement each: listOfElements){
            listOfText.add(each.getText());
        }
        return listOfText;
    }

    public static void dragAndDropElement(WebElement A, WebElement B){
        action = new Actions(Driver.getDriver());
        action.dragAndDrop(A,B).perform();
    }

    public static boolean elementDisplayed(String format, String value){
        return wait.until(ExpectedConditions.visibilityOf(get_webElement(format,value))).isDisplayed();
    }

    public static boolean elementDisplayed(String xpath){
            return get_webElement(xpath).isDisplayed();
    }

    public static void driverSwitchFrame(String xpath){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(get_webElement(xpath)));
    }

    public static void driverSwitchDefault(){
        Driver.getDriver().switchTo().defaultContent();
    }

    public static void switchToChildWindow(){
        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String each : windows){
            if (!each.equals(parentWindow)){
                Driver.getDriver().switchTo().window(each);
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

    public static void scrollTo(String xpath){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                                                                        get_webElement(xpath));
    }

    public static void scrollTo(String xpath,String value){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                get_webElement(xpath,value));
    }

    public static void waitForElementRefresh(String xpath){
        wait.until(ExpectedConditions.visibilityOf(UiUtil.get_webElement(xpath)));
        wait.until(ExpectedConditions.invisibilityOf(UiUtil.get_webElement(xpath)));

    }


}
