package com.BellatrixFinalDemo.stepDefinations;

import java.util.List;

import org.testng.Assert;

import com.BellatrixFinalProject.Keywords.Keyword;
import com.BellatrixFinalProject.Pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDef {
	HomePage homepage = new HomePage();
	Keyword keyword = new Keyword();

	@Given("Search result for Falcon Item")
	public void searchProduct() {
		homepage.searchProduct("falcon");
	}

	@When("All results must contain Falcon word in the product title")
	public void all_results_must_contain_Falcon_word_in_the_product_title() {
		List<String> productTitles = homepage.getProductTitles();
		for (String productTitle : productTitles) {
			System.out.println(productTitle);
			// Assert.assertTrue(productTitle.contains("Falcon"),productTitle);
		}

	}

	@Given("Search result for proton Item")
	public void search_result_for_proton_item() {
		homepage.searchProduct("proton");
	}

	@When("All results must contain proton word in the product title")
	public void all_results_must_contain_proton_word_in_the_product_title() {
		homepage.getProductTitles();
	}

	@Given("Search result sort by popularity")
	public void searchProductByPopularity() {
		homepage.clickOnDropDown("Sort by popularity");

	}

	@Then("Result should be display by poularity")
	public void getAllPriceOfPoularity() {
		homepage.getPrice();
		System.out.println(homepage.getPrice());

	}
}
