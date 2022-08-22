package com.careerhack.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JuneSessionGooglesearch extends GoogleBase {
	
	HomePage hp;
	
@Given("^I am on google homepage$")
public void i_am_on_google_homepage() {
	getDriver();
	
    }

	@When("^I enter search \"([^\\\"]*)\\\"$")
	public void i_enter_search(String Term	) {
		//driver.findElement(By.name("q")).sendKeys(Term);
		//WebElement searchBox;
		//searchBox=driver.findElement(By.name("q"));
		//searchBox.sendKeys(Term); 
		HomePage hp = new HomePage(driver);
		hp.enterSearch(Term);
}

@When("I click on google search button")
public void i_click_on_google_search_button() {
	//driver.findElement(By.name("btnK")).click();
	//WebElement searchButton;
	//searchButton=driver.findElement(By.name("btnK"));
	//searchButton.click(); 
	HomePage hp = new HomePage(driver);	
	hp.clickseacrhButton();
		
	
}

@Then("I receive relevant results")
public void i_receive_relevant_results() {
	String title;
	title=driver.getTitle();
	System.out.println(title);
	driver.close();//close active browser
	
	//driver.quit();//close all browser
	
   
}

}
