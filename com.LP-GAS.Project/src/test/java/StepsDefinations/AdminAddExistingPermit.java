package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAddExistingPermit extends Base{

	@Given("Click on Grant Permits")
	public void click_on_grant_permits() throws Exception {
	  
	
		WebElement permit = driver.findElement(By.xpath("//span[normalize-space()='Grant Permits']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", permit);
	
		Thread.sleep(1000);	
		
	}

	@When("Click on appliances")
	public void click_on_appliances() throws Exception {
		
	
		WebElement appliance = driver.findElement(By.xpath("//span[normalize-space()='Appliances']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliance);
		Thread.sleep(1000);	

	}

	@When("Click on add existing permit")
	public void click_on_add_existing_permit() throws Exception {
		WebElement add = driver.findElement(By.xpath("//button[normalize-space()='Add Existing Permit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", add);
		Thread.sleep(1000);
	}
	
	
	
	@When("Enter Name of Applicant {string} Existing Supplier Number {string} Telephone number {string}  Cell number {string} EmailAddress {string}")
	public void enter_name_of_applicant_existing_supplier_number_telephone_number_cell_number_email_address(String Name, String SupplierNo, String Telephone, String CellNumber, String Email) {

	//Name of Applicant	
		WebElement name = driver.findElement(By.xpath("//input[@formcontrolname='ApplicantName']"));
		name.sendKeys(Name);
		
	//Existing Supplier Number	
		WebElement supplier = driver.findElement(By.xpath("//input[@formcontrolname='existingSupplierNumber']"));
		supplier.sendKeys(SupplierNo);
				
		
	//Telephone	
		WebElement telephone = driver.findElement(By.xpath("//input[@formcontrolname='TelephoneNumber']"));
		telephone.sendKeys(Telephone);
		
	//Cell Number	
		WebElement cellnumber = driver.findElement(By.xpath("//input[@formcontrolname='CellNumber']"));
		cellnumber.sendKeys(CellNumber);
			
	
		
	//Email	
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(Email);
	
	}
	
		
	

	@When("Select are you manufacture")
		public void select_are_you_manufacture() {
 
	//	WebElement radiono = driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-clickable']"));
	//	radiono.click();
		
		WebElement radioyes= driver.findElement(By.xpath("//span[1]//p-radiobutton[1]//div[1]//div[2]"));
		radioyes.click();
	}

	@When("Name of Manufacturer {string} Telephone Number {string} Cell number {string} Email Address {string} Street Address of factory {string}")
		public void name_of_manufacturer_telephone_number_cell_number_email_address_street_address_of_factory(String NameofManufacturer, String TelephoneNumber, String CellNumber, String EmailAddress, String StreetAddress) {
/*	
		//Name of Manufacturer
		WebElement manufacture = driver.findElement(By.xpath("//input[@formcontrolname='ManufacturerName']"));
		manufacture.sendKeys(NameofManufacturer);
	
		
		//Telephone Number
		WebElement telephoneNumber = driver.findElement(By.xpath("//input[@formcontrolname='telNoManufacturer']"));
		telephoneNumber.sendKeys(TelephoneNumber);
	
		

		//Cell Number
		WebElement cellNumber = driver.findElement(By.xpath("//input[@formcontrolname='cellNoManufacturer']"));
		cellNumber.sendKeys(CellNumber);
	
	
		//Email Address
		WebElement email1 = driver.findElement(By.xpath("//input[@formcontrolname='manufacturerEmail']"));
		email1.sendKeys(EmailAddress);

		
		//Street Address of factory 
		WebElement street = driver.findElement(By.xpath("//input[@formcontrolname='manufacturerAddress']"));
		street.sendKeys(StreetAddress);

	*/
	}
	
	

	@When("Testing Authority {string} QMS Type {string} Test Report Number {string}")
	public void testing_authority_qms_type_test_report_number(String Authority, String QMSTYPE, String TestReport) {
	
		
		//Testing Authority
		WebElement authority = driver.findElement(By.xpath("//input[@formcontrolname='InTestingAuthority']"));
		authority.sendKeys(Authority);
	
		//QMS Type
		WebElement qms = driver.findElement(By.xpath("//input[@formcontrolname='QMSType']"));
		qms.sendKeys(QMSTYPE);
	
		//Testing Report Number
		WebElement testReport = driver.findElement(By.xpath("//input[@formcontrolname='TestReportNumber']"));
		testReport.sendKeys(TestReport);
	
		
	}

	@When("Select Test Report Issued Date {string} Permit Expiry Date {string}")
	public void select_test_report_issued_date_permit_expiry_date(String IssueDate, String PermitExpiry) {
	    
		//IssueDate
		WebElement issueDate = driver.findElement(By.xpath("//input[@formcontrolname='TestReportIssuedDate']"));
		issueDate.sendKeys(IssueDate);
		

		// Permit Expiry Date
		WebElement permitexpiry = driver.findElement(By.xpath("//input[@formcontrolname='PermitExpiryDate']"));
		permitexpiry.clear();
		permitexpiry.sendKeys(PermitExpiry);
		
		
	}

	@When("Product Description {string} Model Number {string} Country of origin {string} Brand Name {string}")
	public void product_description_model_number_country_of_origin_brand_name(String ProductDescription, String ModelNumber, String Country, String BrandName) throws Exception {
	 
	//Product Description
		WebElement product = driver.findElement(By.xpath("//input[@formcontrolname='productDescription']"));
		product.sendKeys(ProductDescription);
		
	//Model Number
			WebElement modelNumber = driver.findElement(By.xpath("//input[@formcontrolname='ModelNumber']"));
			modelNumber.sendKeys(ModelNumber);
			Thread.sleep(2000);	
	//Country of origin
			WebElement country = driver.findElement(By.xpath("//input[@formcontrolname='CountryOrigin']"));
			country.sendKeys(Country);
				
	//Brand Name
			Thread.sleep(1000);
			WebElement brandName = driver.findElement(By.xpath("//input[@formcontrolname='productBrandName']"));
			brandName.sendKeys(BrandName);
				
		
	}

	@Then("Click on Save and submitt button")
	public void click_on_save_and_submitt_button() throws Exception {

		Thread.sleep(1000);
		
		WebElement save1 = driver.findElement(By.xpath("//button[normalize-space()='Save & Submit']"));
		save1.click();
		
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click();", save1);

		
	}

	
}
