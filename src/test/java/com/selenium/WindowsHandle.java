package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v109.network.model.Cookie;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;
import com.objectrepository.PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle extends CommonActions{
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = new DesiredCapabilities();
		String browserVersion = caps.getBrowserVersion();
		System.out.println(browserVersion);
	//	caps.setAcceptInsecureCerts(true);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--start-maximized");
//		ChromeOptions addArguments = option.addArguments("--version");
//		System.out.println(addArguments);
//		
//		option.addArguments("--incognito");
//		option.merge(caps);
		Driver=new ChromeDriver(option); 
		Driver.get("https://www.cacert.com/");
		caps.setAcceptInsecureCerts(true);
//		Driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//		Thread.sleep(3000);
//		
//		WebElement firstname = Driver.findElement(By.xpath("//input[@name='firstname']"));
//		firstname.sendKeys("aaaaa");
//		WebElement lastname = Driver.findElement(By.name("lastname"));
//		lastname.sendKeys("S");
//		WebElement number=Driver.findElement(By.name("reg_email__"));
//		number.sendKeys("8072861025");
//		WebElement password = Driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//		password.sendKeys("Hemu3123*");
//		WebElement date = Driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		Select D = new Select(date);
//		D.selectByValue("13");
//		WebElement month = Driver.findElement(By.xpath("//select[@id='month']"));
//		Select M = new Select(month);
//		M.selectByValue("10");
//		WebElement year = Driver.findElement(By.xpath("//select[@id='year']"));
//		Select Y = new Select(year);
//		Y.selectByValue("1998");
//		WebElement gender = Driver.findElement(By.xpath("//span[@data-type='radio']/span/following-sibling::span/label"));
//		gender.click();
//		 // Get all the cookies
//        Set<org.openqa.selenium.Cookie> cookies = Driver.manage().getCookies();
//
//        // Print the cookies
//        for (org.openqa.selenium.Cookie cookie : cookies) {
//            System.out.println("Name: " + cookie.getName());
//            System.out.println("Value: " + cookie.getValue());
//            System.out.println("Domain: " + cookie.getDomain());
//            System.out.println("Path: " + cookie.getPath());
//            System.out.println("Expiry: " + cookie.getExpiry());
//            System.out.println("Secure: " + cookie.isSecure());
//            System.out.println("HttpOnly: " + cookie.isHttpOnly());
//            System.out.println("----------------------------------");
//        }
//      //  option.addArguments("--delete-cookies");
//        Driver.manage().deleteAllCookies();
//        System.out.println("Cookies Deleted");
//        for (org.openqa.selenium.Cookie cookie : cookies) {
//            System.out.println("Name: " + cookie.getName());
//            System.out.println("Value: " + cookie.getValue());
//            System.out.println("Domain: " + cookie.getDomain());
//            System.out.println("Path: " + cookie.getPath());
//            System.out.println("Expiry: " + cookie.getExpiry());
//            System.out.println("Secure: " + cookie.isSecure());
//            System.out.println("HttpOnly: " + cookie.isHttpOnly());
//            System.out.println("----------------------------------");
   //     }
	//	Driver.quit();
		
	}

}
