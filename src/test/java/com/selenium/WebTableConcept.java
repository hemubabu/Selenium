package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.CommonActions;

public class WebTableConcept extends CommonActions {
	static int Rowvalue;
	static int Colvalue;
	

	public static void main(String[] args) {
		CommonActions C = new CommonActions();
		C.launch("https://demo.guru99.com/test/web-table-element.php");
		
		
		int rowsize = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(rowsize);
		
		int colsize = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(colsize);
		
		//Using Header
				List<WebElement> header = Driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
				WebElement Company = Driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[text()='Company']"));
				int CompanyindexOf = header.indexOf(Company)+1;
				WebElement CurrentPrice = Driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[text()='Current Price (Rs)']"));
				int CurrentPriceindexOf = header.indexOf(CurrentPrice)+1;
				for(int i=1;i<=rowsize;i++) {
					WebElement Companyelement = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td["+ CompanyindexOf +"]"));
					String text = Companyelement.getText();
					WebElement CurrentPriceelement = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ i +"]/td["+ CurrentPriceindexOf +"]"));
					String text2 = CurrentPriceelement.getText();
					System.out.println(text+":"+text2);
						
				}
				
		for(int row=1;row<=rowsize;row++) {
			for(int col=1;col<=colsize;col++) {
				WebElement element = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ row +"]/td["+ col +"]"));
				String text = element.getText();
				if(text.contains("Corporation Bank") && col==2) {
					System.out.println(text);
					System.out.println(text+" row value" +row);
					System.out.println(text+"col value"+col);
					Rowvalue=row;
					Colvalue=col;
					
				}
			}
		}
		// to get specific col values
		for(int k=1;k<=rowsize;k++) {
			
			WebElement element = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ k +"]/td["+ Colvalue +"]"));
			String text = element.getText();
			System.out.println(text);
		}
		// to get specific row values
		for(int k=1;k<=colsize;k++) {
			
			WebElement element = Driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+ Rowvalue +"]/td["+ k +"]"));
			String text = element.getText();
			System.out.println(text);
		}
	}

}
