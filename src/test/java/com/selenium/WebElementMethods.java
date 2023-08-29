package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.baseclass.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods extends CommonActions {
	public static void main(String[] args) throws Exception {
		CommonActions C = new CommonActions();
		C.launch("https://demo.guru99.com/test/web-table-element.php");
		int rowsize = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(rowsize);
		
		int colsize = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(colsize);
		for(int row=1;row<=rowsize;row++) {
			for(int col=1;col<=colsize;col++) {
				WebElement element = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ row +"]/td["+ col +"]"));
				String text = element.getText();
				//System.out.println(text);
				
				
				if(text.equals("Corporation Bank")) {
					System.out.println(text);
					
					
					
					
					for(col=1;col<=colsize;col++) {
						if (col==2) {
						WebElement element1 = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ row +"]/td["+ col +"]"));
						
						String text1 = element1.getText();
						
						System.out.println(text1);
						}// To get particular text record value
						
					}
				}
			}
			
		}
	}

}
