package TestScripts;

import java.io.IOException;


import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterAPatientPage;
import WebDriverFactory.DriverInitialization;

public class loginScripts extends DriverInitialization {
	
	@Test
	public void TestScript() throws IOException {
		driver = driverInitialization();
		driver.get("https://qa-refapp.openmrs.org/openmrs/login.htm");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("admin");
		loginPage.enterPassword("Admin123");
		loginPage.clickLocationIsolationWard();
		HomePage homePage = loginPage.clickLogin();
		RegisterAPatientPage registerAPatientPage = homePage.clickRegisterAPatient();
		registerAPatientPage.enterPatientName("patient1", "family1");
		registerAPatientPage.selectGender("male");
		registerAPatientPage.fillDOB("1", "january", "1997");
		registerAPatientPage.enterAdress("adress1");
		registerAPatientPage.entryPhoneNumber("123445");
		registerAPatientPage.entryRelativeName("relative1");
		registerAPatientPage.clickSubmitButton();
		driver.quit();
	}

}
