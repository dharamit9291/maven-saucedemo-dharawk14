package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//input[@id='login-button']");

    By verifyProductText = By.xpath("//span[text()='Products']");
    By noOfProduct = By.xpath("//div[@class='inventory_item_name']");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSecureAreaText() {
        return getTextFromElement(verifyProductText);
    }

    public int getNumberOfProductDisplayed() {
        List<WebElement> list = driver.findElements(noOfProduct);
        return list.size();

    }
}

