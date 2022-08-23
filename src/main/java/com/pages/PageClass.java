package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.utility.Locators;

public class PageClass {
	public WebDriver driver;
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
		
	}
	public void search() {
		driver.findElement(By.xpath(Locators.SEARCH_INPUT)).click();
		driver.findElement(By.xpath(Locators.SEARCH_INPUT)).sendKeys("selenium");
		driver.findElement(By.xpath(Locators.SEARCH_INPUT)).sendKeys(Keys.ENTER);
	}

}
