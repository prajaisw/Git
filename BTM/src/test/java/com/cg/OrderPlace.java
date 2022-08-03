package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPlace {
	
	@Test
	void Blog() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	     //driver.get("https://www.buyemp.com/blog");
	    String username = "stageUser";
		//Set the password
		String password = "centerStage!";
	    String URL = "https://" +username +":" +password +"@"+ "stg.boundtree.com/";
	    driver.manage().window().maximize();
		driver.get(URL);
	   
	     
	     driver.findElement(By.linkText("Sign in")).click();
	     driver.findElement(By.id("j_username")).sendKeys("pabtm");
	     driver.findElement(By.id("j_password")).sendKeys("Sarnova1");
	     driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();
	     
	     //driver.findElement(By.id("js-site-search-input")).sendKeys("601323");
	     //Thread.sleep(2000);
	     //driver.findElement(By.className("glyphicon")).click();
		driver.findElement(By.linkText("Quick Order")).click();
		//driver.findElement(By.xpath("//a[@id='js-reset-quick-order-form-btn-top']//button[@type='button'][normalize-space()='Reset Form']")).click();
		//driver.findElement(By.xpath("//a[@id='js-reset-quick-order-form-btn-top']//button[@type='button'][normalize-space()='Reset Form']")).click();
		
		driver.findElement(By.xpath("//div[@class='page-content-container']//li[2]//div[1]//input[1]")).sendKeys("441130" + "\n");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='js-add-to-cart-quick-order-btn-top']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='yCmsComponent']//div[@class='mini-cart-sum-title'][normalize-space()='Cart total:']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'CartComponent-CartCheckoutAction')]//button[@class='btn btn-primary btn--continue-checkout js-continue-checkout-button js-enable-btn'][normalize-space()='Check Out']")).click();
		driver.findElement(By.xpath("//button[@id='addressSubmit']")).click();
		
		driver.findElement(By.xpath("//button[@id='deliveryMethodSubmit']")).click();
		
		driver.findElement(By.xpath("//button[@id='cardDetailsSubmitButton']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'checkout-steps')]//div[@class='checkbox']//input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='place-order-form hidden-xs']//button[@id='placeOrder']")).click();
		
		/*
		 * driver.findElement(By.xpath("//input[@id='guest.email']")).sendKeys(
		 * "prashant.jaiswal@capgemini.com");
		 * driver.findElement(By.xpath("//input[@id='guest.confirm.email']")).sendKeys(
		 * "prashant.jaiswal@capgemini.com"); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//button[normalize-space()='Check Out as a Guest']")).click();
		 */
	     
		Thread.sleep(3000);
		String expectedTitle = "Order Confirmation | Bound Tree"; 
		String actualTitle = driver.getTitle(); 
		
		Assert.assertEquals(actualTitle, expectedTitle);
	     
	    driver.close();
	     
	}

	
}
