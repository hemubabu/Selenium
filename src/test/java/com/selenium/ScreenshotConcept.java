package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept extends CommonActions {
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver(options); 
		Driver.manage().window().maximize();
		Driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(10000);
		WebElement dropdown = Driver.findElement(By.xpath("//select[@name='dropdown']"));
		
		Select S = new Select(dropdown);
		S.selectByVisibleText("Selenium");
		
		
		
		
	}
	

	

}
