package com.example2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumJUnitTest {
	
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
//		ChromeDriverManager.getInstance().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bretb\\Desktop\\chrome-driver-selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@Test
	public void test_google_dot_com() {
		driver.get("https://www.google.com/");
		assertEquals("Google", driver.getTitle());
	}

}
