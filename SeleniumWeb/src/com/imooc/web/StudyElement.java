package com.imooc.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudyElement  {
	WebDriver driver;
	public WebDriver InitDriver() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		driver.get("http://www.imooc.com");
		driver.findElement(By.className("js-close-september")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
		return driver;
	}
	
	public void GetElement() {
	WebDriver driver;
	driver = InitDriver();
	WebElement FormElement = driver.findElement(By.id("sigunp-form"));
	
	driver.findElement(By.name("email"));
	driver.findElement(By.className("moco-btn-red"));
	driver.findElement(By.className(""));
	driver.findElement(By.tagName("input"));
	driver.findElement(By.linkText("�һ�����"));
	driver.findElement(By.partialLinkText("�һ�"));
	driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[4]/a[2]"));
	
	List<WebElement> ButtonList = driver.findElements(By.className("moco-btn-red"));
	ButtonList.get(0).sendKeys("test");
	FormElement.findElement(By.tagName("input")); 
	
	}
	public static void main(String[] args) {
		StudyElement s = new StudyElement();
		s.GetElement();
	}
}
