package qaautomation.maret2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tugas2 {
	//WebDriver driver;
		ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
		ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
		
		@BeforeMethod
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			explicitWait.set(new WebDriverWait(driver.get(),Duration.ofSeconds(4)));
			driver.get().get("https://www.saucedemo.com/");
		}
		
		@AfterMethod
		public void tearDown() {
			driver.get().quit();
		}
	}
