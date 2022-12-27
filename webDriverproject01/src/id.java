import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	
	
	public static void main(String[] args) {
		


	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Browser Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");	
	
	//This is first code.
	
	//WebElement Unm = driver.findElement(By.id("email")); //Unm is variable is pointing toward text box on FB page.
	
	 //=====================================================
	//This is not working due to Version problem
	/*Unm.sendKeys("A1@gmail.com");
	
	driver.findElement(By.name("pass")).sendKeys("test");*/
	//======================================================
	/*This is first code
	 * 
	 * driver.findElement(By.tagName("submit"));
	driver.findElement(By.id("loginbutton")).click();*/
	
	/*This is SecondCode
	 * ===================================================
	driver.findElement(By.linkText("Data Policy")).click();
	driver.findElement(By.partialLinkText("Data")).click();
	//driver.close(); //Parent Window
	driver.quit(); //Parent&Child window
	=======================================================*/
	
	//Xpath
	//Absolute Xpath--Using Attributes
	//Relative Xpath--based on Position

	driver.findElement(By.xpath("//input"[@id='email'])).sendKeys("welcome");
	
	
	
	
	
	
	
	
	
	
	
	
	[]
	}
		
	}


