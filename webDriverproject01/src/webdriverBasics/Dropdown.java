package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement day = (WebElement) driver.findElements(By.id("day"));
		
		driver.findElement(By.xpath("//select[@id='day']"));
		
		
		
		Select d1 = new Select(day);
		
		d1.selectByVisibleText("day");
		System.out.println(day.getAttribute("value")); 
		
		Thread.sleep(1000);
		
		driver.quit();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
