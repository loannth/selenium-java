package com.tiki.product;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Product_01_New_Product {
	WebDriver driver;

	@Test
	public void TC_01_Chrome() {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://facebook.com");
		driver.quit();
	}

	@Test
	public void TC_02_Firefox() {
		driver = WebDriverManager.firefoxdriver().create();
		driver.get("https://facebook.com");
		driver.quit();

	}

}
