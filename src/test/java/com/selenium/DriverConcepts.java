package com.selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.baseclass.CommonActions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverConcepts {
	static CommonActions C = new CommonActions();
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver(options);   
		Driver.get("https://www.flipkart.com/");
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.manage().window().maximize();
		try {
			WebElement Close=Driver.findElement(By.xpath("//button[text()='✕']"));
			Close.isDisplayed();
			Close.click();
		}
		catch(Exception e) {
			System.out.println("Pop up is not displayed");
		}
		WebElement search= Driver.findElement(By.name("q"));
		search.sendKeys("SAMSUNG",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> samsung = Driver.findElements(By.xpath("//a[contains(text(),'SAMSUNG ')]"));
		List<WebElement> Price = Driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		Map<String,Object> M = new LinkedHashMap<String, Object>();
		int Modelcount=0;
		int Pricecount=0;
		File F = new File("C:\\Users\\HEMU\\eclipse-workspace2\\Selenium\\target\\Mobiles1.xlsx");	
		Workbook W = new XSSFWorkbook();
		Sheet S = W.createSheet("Phones");
		for(int i=0;i<samsung.size();i++) {
			WebElement mobiles=samsung.get(i);
			String mobilenames = mobiles.getText();
			Row R = S.createRow(i);
			Cell C = R.createCell(0);
			C.setCellValue(mobilenames);
			Modelcount++;
			for(int j=i;j==i;j++) {
				WebElement price=Price.get(i);
				String Cost = price.getText();
				Row R1 = S.createRow(j);
				Cell C1 = R1.createCell(1);
				C1.setCellValue(Cost);
				Pricecount++;
				M.put(mobilenames, Cost);			
			}
		}
		Set<Entry<String, Object>> E = M.entrySet();
		for(Entry<String, Object> X:E) {
			System.out.println(X);
		}
		FileOutputStream Fout = new FileOutputStream(F);
		W.write(Fout);
			
			
			
			
		
		
		
		System.out.println("Pricecount is "+Pricecount);
		System.out.println("Modelcount is "+Modelcount);
		
//		try {
//		WebElement search= Driver.findElement(By.name("s"));
//		search.sendKeys("SAMSUNG",Keys.ENTER);
//		
//	}
//	catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
//	finally {
//		System.out.println("No Such Element Exception");
//								}
//	Driver.quit();
		
	}
}
