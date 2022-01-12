package com.bridgelabz.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	

	
	WebDriver driver;
	
	//By SingUpLink= By.xpath("Sign-In");
	By email = By.name("email");
	
	
//	  public void clickRegLink(){
//	        driver.findElement(SingUpLink).click();
//	    }

	
	public SignInPage(WebDriver d) {
		driver = d;
	}
	
	public void setEmail(String s) {
		driver.findElement(email).sendKeys("7418529630");
	}
	
}