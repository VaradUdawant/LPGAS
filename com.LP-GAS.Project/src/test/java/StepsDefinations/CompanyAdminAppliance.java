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

public class CompanyAdminAppliance extends Base{

	@Given("Click on appliance permit")
	public void click_on_appliance_permit() throws Exception {
	
		action = new Actions(driver);
		WebElement AppliancePermit = driver.findElement(By.xpath("//span[normalize-space()='Appliance Permit']"));
		action.moveToElement(AppliancePermit).click().build().perform();
		Thread.sleep(2000);
		
	}

	@When("select permitts from drop down")
	public void select_permitts_from_drop_down() throws Exception {
		Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement permit = driver.findElement(By.xpath("//span[normalize-space()='Permits']"));
		 action.moveToElement(permit).click().perform();
		
	}

	@When("Click on apply new permit button")
	public void click_on_apply_new_permit_button() throws Exception {
	
		WebElement NewPermit = driver.findElement(By.xpath("//button[normalize-space()='Apply New Permit']"));
		NewPermit.click();
		Thread.sleep(1000);
	}
	
	
	@When("Update Telephone Number {string} Cell Number {string} Fax Number {string}")
	public void update_telephone_number_cell_number_fax_number(String Telephone1, String Cell1, String Fax1) {
	/* 
		//Telephone Number
			WebElement telephone1 = driver.findElement(By.xpath("//input[@formcontrolname='TelephoneNumber']"));
			telephone1.clear();
			telephone1.sendKeys(Telephone1);
				
		//Cell Number
			WebElement cell1 = driver.findElement(By.xpath("//input[@formcontrolname='CellNumber']"));
			cell1.clear();
			cell1.sendKeys(Cell1);
				
		//Fax Number
			WebElement fax1 = driver.findElement(By.xpath("//input[@formcontrolname='FaxNumber']"));
			fax1.clear();
			fax1.sendKeys(Fax1);
				
		*/
	}

	@When("Click on radio button Are you Manufacture as no")
	public void click_on_radio_button_are_you_manufacture_as_no() {
	 
		WebElement radio1 = driver.findElement(By.xpath("//p-radiobutton[@label='No']//div//div//span"));
		radio1.click();
		
	}

	@When("Enter Name of manufacture {string} Telephone Number {string} Cell Number {string} Email {string} Street Address {string}")
	public void enter_name_of_manufacture_telephone_number_cell_number_email_street_address(String Name2, String Telephone2, String Cell2, String Email2, String Address2) {
	 
		//Name of manufacture
			WebElement name2 = driver.findElement(By.xpath("//input[@formcontrolname='ManufacturerName']"));
			name2.sendKeys(Name2);
		
		//Telephone Number
				WebElement telephone2 = driver.findElement(By.xpath("//input[@formcontrolname='telNoManufacturer']"));
				telephone2.sendKeys(Telephone2);
			
		//Cell Number
				WebElement cell2 = driver.findElement(By.xpath("//input[@formcontrolname='cellNoManufacturer']"));
				cell2.sendKeys(Cell2);
						
		
		//Email
			WebElement email2 = driver.findElement(By.xpath("//input[@formcontrolname='manufacturerEmail']"));
			email2.sendKeys(Email2);
				
		//street Address
			WebElement address2 = driver.findElement(By.xpath("//input[@formcontrolname='manufacturerAddress']"));
			address2.sendKeys(Address2);
						
				
	}

	
	@When("Enter Test Report Number {string} Testing Authority {string} QMS Type {string} Product Description {string} Model Number\\(s) {string} Country of origin {string} Brand Name {string}")
	public void enter_test_report_number_testing_authority_qms_type_product_description_model_number_s_country_of_origin_brand_name(String TestReport, String Authority, String QMS, String ProductDecription, String ModelNumber, String Country, String BrandName) {
	
		//Test Report Number
		WebElement testreport = driver.findElement(By.xpath("//input[@formcontrolname='TestReportNumber']"));
		testreport.sendKeys(TestReport);
		
		//Testing Authority
		WebElement authority = driver.findElement(By.xpath("//input[@formcontrolname='InTestingAuthority']"));
		authority.sendKeys(Authority);
		
		//QMS Type
		WebElement qms = driver.findElement(By.xpath("//input[@formcontrolname='QMSType']"));
		qms.sendKeys(QMS);
		
		//Prodcut Description
		WebElement product = driver.findElement(By.xpath("//input[@formcontrolname='productDescription']"));
		product.sendKeys(ProductDecription);
		
		//Model Number
		WebElement modelnumber = driver.findElement(By.xpath("//input[@formcontrolname='ModelNumber']"));
		modelnumber.sendKeys(ModelNumber);
		
		//Country
		WebElement country = driver.findElement(By.xpath("//input[@formcontrolname='CountryOrigin']"));
		country.sendKeys(Country);
		
		//Brand Name
		WebElement brandname = driver.findElement(By.xpath("//input[@formcontrolname='productBrandName']"));
		brandname.sendKeys(BrandName);
		
		
		
	}

	@When("upload Quality Management System {string} and test report {string}")
	public void upload_quality_management_system_and_test_report(String QMS, String testreport) {
	
		//uploadQMS
		WebElement uploadqms = driver.findElement(By.xpath("//input[@id='file1']"));
		uploadqms.sendKeys(QMS);
		
		
		//Upload Test Report
		WebElement uploadreport = driver.findElement(By.xpath("//input[@id='file3']"));
		uploadreport.sendKeys(testreport);
		
		
	}

	@When("select Test Report Issued Date {string}")
	public void select_test_report_issued_date(String Reportdate1) {
	
		//Report Issued Date
	/*	WebElement reportdate = driver.findElement(By.xpath("//input[@formcontrolname='TestReportIssuedDate']"));
 		reportdate.sendKeys(Reportdate1);
	*/	
/*
		WebElement fromDateBox= driver.findElement(By.xpath("//input[@formcontrolname='TestReportIssuedDate']"));
		fromDateBox.clear();
		fromDateBox.sendKeys("06/08/2021");
	*/  
		
	//	((JavascriptExecutor)driver).executeScript("arguments[0].value = '06/08/2021'", driver.findElement(By.xpath("//input[@formcontrolname='TestReportIssuedDate']")));
		
	//	WebElement date = driver.findElement(By.xpath("//input[@formcontrolname='TestReportIssuedDate']"));
	//	date.sendKeys(Reportdate1);	
	
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/span[1]")).click();
		//Select sel3=new Select(driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(4) span:nth-child(1)")));

		//new Select((WebElement) sel3).selectByVisibleText("8"); 
	
	}

	
	@When("select Gas tpye {string} and appliance type {string}")
	public void select_gas_tpye_and_appliance_type(String GasTpye, String Appliance) throws Exception {
	/*
		//GasType
	    Thread.sleep(1000);
		
	    WebElement gastype = driver.findElement(By.xpath("//label[normalize-space()='NG']"));
		Select element11 = new Select(gastype);
		element11.selectByVisibleText(GasTpye);
	    
	    
		//Appliance Type
	  //  WebElement appliancetype = driver.findElement(By.cssSelector("p-dropdown[formcontrolname='GasType'] div div label"));
	//	Select element2 = new Select(appliancetype);
	 //   Thread.sleep(1000);
	
		Thread.sleep(1000);
		WebElement appliance = driver.findElement(By.xpath("//label[normalize-space()='Appliance']"));
		Select element2 = new Select(appliance);
		element2.selectByVisibleText(Appliance);
	    
	    
	*/	
	}
				
	@Then("click on submit button below")
	public void click_on_submit_button_below() throws Exception {

		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);
		
		
	}
	

}
