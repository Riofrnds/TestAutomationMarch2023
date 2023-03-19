package qaautomation.maret2023;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.maret2023.pages.Tugas2LoginPage;
import qaautomation.maret2023.pages.Tugas2OrderPage;
import qaautomation.maret2023.pages.Tugas2ProfilePage;

public class Tugas2POMManual extends Tugas2{
	Tugas2LoginPage loginPage = new Tugas2LoginPage(driver,explicitWait);
	Tugas2OrderPage orderPage = new Tugas2OrderPage(driver,explicitWait);
	Tugas2ProfilePage profilePage = new Tugas2ProfilePage(driver, explicitWait);
	
	@Test
	public void automationFinishTransaction() {
		//loginpage
		loginPage.inputUsername("standard_user");
		loginPage.inputPassword("secret_sauce");
		loginPage.clickloginBtn();
		
		//orderpage
		orderPage.clickorderBtn();
		orderPage.clickcartBtn();
		orderPage.clickcheckoutBtn();
		orderPage.inputFirstname("William");
		orderPage.inputLastname("Smith");
		orderPage.inputPostalcode("1280");
		orderPage.clickcontinueBtn();
		orderPage.finishBtn();
		
		//profilepage
		String actualText = profilePage.getProfileText();
		String expectedText = "Thank you for your order!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
