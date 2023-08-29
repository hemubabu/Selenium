package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcept {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver(options);   
		Driver.get("https://www.flipkart.com/");
		Driver.manage().window().maximize();
		
		WebElement search = Driver.findElement(By.name("q"));
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		js.executeScript("arguments[0].setAttribute('value','Samsung')",search);
		Object text = js.executeScript("return arguments[0].getAttribute('value')",search);
		System.out.println(text);
		
		WebElement searchbutton = Driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", searchbutton);
		WebElement down = Driver.findElement(By.xpath("//a[text()='Careers']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		WebElement up = Driver.findElement(By.xpath("//div[text()='Grocery']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);		
	}
	
}
