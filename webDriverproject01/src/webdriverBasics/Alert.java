package webdriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//body/main[1]/form[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		
		Thread.sleep(1000);
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		if(txt.contentEquals("Please select start place."))
		{
			driver.switchTo().alert().accept();
			
		}
		
		else 
			
			System.out.println("Invalid Alert");
			driver.close();
			
		
		
		//driver.quit();
		
		

	}

}
