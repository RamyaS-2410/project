package com.testNGPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class SampleTestNGProgram {
	WebDriver ab;
	@BeforeSuite
	public void start() {
		System.out.println("Program starts here...");
	}
	 @BeforeTest
	 public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver ab=new ChromeDriver();
		 ab.manage().window().maximize();
		 ab.get("https://www.dermstore.com/");
		 ab.manage().deleteAllCookies();
	 }
	 @AfterMethod
		public void after() {
			ab.quit();
		}
		@AfterSuite
		public void end() {
			System.out.println("Program ends here...");
		}
	}

