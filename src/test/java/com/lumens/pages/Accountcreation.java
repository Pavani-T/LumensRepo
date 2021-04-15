package com.lumens.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.constants.BaseClassLumens;
import com.lumens.constants.ReadExcel;
import com.lumens.utilities.Waits;



public class Accountcreation extends BaseClassLumens {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath = "//button[@class='btn account-btn']")
	WebElement account;
	@FindBy(xpath = "//a[@class='userlogin']")
	WebElement signin;
	@FindBy(xpath = "//button[@id='createAccountBtn']")
	WebElement Createaccount;

	@FindBy(id = "dwfrm_profile_customer_firstname")
	WebElement Firstname;
	@FindBy(id = "dwfrm_profile_customer_lastname")
	WebElement Lastname;
	@FindBy(id = "dwfrm_profile_customer_email")
	WebElement Email;
	@FindBy(id = "dwfrm_profile_customer_emailconfirm")
	WebElement Confirmemail;
	@FindBy(name = "dwfrm_profile_login_password")
	WebElement Password;
	@FindBy(name = "dwfrm_profile_login_passwordconfirm")
	WebElement Confirmpassword;
	@FindBy(xpath = "//button[@class='medium']")
	WebElement Createbutton;

	@FindBy(xpath = "//input[@name='dwfrm_login_username']")
	WebElement Loginemail;
	@FindBy(id = "dwfrm_login_password")
	WebElement Loginpsw;
	@FindBy(name = "dwfrm_login_login")
	WebElement Loginbtn;
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	WebElement signout;

	public Accountcreation() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void clicksignin() {

		Actions pointer = new Actions(driver);
		pointer.clickAndHold(account).build().perform();

		pointer.moveToElement(signin).click().build().perform();
		Waits.waitperiod();
	}

	public void createaccount() {
		Createaccount.click();
		Firstname.sendKeys(ReadExcel.getcellvalue("FirstName"));
		Lastname.sendKeys(ReadExcel.getcellvalue("LastName"));
		Email.sendKeys(ReadExcel.getcellvalue("Email"));
		Confirmemail.sendKeys(ReadExcel.getcellvalue("Email"));
		Password.sendKeys(ReadExcel.getcellvalue("Password"));
		Confirmpassword.sendKeys(ReadExcel.getcellvalue("Password"));
		Createbutton.click();
	}

	public void login() {

		Createaccount.click();
		Loginemail.sendKeys(ReadExcel.getcellvalue("Username"));
		Loginpsw.sendKeys(ReadExcel.getcellvalue("Password"));

	}

	public void signout() {
		Actions pointer = new Actions(driver);
		pointer.clickAndHold(account).build().perform();
		pointer.click(signout).build().perform();
		Waits.waitperiod();
	}

	public void scrollpage() {

		js.executeScript("window.scrollBy(0,1000)");
		Waits.waitperiod();
		js.executeScript("window.scrollBy(0,-1000)");
	}

}
