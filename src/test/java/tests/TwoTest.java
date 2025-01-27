package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base {
	
	public WebDriver driver;
	
	@Test
	public void testTwo() throws IOException, InterruptedException {
		
		System.out.println("TestTwo");
		System.out.println("Chris has updated this code");
		driver = initializeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		driver.close();
	}

}
