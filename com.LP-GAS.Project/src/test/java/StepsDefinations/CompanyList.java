package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyList extends Base{

	@When("Select CompanyList from drop down list")
	public void select_company_list_from_drop_down_list() throws Exception {
		 Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement company = driver.findElement(By.xpath("//span[normalize-space()='Company List']"));
		 action.moveToElement(company).click().perform();
		
	}

	@When("click on add company")
	public void click_on_add_company() throws Exception {
	 //   
		WebElement addcompany = driver.findElement(By.xpath("//button[normalize-space()='Add Company']"));
		addcompany.click();
		Thread.sleep(2000);
	}

	@When("Enter Company Name {string} Email {string} Phone Number {string} Fax Number {string} Cell Number {string} Address {string} City {string} Province {string} Postal Code {string} Country {string}")
	public void enter_company_name_email_phone_number_fax_number_cell_number_address_city_province_postal_code_country(String CompanyName, String Email, String PhoneNumber, String FaxNumber, String CellNumber, String Address, String City, String Province, String PostalCode, String Country) throws Exception {
	    
		//Company Name
		WebElement companyname = driver.findElement(By.xpath("//input[@formcontrolname='Name']"));
		companyname.sendKeys(CompanyName);
		Thread.sleep(1000);
		
		//Email
		WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='Email']"));
		email.sendKeys(Email);
		
		//Phone Number
		WebElement phonenumber = driver.findElement(By.xpath("//input[@formcontrolname='PhoneNo']"));
		phonenumber.sendKeys(PhoneNumber);
		
		//Fax Number
		WebElement faxnumber = driver.findElement(By.xpath("//input[@formcontrolname='FaxNo']"));
		faxnumber.sendKeys(FaxNumber);
		
		//Cell Number
		WebElement cellnumber = driver.findElement(By.xpath("//input[@formcontrolname='CellNo']"));
		cellnumber.sendKeys(CellNumber);
		
		//Address
		WebElement address = driver.findElement(By.xpath("//input[@formcontrolname='Address']"));
		address.sendKeys(Address);
		
		
		//City
		WebElement city = driver.findElement(By.xpath("//input[@formcontrolname='City']"));
		city.sendKeys(City);
		
		
		//Province
		WebElement province = driver.findElement(By.xpath("//input[@formcontrolname='Province']"));
		province.sendKeys(Province);
		
		//Postal Code
		WebElement postalcode = driver.findElement(By.xpath("//input[@formcontrolname='PostalCode']"));
		postalcode.sendKeys(PostalCode);
		
		//Country
		WebElement country = driver.findElement(By.xpath("//input[@formcontrolname='Country']"));
		country.sendKeys(Country);
		
		
	}

	@Then("click on Save&Submit")
	public void click_on_save_submit() throws Exception {

		action = new Actions(driver);
		WebElement save = driver.findElement(By.xpath("//button[@id='btnLabel']"));
		action.moveToElement(save).click().build().perform();
		Thread.sleep(2000);
		
		
	}
	
	
}
