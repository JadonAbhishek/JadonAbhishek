package webdriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions (driver);
		
		WebElement signin =  (WebElement) driver.findElements(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]"));
		
		//act.moveToElement(signin).doubleClick().build().perform();
		//act.doubleClick(signin).build().perform();
		//act.moveToElement(signin).contextClick().build().perform();
		act.moveToElement(signin).contextClick().perform();
		
		
		driver.quit();
		
		
	}

}
