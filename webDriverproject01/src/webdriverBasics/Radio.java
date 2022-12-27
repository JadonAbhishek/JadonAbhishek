package webdriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		List <WebElement> Gender = driver.findElements(By.name("Gender"));
		
		
		//List<WebElement> Gender = driver.findElements(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]"));
		
	/*	
		int cnt = Gender.size();
		System.out.println(cnt);
		
		//=======================
		{
			int i;
		for(int i=0; i<cnt , i++);
		
				
				String txt = Gender.get(i).getText();
				System.out.println(txt);
				Gender.get(i).click();
				*/
				
		}
					
				
				
 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
