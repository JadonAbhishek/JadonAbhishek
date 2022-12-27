package webdriverBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
	
	
		driver.close();
		
//================================================
		/*System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads/");*/
		
		
		
	}
	

	}



