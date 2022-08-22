package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//pagefactory- java library to manage webelements
	// constructactor
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	//WebElement searchBox;
			//searchBox=driver.findElement(By.name("q"));
			//searchBox.sendKeys(Term);  
	
	@FindBy(name="q")
	WebElement searchBox;
	
	public void enterSearch(String Term) {
		searchBox.sendKeys(Term);
	}//WebElement searchButton;
	//searchButton=driver.findElement(By.name("btnK"));
	//searchButton.click();  
	@FindBy(name="btnK")
	WebElement searchButton;
	public void clickseacrhButton() {
		searchButton.click();
		
	}
	
}	 
