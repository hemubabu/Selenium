package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) throws Exception{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver(options);   
		Driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Driver.manage().window().maximize();
		WebElement products=Driver.findElement(By.xpath("//select[@id='second']"));
		Select S = new Select(products);
		List<WebElement> options2= S.getOptions();
		for(int i=0;i<options2.size();i++) {
			WebElement Elements = options2.get(i);
			String text = Elements.getText();
			System.out.println(text);
		}
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(products));
		Boolean until = wait.until(ExpectedConditions.stalenessOf(products));
		wait.until(ExpectedConditions.)
		Wait w = new FluentWait(Driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		Thread.sleep(3000);
		
//		Driver.switchTo().frame("frame1");
//		Driver.switchTo().frame("frame3");
//		Driver.findElement(By.id("a")).click();
//		Driver.switchTo().parentFrame();
//		Driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("babu");
//		
		
//		Driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		Alert A = Driver.switchTo().alert();
//		A.dismiss();
//		WebElement username=Driver.findElement(By.id("email"));
//		Actions A = new Actions(Driver);
//		A.contextClick(username).perform();
//		Robot R = new Robot();
//		for(int i=0;i<=5;i++) {
//		R.keyPress(KeyEvent.VK_DOWN);
//		R.keyRelease(KeyEvent.VK_DOWN);
//		}
//		R.keyPress(KeyEvent.VK_ENTER);
//		R.keyRelease(KeyEvent.VK_ENTER);
//		//Driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
