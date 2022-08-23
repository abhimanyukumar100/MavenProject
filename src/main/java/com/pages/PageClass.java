package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageClass {
	public WebDriver driver;
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
		
	}
	public void search() {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
	}

}
