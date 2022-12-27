package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");	
		
		WebElement img = driver.findElement(By.xpath(" //body/div[@id='u_0_1_u1']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
		
		System.out.println(img.isDisplayed());
		
		System.out.println(img.isEnabled());
		
		System.out.println(img.isSelected());
		
		//============================
		
		
		WebElement Unm = driver.findElement(By.id("email"));
		Unm.sendKeys("welcome");
		Thread.sleep(500);
		
		Unm.clear();
		Unm.sendKeys("A1@gmsil.com");
		
		
		
	}

}
