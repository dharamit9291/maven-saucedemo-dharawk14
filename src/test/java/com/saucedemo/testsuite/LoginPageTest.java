package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedMessage, "User Not Logged In");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expCounts = 6;
        Assert.assertEquals(loginPage.getNumberOfProductDisplayed(),expCounts,"Not matching");
    }
}
