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

public class CompanyAdminMembersip extends Base{

	@Given("click on the membership module")
	public void click_on_the_membership_module()  {
	
		action = new Actions(driver);
		WebElement membership1 = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		action.moveToElement(membership1).click().build().perform();
		
		
	}

	@When("select membership application from the dropdown list")
	public void select_membership_application_from_the_dropdown_list() throws Exception {
	     Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement membershipApp1 = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		 action.moveToElement(membershipApp1).click().perform();  
		
	}

	@When("Click on  new application")
	public void click_on_new_application() throws Exception {
	
		Thread.sleep(1000);
		WebElement NewApplication = driver.findElement(By.xpath("//button[normalize-space()='New Application']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NewApplication);
	
	}

	@When("Enter the Postal Address {string} City {string} Province {string} Postal Code {string} Street Address {string} Phone Number {string} Fax {string}")
	public void enter_the_postal_address_city_province_postal_code_street_address_phone_number_fax(String PostalAddress, String City, String Province, String Postalcode, String StreetAddress, String PhoneNumber, String Fax) {
	   
		//Postal Address
		WebElement Postaladd = driver.findElement(By.xpath("//input[@formcontrolname='Address']"));
		Postaladd.sendKeys(PostalAddress);
		
		//City
		WebElement city = driver.findElement(By.xpath("//input[@formcontrolname='City']"));
		city.sendKeys(City);
		
		//Province
		WebElement province = driver.findElement(By.xpath("//input[@formcontrolname='Province']"));
		province.sendKeys(Province);
		
		//PostalCode
		WebElement postalcode = driver.findElement(By.xpath("//input[@formcontrolname='PostalCode']"));
		postalcode.sendKeys(Postalcode);
		
		//StreetAddress
		WebElement streetadd = driver.findElement(By.xpath("//input[@formcontrolname='StreetAddress']"));
		streetadd.sendKeys(StreetAddress);
	
		//Phone Number
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@formcontrolname='Phone']"));
		phoneNumber.sendKeys(PhoneNumber);
		
		//Fax
		WebElement fax = driver.findElement(By.xpath("//input[@formcontrolname='Fax']"));
		fax.sendKeys(Fax);
		
	
	}

	@When("upload Documents CompanyID {string}  CompanyProfile\"C:\\Users\\Dell\\Pictures\"")
	public void upload_documents_company_id_company_profile_c_users_dell_pictures(String Companyid) {
	    
		WebElement upload_id = driver.findElement(By.xpath("//input[@id='file1']"));
		upload_id.sendKeys("C:\\Users\\Dell\\Desktop");
		
	}

	@When("upload Documents CompanyID {string}  CompanyProfile {string}")
	public void upload_documents_company_id_company_profile(String Companyid, String CompanyProfile) {
	
		//CompanyAdmin
		WebElement upload_id = driver.findElement(By.xpath("//input[@id='file1']"));
		upload_id.sendKeys("C:\\Users\\Dell\\Desktop");
		
		//CompanyProfile
		WebElement upload_profile = driver.findElement(By.xpath("//input[@id='file1']"));
		upload_profile.sendKeys("C:\\Users\\Dell\\Pictures");
		
	}

	
	
	@When("Select type {string}")
	public void select_type(String Hardware)  {
		
		WebElement type1=driver.findElement(By.xpath("//select[@name='MembershipType']"));
		Select element1 = new Select(type1);
		element1.selectByVisibleText(Hardware);
		
	}


	@When("Click the declaration checkbox")
	public void click_the_declaration_checkbox() throws Exception {
		Thread.sleep(1000); 
		WebElement checkbox = driver.findElement(By.xpath("//body/app-root/block-ui/div/div/section/app-home/app-membership-form/div/div/div/form[@name='frmMembership']/div/div/div/div/p-checkbox[@binary='true']/div/div[2]"));	
		checkbox.click();

	}


	@Then("Click on Apply on Membership button")
	public void click_on_apply_on_membership_button() throws Exception {
	 
		Thread.sleep(1000);
		WebElement apply = driver.findElement(By.xpath("//button[normalize-space()='Apply for Membership']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", apply);
	
		
	}

	
}
