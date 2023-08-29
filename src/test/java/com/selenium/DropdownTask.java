package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTask {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver(options);   
		Driver.get("https://www.flipkart.com/");
		Driver.manage().window().maximize();
		
	
	WebElement Dropdown = Driver.findElement(By.xpath("//select[@name='dropdown']"));
	Select S = new Select (Dropdown);
	S.selectByValue("ddselenium");
	Thread.sleep(3000);
	S.selectByVisibleText("Manual Testing");
	
	List<WebElement> Allselect = S.getOptions();
	for(WebElement Y:Allselect) {
		String SELALL = Y.getText();
		System.out.println(SELALL);
	}
	//Multiple dropdown
	WebElement Dropdown2 = Driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
	Select SS = new Select(Dropdown2);
	boolean equals = SS.isMultiple();
	System.out.println(equals);
	SS.selectByIndex(0);
	SS.selectByValue("msagile");
	SS.selectByVisibleText("Manual Testing");
	List<WebElement> Selopt = SS.getAllSelectedOptions();
	for(WebElement Z:Selopt) {
		String Selectopt = Z.getText();
		System.out.println(Selectopt);
	}
	Thread.sleep(3000);
	SS.deselectAll();
	}

}
