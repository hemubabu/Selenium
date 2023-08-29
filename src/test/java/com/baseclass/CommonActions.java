package com.baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
public static WebDriver Driver;

		public static void launch(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver(options); 
		Driver.manage().window().maximize();
		Driver.get(url);
		
		
	}
	public void insertText(WebElement e,String S) {
		e.sendKeys(S);
	}
	public void FlipkartinsertText(WebElement e,String S) {
		e.sendKeys(S,Keys.ENTER);
	}
	public void click(WebElement e) {
		e.click();
	}
	public void alertConcept(WebElement e) {
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(Driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		Alert A = Driver.switchTo().alert();
		A.accept();
	}
	public void launchUrl(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver(options);   
		Driver.get(url);
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.manage().window().maximize();
		
	}

}
