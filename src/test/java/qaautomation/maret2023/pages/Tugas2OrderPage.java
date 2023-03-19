package qaautomation.maret2023.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tugas2OrderPage extends Tugas2BasePage {
	
	By orderBtn = By.id("add-to-cart-sauce-labs-backpack");
	By cartBtn = By.className("shopping_cart_link");
	By checkoutBtn = By.id("checkout");
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By postalcode = By.id("postal-code");
	By continueBtn = By.id("continue");
	By finishBtn = By.id("finish");
	
	
	public Tugas2OrderPage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
	}
	
	public void clickorderBtn() {
		clickAndWait(orderBtn);
	}
	
	public void clickcartBtn() {
		clickAndWait(cartBtn);
	}
	
	public void clickcheckoutBtn() {
		clickAndWait(checkoutBtn);
	}
	
	public void inputFirstname(String firstnameInput) {
		setText(firstname,firstnameInput);
	}
	
	public void inputLastname(String lastnameInput) {
		setText(lastname,lastnameInput);
	}
	
	public void inputPostalcode(String postalcodeInput) {
		setText(postalcode,postalcodeInput);
	}
	
	public void clickcontinueBtn() {
		clickAndWait(continueBtn);
	}
	
	public void finishBtn() {
		clickAndWait(finishBtn);
	}
}