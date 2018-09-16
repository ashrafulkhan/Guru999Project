package Guru999.Guru999Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestBase extends BaseClass {
	
	@Test
	public void test() {
	
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("32 degrees celsius to fahrenheit");
		
		
	}

}
