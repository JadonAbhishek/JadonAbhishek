package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Back Done.....");
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Forward Done");
		
		driver.navigate().refresh();
		System.out.println("Refresh Done");

	}

}
