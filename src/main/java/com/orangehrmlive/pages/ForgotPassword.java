package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {
    By forgotPasswordLink = By.xpath("//div[@class='orangehrm-login-forgot']//p");
    By forgotPasswordText = By.xpath("//div[@class='orangehrm-forgot-password-container']//h6");

    public void clickOnForgotPassword() {
        clickOnElement(forgotPasswordLink);
    }

    public String forgotPasswordText() {
        return getTextFormElement(forgotPasswordText);
    }


}

