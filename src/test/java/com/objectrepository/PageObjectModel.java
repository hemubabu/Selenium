package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.CommonActions;

public class PageObjectModel extends CommonActions{
	public PageObjectModel() {
		PageFactory.initElements(Driver, this);	
	}
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;

	public WebElement getClose() {
		return close;
	}

	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create;
	public WebElement getCreate() {
		return create;
		
	}
	
	
	
		
}
