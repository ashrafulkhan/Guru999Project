package Guru999.Guru999Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\MyDevelopment\\MavenProject\\Guru999Project\\resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com/");
		
		
	}    
		
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
