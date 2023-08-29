package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends CommonActions{
	
	

	public static void main(String[] args) throws Exception {
		CommonActions C = new CommonActions();
		C.launch("https://www.facebook.com/");
	
		Driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement firstname = Driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("aaaaa");
		WebElement lastname = Driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");
		WebElement number=Driver.findElement(By.name("reg_email__"));
		C.insertText(number, "8072861025");
		WebElement password = Driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("Hemu3123*");
		WebElement date = Driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select D = new Select(date);
		D.selectByValue("13");
		WebElement month = Driver.findElement(By.xpath("//select[@id='month']"));
		Select M = new Select(month);
		M.selectByValue("10");
		WebElement year = Driver.findElement(By.xpath("//select[@id='year']"));
		Select Y = new Select(year);
		Y.selectByValue("1998");
		WebElement gender = Driver.findElement(By.xpath("//span[@data-type='radio']/span/following-sibling::span/label"));
		gender.click();
		
		
		//female=//span[@data-type='radio']/span/label
		
	
		

	}

}
