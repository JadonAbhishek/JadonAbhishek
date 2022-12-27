package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println("title is :"+title);
		
		System.out.println(driver.getCurrentUrl());
		
		
		//driver.close();
		
		WebElement Unm = driver.findElement(By.id("email"));
		
		System.out.println(Unm.getAttribute("id"));
		System.out.println(Unm.getTagName());
		
		
		
	}

}
