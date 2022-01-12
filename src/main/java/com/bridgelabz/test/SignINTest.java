package com.bridgelabz.test;

import org.testng.annotations.Test;

import com.bridgelabz.pagefactory.SigninPageFactory;
import com.bridgelabz.pom.SignInPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignINTest {

	@Test
	public void signUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.zomato.com/");
//		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
//		 WebElement Login =  driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/section[2]/section[1]/div[1]/div[1]/input[1]"));
//		 Login.sendKeys("123456");
//	

		SignInPage page = new SignInPage(driver);
//		SigninPageFactory factory = new SigninPageFactory(driver);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458706470%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8334859232404852419%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007786%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DCjwKCAiA8bqOBhANEiwA-sIlN9YaF1KDf_AwEPct3-Wb1XO_AO_l9_lt8Nb-DankGQKMDwP6exVXFxoCQXgQAvD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//		  factory.setName("meghna");
		page.setEmail("meghna@gmail.com");

//		driver.get("https://www.zomato.com/");
//		WebElement sign = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
//		 sign.click();
//		 WebElement login= driver.findElement(By.cssSelector("div.sc-13lc47p-0.hOPtIO:nth-child(50) div.sc-re4bd0-6.kmkHCs.modalWrapper.sc-AUpyg.gqWnIv div.sc-re4bd0-8.cGScuB section.sc-re4bd0-11.fKQGZb section.sc-kWHCRG.hGYpXj div.sc-60vv3c-2.ggwUJG.sc-geAPOV.kNHGbp:nth-child(1) div.sc-60vv3c-1.jxWbSr > input.sc-60vv3c-0.fyGVHZ.sc-geAPOV.kNHGbp"));
//		 login.sendKeys("123456789");
		// String myWindowHandle = driver.getWindowHandle();
		// river.switchTo().window(myWindowHandle);
//		WebElement email_id= driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/section[2]/section[1]/div[1]/section[1]/section[1]/input[1]"));
//		email_id.sendKeys("hi");

	}

}
