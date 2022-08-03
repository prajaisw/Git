package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	@org.testng.annotations.Test
	void Test() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Installers\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
     //driver.get("https://www.buyemp.com/blog");
    String username = "stageUser";
	//Set the password
	String password = "centerStage!";
    String URL = "https://" +username +":" +password +"@"+ "stg.boundtree.com/quickOrder";
    driver.manage().window().maximize();
	driver.get(URL);
   
     
//     driver.findElement(By.linkText("Sign in")).click();
//     driver.findElement(By.id("j_username")).sendKeys("pabtm");
//     driver.findElement(By.id("j_password")).sendKeys("Sarnova1");
//     driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();
    
     //driver.findElement(By.id("js-site-search-input")).sendKeys("601323");
     //Thread.sleep(2000);
     //driver.findElement(By.className("glyphicon")).click();
	//driver.findElement(By.linkText("Quick Order")).click();
	driver.findElement(By.xpath("//a[@id='js-reset-quick-order-form-btn-top']//button[@type='button'][normalize-space()='Reset Form']")).click();
	Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	//driver.findElement(By.xpath("//a[@id='js-reset-quick-order-form-btn-top']//button[@type='button'][normalize-space()='Reset Form']")).click();
	
	}
}
