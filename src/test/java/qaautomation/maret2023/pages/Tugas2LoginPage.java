package qaautomation.maret2023.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas2LoginPage extends Tugas2BasePage {
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	
	public Tugas2LoginPage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}
	
	public void inputUsername(String usernameInput) {
		setText(username,usernameInput);
	}
	
	public void inputPassword(String passwordInput) {
		setText(password,passwordInput);
	}
	
	public void clickloginBtn() {
		clickAndWait(loginBtn);
	}
}