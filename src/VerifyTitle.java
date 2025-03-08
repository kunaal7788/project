package com.selenium.day7;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException{
			//1.Launch browser
		ChromeDriver driver = new ChromeDriver();
			//2.Open Website .
		driver.get("https://demo.opencart.com/");
			//Fetch the title
		String actualTitle = driver.getTitle();
			//compare expected and actual title
		
		//display result 
		String expectedTitle = "Your Store";
		System.out.println("Expectd Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		if (expectedTitle.contentEquals(actualTitle))
			System.out.println("Title verification passed");
		else
			System.out.println("Title verification passed");
			//close browser
		Thread.sleep(5000);
		driver.close();	}

}
