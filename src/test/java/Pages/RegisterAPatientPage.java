package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import WebDriverFactory.DriverInitialization;

public class RegisterAPatientPage extends DriverInitialization  {
	public RegisterAPatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
///////////////////WEBELEMENTS//////////////////////////////////
@FindBy(how=How.ID , using="fr3668-field")
WebElement edtBoxGiven;

@FindBy(how=How.ID , using="fr1291-field")
WebElement edtBoxFamilyName;

@FindBy(how=How.XPATH , using="//icon[@class='fas fa-chevron-right']")
WebElement iconNext;

@FindBy(how=How.ID , using="gender-field")
WebElement drpDwnGender;

@FindBy(how=How.ID , using="birthdateMonth-field")
WebElement drpBirthMonth;


@FindBy(how=How.ID , using="birthdateMonth-field")
WebElement edtBoxBirthDay;

@FindBy(how=How.ID , using="birthdateYear-field")
WebElement edtBoxBirthYear;

@FindBy(how=How.ID , using="address1")
WebElement edtBoxAdress;

@FindBy(how=How.ID , using="fr4705-field")
WebElement edtBoxPhoneNo;

@FindBy(how=How.XPATH , using="//input[@placeholder='Person Name']")
WebElement edtBoxRelativeName;

@FindBy(how=How.ID , using="submit")
WebElement btnSubmit;
/////////////////REUSABLE METHODS/////////////////////////////////////

/**
* @author vignesh
* @param givenName
* @summary Enter Given Name
*/
private void EnterGivenName(String givenName) {
	edtBoxGiven.sendKeys(givenName);
}

/**
* @author vignesh
* @param familyName
* @summary Enter family Name
*/
private void EnterFamilyName(String familyName) {
	edtBoxFamilyName.sendKeys(familyName);
}

public void enterPatientName(String givenName,String familyName) {
	EnterGivenName(givenName);
	EnterFamilyName(familyName);
	clickNextIcon();
}
	
/**
 * @author vignesh
 * @summary click Next Icon
 */
private void clickNextIcon() {
	iconNext.click();
}

/**
 * @author vignesh
 * @param gender
 * @summary select Gender
 */
public void selectGender(String gender) {
	Select select = new Select(drpDwnGender);
	select.selectByVisibleText(gender);
	iconNext.click();
}

/**
 * @author vignesh
 * @param birthDay
 * @summary enter Birth Day
 */
private void enterBirthDay(String birthDay) {
	edtBoxBirthDay.sendKeys(birthDay);
}

/**
 * @author vignesh
 * @param birthMonth
 * @summary select Birth Month
 */
private void selectBirthMonth(String birthMonth) {
	Select select = new Select(drpBirthMonth);
	select.selectByVisibleText(birthMonth);
}

/**
 * @author vignesh
 * @param birthYear
 * @summary entry Birth Year
 */
private void entryBirthYear(String birthYear) {
	edtBoxBirthYear.sendKeys(birthYear);
}

/**
 * @author vignesh
 * @param birthDay
 * @param birthMonth
 * @param birthYear
 * @summary fill D O B
 */
public void fillDOB(String birthDay, String birthMonth,String birthYear) {
	enterBirthDay(birthDay);
	selectBirthMonth(birthMonth);
	entryBirthYear(birthYear);
	clickNextIcon();
}

/**
 * @author vignesh
 * @param adress
 * @summary enter Adress
 */
public void enterAdress(String adress) {
	edtBoxAdress.sendKeys(adress);
	clickNextIcon();
}

/**
 * @author vignesh
 * @param phoneNo
 * @summary entryPhone Number
 */
public void entryPhoneNumber(String phoneNo ) {
	edtBoxPhoneNo.sendKeys(phoneNo);
	clickNextIcon();
}

/**
 * @author vignesh
 * @param relativeName
 * @summary entry Relative Name
 */
public void entryRelativeName(String relativeName) {
	edtBoxRelativeName.sendKeys(relativeName);
	clickNextIcon();
}

/**
 *@author vignesh
 *@summary click Submit Button
 */
public void clickSubmitButton() {
btnSubmit.click();
}
}
