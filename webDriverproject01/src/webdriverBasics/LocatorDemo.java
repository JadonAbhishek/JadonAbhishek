package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");	
		
		WebElement Unm = driver.findElement(By.id("email"));
		Unm.sendKeys("Ai@gmail.com");
		
		driver.findElement(By.name("pass"));
		
		Thread.sleep(1000);
		
		WebElement PWd = driver.findElement(By.name("pass"));
		PWd.sendKeys("test");
		
		//driver.findElement(By.className("inputtext"));
		
		//driver.findElement(By.tagName("input"));
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
