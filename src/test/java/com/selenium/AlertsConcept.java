package com.selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.CommonActions;

public class AlertsConcept extends CommonActions {
	public static void main(String[] args) throws InterruptedException {
		CommonActions C = new CommonActions();
		C.launch("https://demo.automationtesting.in/Alerts.html");
		String url ="https://demo.automationtesting.in/Alerts.html";
		Driver.get(url);
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Thread.sleep(3000);
		
		Alert A = Driver.switchTo().alert();
		A.sendKeys("Hemanthbabu");
		A.accept();
		WebElement text = Driver.findElement(By.xpath("//p[@id='demo1']"));
		String Alerttext = text.getText();
		System.out.println(Alerttext);

		
	}

}
