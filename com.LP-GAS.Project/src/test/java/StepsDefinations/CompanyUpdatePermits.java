package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyUpdatePermits extends Base{


	@Given("Select the Appliance Permit Module")
		public void select_the_appliance_permit_module() throws Exception {
		

		WebElement appliancePermit = driver.findElement(By.xpath("//span[normalize-space()='Appliance Permit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliancePermit);
		Thread.sleep(1000);
		
		
	}

	@When("Select Permits from the list")
		public void select_permits_from_the_list() throws Exception {
		
		
		WebElement permit = driver.findElement(By.xpath("//span[normalize-space()='Permits']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", permit);
		Thread.sleep(1000);
		
	}

	@When("Click on the edit option of which you want to uadate")
		public void click_on_the_edit_option_of_which_you_want_to_uadate() throws Exception {
		
		WebElement permitedit = driver.findElement(By.xpath("//tbody/tr[4]/td[9]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", permitedit);
		Thread.sleep(1000);
		
	}

	@When("Update the values applicant not manufacture section Name of Manufacturer {string} Telephone Number {string} Cell number {string} Email Address {string} Country of origin {string}")
		public void update_the_values_applicant_not_manufacture_section_name_of_manufacturer_telephone_number_cell_number_email_address_country_of_origin(String Name, String TelephoneNumber, String CellNumber, String Email, String Country) {
		
		//Name of Manufacturer
		WebElement name = driver.findElement(By.xpath("//input[@formcontrolname='ManufacturerName']"));
		name.clear();
		name.sendKeys(Name);
		
		
		//Telephone NUmber
			WebElement telephone = driver.findElement(By.xpath("//input[@formcontrolname='telNoManufacturer']"));
			telephone.clear();
			telephone.sendKeys(TelephoneNumber);
				
		//Cell Number
			WebElement cellnumber = driver.findElement(By.xpath("//input[@formcontrolname='cellNoManufacturer']"));
			cellnumber.clear();
			cellnumber.sendKeys(CellNumber);
				
		//Email
			WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='manufacturerEmail']"));
			email.clear();
			email.sendKeys(Email);
				
		//Country
			WebElement country = driver.findElement(By.xpath("//input[@formcontrolname='CountryOrigin']"));
			country.clear();
			country.sendKeys(Country);
				
				
	}

	@Then("Click on the Udate Details button")
		public void click_on_the_udate_details_button() throws Exception {
		
		WebElement update = driver.findElement(By.xpath("//button[normalize-space()='Update Details']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", update);
		Thread.sleep(1000);
		
		
	}

	
}
