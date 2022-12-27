package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions (driver);
		
	org.openqa.selenium.WebElement Unm = driver.findElement(By.xpath("//input[@id='email']"));
	org.openqa.selenium.WebElement Pwd = driver.findElement(By.id("pass"));
	org.openqa.selenium.WebElement log = driver.findElement(By.id("u_0_5_Bp")); //login button
	
	int x = log.getLocation().getX();
	int y = log.getLocation().getY();
	
	Unm.click();
	
	act.moveToElement(Unm).sendKeys("a1@gmail.com").build().perform();
	act.moveToElement(Pwd).sendKeys("alpha").build().perform();
	act.moveByOffset(x,y).click().build().perform();
	
	
	}

}
