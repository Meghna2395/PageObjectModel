package com.bridgelabz.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPageFactory {

	WebDriver driver;

	@FindBy(name = "email")
	WebElement Name;

	public SigninPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setName(String s) {

		Name.sendKeys("meghna");
	}
}
