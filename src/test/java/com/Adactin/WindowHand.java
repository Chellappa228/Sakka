package com.Adactin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHand {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chellappa\\eclipse-workspace\\cumcum\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> trows = table.findElements(By.tagName("tr"));
	for (int i = 0; i <trows.size() ; i++) {
		WebElement row = trows.get(i);
		List<WebElement> theads = row.findElements(By.tagName("th"));
		for (int j = 0; j < theads.size(); j++) {
			WebElement head = theads.get(j);
			String text = head.getText();
			System.out.println(text);
		}
		List<WebElement> tdatas = row.findElements(By.tagName("td"));
		for (int j = 0; j <tdatas.size(); j++) {
			WebElement data = tdatas.get(j);
			String text = data.getText();
			System.out.println(text);
			String text2 = data.getText();
			if(text2.equals("Germany")) {
				System.out.println(text2);
			}
		}
	
		}
		
		
	}
	
}



