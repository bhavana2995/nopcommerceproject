package com.rs.traning.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {

    @Given("^I am homepage$")
    public void i_am_homepage() {
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String arg1) {
    }

    @Then("^I should see all \"([^\"]*)\" products$")
    public void i_should_see_all_products(String arg1) {
    }

}
