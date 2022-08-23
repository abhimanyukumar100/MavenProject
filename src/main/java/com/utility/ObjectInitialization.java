package com.utility;

import org.openqa.selenium.WebDriver;

import com.objectmap.Locators;
import com.pages.PageClass;

public class ObjectInitialization {
public WebDriver driver;
public PageClass pgclass;

public ObjectInitialization() {
	driver=BaseClass.setup();
	pgclass=new PageClass(driver);
}
}
