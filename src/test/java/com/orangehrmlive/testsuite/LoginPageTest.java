package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.Loginpage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    Loginpage loginpage=new Loginpage();

@Test
    public void verifyUserShouldNavigateToLoginPageWithValidCredentialsSuccessfully(){
    loginpage.enterUsername("Admin");
    loginpage.enterPassword("admin123");
    loginpage.clickOnLoginButton();
    String expectedErrorMessage = "Dashboard";

    Assert.assertEquals(loginpage.getDeskboardMessage(),expectedErrorMessage,"message is not displyed");


}



}
