package com.CRM24.pages.login_page;

import com.CRM24.pages.base_navigation_page.AbstractPageBase;
import com.CRM24.util.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageBase {

    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(className = "login-btn")
    private WebElement login;

    @FindBy(id = "USER_REMEMBER")
    private WebElement rememberMe;

    @FindBy(className = "login-link-forgot-pass")
    private WebElement forgotPassword;

    @FindBy(className = "errortext")
    private WebElement errorMsg;

    @FindBy(id = "user-name")
    private WebElement currentUser;

    /**
     * method to login version 1
     * login as a specific user
     * @param username
     * @param password
     */
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
    }

    /**
     * method to login version 2
     * login as a specific role defined in config properties
     * @param role helpdesk, marketing, hr
     */
    public void login(String role){
        try{
            username.sendKeys(ConfigurationReader.getProperty(role));
            password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);
        }catch (Exception e){
            throw new RuntimeException("invalid role");
        }
    }

    /**
     * returns error msg if credentials are not correct
     * @return
     */
    public String get_error_msg(){
        return errorMsg.getText();
    }

    /**
     * return current user
     * @return
     */
    public String get_current_user(){
        return currentUser.getText();
    }

    public String get_title(){
        return driver.getTitle();
    }
}
