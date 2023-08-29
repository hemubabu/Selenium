package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.baseclass.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoaded {
	static WebDriver Driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--start-maximized");
		Driver=new ChromeDriver(option); 
	//	Driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		Object executeScript = js.executeScript("return document.readyState");
		boolean equals = executeScript.equals("complete");
	//	System.out.println(equals);
		
		//boolean isPageLoaded = waitForPageLoad(Driver);

        if (equals) {
            // Page is loaded properly
            System.out.println("Page loaded successfully.");
        } else {
            // Page is not loaded properly
            System.out.println("Page did not load successfully.");
        }

        // Quit the WebDriver session
        Driver.quit();
    }

//    private static boolean waitForPageLoad(WebDriver Driver) {
//        JavascriptExecutor js = (JavascriptExecutor) Driver;
//
//        // Wait for the page to load completely
//        Object isPageLoaded = js.executeScript(
//                "return document.readyState");
//        boolean equals = isPageLoaded.equals("complete");
//
//        return equals;
//    }
}
//In this example, after navigating to the desired URL, we call the waitForPageLoad() method, which uses the JavascriptExecutor interface to execute JavaScript code. The JavaScript code retrieves the document.readyState property, which indicates the current state of the webpage. The document.readyState value "complete" indicates that the page has finished loading.
//
//The waitForPageLoad() method returns true if the page is loaded completely, and false otherwise.
//
//Based on the return value of waitForPageLoad(), you can handle the desired logic to determine whether the page is loaded properly or not.
//
//Make sure to replace "path/to/chromedriver" with the actual path to the ChromeDriver executable on your system.
//






		
	


