package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.ForgotPassword;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
ForgotPassword forgotPassword=new ForgotPassword();



    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        forgotPassword.clickOnForgotPassword();
        String expectedMessage="Reset Password";
        String actualMessage =forgotPassword.forgotPasswordText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is not correct");



    }






}
