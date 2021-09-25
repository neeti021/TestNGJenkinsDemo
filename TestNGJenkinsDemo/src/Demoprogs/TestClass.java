package Demoprogs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testCase1() {
		
	System.out.println("This is Test Case 1");
	}
	
	@Test
	public void testCase2() {
		
	System.out.println("This is Test Case 2");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	


}
