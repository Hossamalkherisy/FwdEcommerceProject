package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {

    private WebDriver driver;
    Actions actions;
    private By ElectronicsCategory = By.cssSelector("a[href=\"/electronics\"]");
    private By ElectronicsSub_Category = By.cssSelector("a[href=\"/camera-photo\"]");
    private By BooksSub_Category = By.cssSelector("a[href=\"/books\"]");


    public CategoriesPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void selectSubCategory() {
        actions.moveToElement(driver.findElement(ElectronicsCategory)).moveToElement(driver.findElement(ElectronicsSub_Category)).click().build().perform();
    }

    public void selectCategory() {
        actions.moveToElement(driver.findElement(BooksSub_Category)).click().build().perform();
    }

}