package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantMembership extends Base{

	@Given("click on membership")
	public void click_on_membership() throws Exception {
		
		Thread.sleep(1000);
		WebElement Membership = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Membership);

	}

	@When("select membership application from the drop down application")
	public void select_membership_application_from_the_drop_down_application() throws Exception {
		 
		Thread.sleep(1000);
		WebElement MembershipApplication = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", MembershipApplication);
		
	}

	@When("Add new application")
	public void add_new_application() throws Exception {
		
		
		Thread.sleep(1000);
		WebElement NewApplication = driver.findElement(By.xpath("//button[normalize-space()='New Application']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NewApplication);
		
	}

	
	
	@When("Enter Postal Address {string} City {string} Province {string} Postal Code {string} Street Address {string} Phone Number {string} Fax {string}")
	public void enter_postal_address_city_province_postal_code_street_address_phone_number_fax(String PostalAddress, String City, String Province, String PostalCode, String  StreetAddress, String PhoneNumber, String Fax) throws Exception {
	
		//Postal Address
		WebElement PostalAdd = driver.findElement(By.xpath("//input[@formcontrolname='Address']"));
		PostalAdd.sendKeys(PostalAddress);
		Thread.sleep(2000);
		
		//City
		WebElement city = driver.findElement(By.xpath("//input[@formcontrolname='City']"));
		city.sendKeys(City);
		
		
		//Province
		WebElement province = driver.findElement(By.xpath("//input[@formcontrolname='Province']"));
		province.sendKeys(Province);
		Thread.sleep(1000);	
		
		//Postal code
		WebElement postalcode = driver.findElement(By.xpath("//input[@formcontrolname='PostalCode']"));
		postalcode.sendKeys(PostalCode);
				
		
		//Street Address
		WebElement streetaddress = driver.findElement(By.xpath("//input[@formcontrolname='StreetAddress']"));
		streetaddress.sendKeys(StreetAddress);
		
		
		//Phone Number
		WebElement phonenumber = driver.findElement(By.xpath("//input[@formcontrolname='Phone']"));
		phonenumber.sendKeys(PhoneNumber);
				
		//Fax
		WebElement fax = driver.findElement(By.xpath("//input[@formcontrolname='Fax']"));
		fax.sendKeys(Fax);
		
		
	}

	
	
	
	@When("upload Documents UserId {string}  CompanyProfile {string}")
	public void upload_documents_user_id_company_profile(String Userid, String Profile) throws Exception {

		//upload Documents UserId
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file1']"));
		upload_file.sendKeys(Userid);
		Thread.sleep(1000);
		
		//Company Profile
		WebElement upload_Profile = driver.findElement(By.xpath("//input[@id='file2']"));
		upload_Profile.sendKeys(Profile);
		
		
	}


	@When("Select type {string} and enter QCC number {string}")
	public void select_type_and_enter_qcc_number(String type, String QCC) throws Exception{
		//Select type
		WebElement type1 = driver.findElement(By.xpath("//select[@name='MembershipType']"));
		Select element = new Select(type1);
		element.selectByVisibleText(type);
		
		
		//QCC number
	   	WebElement qcc = driver.findElement(By.xpath("//input[@placeholder='Installer QCC Number']"));
		qcc.sendKeys(QCC);
		
	}

	@When("click on declaration checkbox")
	public void click_on_declaration_checkbox() {
	
		 
		WebElement checkbox = driver.findElement(By.xpath("//p-checkbox[@formcontrolname='IsAgreeTerms']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));	
		checkbox.click();

		
	}

	@Then("Apply on Membership button")
	public void apply_on_membership_button() throws Exception {
	    
		Thread.sleep(1000);
		WebElement NewApplication = driver.findElement(By.xpath("//button[normalize-space()='Apply for Membership']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NewApplication);
		
			
	}
	
	
}
