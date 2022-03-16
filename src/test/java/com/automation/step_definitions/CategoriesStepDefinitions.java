package com.automation.step_definitions;

import com.automation.pages.CategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesStepDefinitions {

    CategoriesPage categoriesPage=Hooks.homepage.CategoriesPagep();
    @Given("Logged user in home page")
    public void logged_user_in_home_page() {
        System.out.println("successfylly login");

    }
    @When("user detierment to Categories and Hover to sub_Categories")
    public void user_detierment_to_categories_and_hover_to_sub_categories() {
        categoriesPage.selectSubCategory();
        categoriesPage.selectCategory();

    }
    @Then("Click on sub categories successfully")
    public void click_on_sub_categories_successfully() {
        System.out.println("successfylly cat");

    }

}
