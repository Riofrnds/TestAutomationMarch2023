package qaautomation.maret2023.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas2ProfilePage extends Tugas2BasePage{
	public Tugas2ProfilePage (ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}
	
	By profileText = By.className("complete-header");
	
	public String getProfileText() {
		return getText(profileText);
	}
}
