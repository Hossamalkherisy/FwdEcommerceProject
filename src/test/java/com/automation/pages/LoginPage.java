package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    private By Email= By.id("Email");
    private By Password=By.id("Password");
    private By btnLogin= By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void UserLogin(String email,String pass){
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }
}
