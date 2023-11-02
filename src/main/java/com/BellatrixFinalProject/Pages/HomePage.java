package com.BellatrixFinalProject.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BellatrixFinalProject.Base.TestBase;
import com.BellatrixFinalProject.Keywords.Keyword;

public class HomePage {
	Keyword keyword= new Keyword();

	public HomePage() {
		PageFactory.initElements(TestBase.getDriver(), this);
	}
	
	@FindBy(css="input[id=\"woocommerce-product-search-field-0\"]")
	WebElement searchComponent;
	
	public void searchProduct(String productName) {
		searchComponent.sendKeys(productName);
		searchComponent.sendKeys(Keys.ENTER);
	}
	
	@FindBy(css="h2[class*=title]")
	List<WebElement> falconProductTitles;
	
	public List<String> getFalconTitles() {
		 return keyword.getTexts(falconProductTitles);
	}
	
	
	@FindBy(css="h2[class*=title]")
	List<WebElement> protonProductTitles;
	
	public List<String> getProtonTitles() {
		return keyword.getTexts(protonProductTitles);

	}

	@FindBy(css = "#main > div:nth-child(2) > form > select")
	WebElement dropDown;
	
	public void clickOnDropDown(String textTOVisible) {
	keyword.dropDown(dropDown, textTOVisible);
	}

	@FindBy(css="a[href=\"https://demos.bellatrix.solutions/product/saturn-v/\"] h2")
	 List<WebElement> sortPopularity;
	
	public List<String> displayBypopularity() {
		 return keyword.getTexts(sortPopularity);
	}

	@FindBy(css="span.price")
	List<WebElement> allPrice;
	
	public List<String> allProductPrice() {
		return keyword.getTexts(allPrice);
	}
	




















}



