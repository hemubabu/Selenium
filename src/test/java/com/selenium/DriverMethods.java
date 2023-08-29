package com.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMethods {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver(options);
		Driver.manage().window().maximize();
		
		Driver.get("https://www.flipkart.com/");
		
		String pageSource = Driver.getPageSource();
		System.out.println(pageSource);
		
		String currentUrl = Driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = Driver.getTitle();
		System.out.println(title);
		
		String windowHandle = Driver.getWindowHandle();
		System.out.println(windowHandle);
//		Set<String> windowHandles = Driver.getWindowHandles();
//		Driver.switchTo().alert();
//		Driver.switchTo().frame(0);
//		Driver.switchTo().activeElement();
//		Driver.manage().window().maximize();
//		WebElement findElement = Driver.findElement(null);
//		List<WebElement> findElements = Driver.findElements(null);
		Driver.navigate().refresh();
		Driver.close();
		Driver.quit();

	}

}
