package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public JavascriptExecutor jse;
    // private By registerbtn= By.linkText("Register");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private void ClickLink(String Linkttext){
        driver.findElement(By.linkText(Linkttext)).click();
    }

    public RegisterPage redirectedToregisterPage(){
        ClickLink("Register");
        return new RegisterPage(driver);
    }
    public LoginPage loginPage(){
        ClickLink("Log in");
        return new LoginPage(driver);
    }
    public CurrencePage currencePage1(){
       // ClickLink("Log in");
        return new CurrencePage(driver);
    }
    public CategoriesPage CategoriesPagep(){
        // ClickLink("Log in");
        return new CategoriesPage(driver);
    }
    public RestPasswordPage restPasspage(){
        ClickLink("Forgot password?");
        return new RestPasswordPage(driver);
    }
    public void scrollTo(String scroll) {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0," + scroll + ")");
    }

}
