package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task  {
	public static WebDriver Driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver(option); 
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/web-table-element.php");
		
//		int rowsize = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
//		int colsize = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
//		//Driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
//		//Driver.get("https://www.flipkart.com/");
//		for(int i=1;i<rowsize;i++) {
//			for(int j=1;j<colsize;j++) {
//				WebElement element = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td["+ j +"]"));
//				if(i==3 && j==colsize-1) {
//				String text= element.getText();
//				System.out.println(text);
//				}
//			}
//		}
//		Thread.sleep(9000);
//		WebElement dropdown = Driver.findElement(By.xpath("//select[@name='dropdown']"));
//		Select S = new Select(dropdown);
//		Thread.sleep(9000);
//		List<WebElement> options = S.getOptions();
//		for(int i=0;i<options.size();i++) {
//			WebElement option1 = options.get(i);
//			String text = option1.getText();
//			if(text.equals("Automation Testing")) {
//				S.selectByIndex(i);
//			}
//			System.out.println(text);
//		}
//		
		
		//Driver.findElement(By.xpath("//input[@value='cbselenium']")).click();
//		Driver.findElement(By.xpath("//button[text()='✕']")).click();
//		WebElement search = Driver.findElement(By.name("q"));
//		search.sendKeys("REDMI",Keys.ENTER);
//		Thread.sleep(5000);
//		Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[1]")).click();
//		Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[2]")).click();
//		Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[3]")).click();
//		Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[4]")).click();
//		Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[5]")).click();
//		String pwin = Driver.getWindowHandle();
//		Set<String> cwin = Driver.getWindowHandles();
//		List<String>child=new ArrayList<>(cwin);
//		for(int i=0;i<child.size();i++) {
//			if(!pwin.equals(child)) {
//				
//				Driver.switchTo().window(child.get(3));
//			}
//		}
//		
//		for(String X:cwin) {
//			System.out.println(X);
//		}

		
//		WebElement Login = Driver.findElement(By.xpath("//a[text()='Login']"));
//		Actions A = new Actions(Driver);
//		A.moveToElement(Login).perform();
//		WebElement search = Driver.findElement(By.name("q"));
//		search.sendKeys("REDMI");
//		Robot R = new Robot();
//		R.keyPress(KeyEvent.VK_SPACE);
//		R.keyRelease(KeyEvent.VK_SPACE);
//		WebElement Down = Driver.findElement(By.xpath("//a[text()='About Us']"));
//		JavascriptExecutor js = (JavascriptExecutor)Driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",Down);
		
	}

}
