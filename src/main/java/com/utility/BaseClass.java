package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public BaseClass(WebDriver driver) {
		this.driver=driver;
	}
	public static WebDriver setup() {
		String path=System.getProperty("user.dir");
		String chromepath=path+"\\chromedriver.exe";
		System.setProperty("Webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		String url="http://www.google.com";
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}

}
