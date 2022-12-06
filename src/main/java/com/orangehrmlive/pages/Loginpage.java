package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class Loginpage extends Utility {
    By usernameField= By.xpath("//input[@placeholder='Username']");
    By passwordField=By.name("password");
    By loginButton=By.xpath("//button[@type='submit']");
    By deskboardMessage=By.xpath(" //header/div[1]/div[1]/span[1]/h6[1]");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String getDeskboardMessage() {
        return getTextFormElement(deskboardMessage);
    }

}
