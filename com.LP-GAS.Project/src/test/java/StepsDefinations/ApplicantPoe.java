package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantPoe extends Base{

	@Given("Click on the POE")
	public void click_on_the_poe() throws Exception {
		
		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='POE']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);	
	
		
	}

	@When("Clcik on POE list from dropdown")
	public void clcik_on_poe_list_from_dropdown() throws Exception {
		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='POE List']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);	
	
		
	}

	@When("Click on apply POE button")
	public void click_on_apply_poe_button() throws Exception {
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Apply POE']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		
	}
	
	@When("Update Applicant Name as {string} and Mentor Name as {string}")
	public void update_applicant_name_as_and_mentor_name_as(String Applicant, String Mentor) {
	 
		//Applicant Name
		WebElement applicant = driver.findElement(By.xpath("//input[@id='applicantName']"));
		applicant.clear();
		applicant.sendKeys(Applicant);
	
		//Mentor Name
		WebElement mentor = driver.findElement(By.xpath("//input[@id='mentorName']"));
		mentor.clear();
		mentor.sendKeys(Mentor);
		
	}
	
	
	

	@When("Enter the details Scope {string} Applicable SANS Code {string} Brand Name {string} Model Number {string} Category {string} Permit Number {string} Appliance Condition {string}  Seal Number {string}")
	public void enter_the_details_scope_applicable_sans_code_brand_name_model_number_category_permit_number_appliance_condition_seal_number(String Scope, String SANSCode, String BrandName, String ModelNumber, String Category, String PermitNumber, String ApplianceCondition, String SealNumber) {
	   
		//Scope
			WebElement scope = driver.findElement(By.xpath("//input[@id='scope']"));
			scope.sendKeys(Scope);
				
		
		//SANSCode
			WebElement sansCode = driver.findElement(By.xpath("//input[@id='SANSCode']"));
			sansCode.sendKeys(SANSCode);
		
		//Brand Name
			WebElement brandName = driver.findElement(By.xpath("//input[@id='brandName']"));
			brandName.sendKeys(BrandName);
				
		
		
			
		//Model Number
			WebElement modelNumber = driver.findElement(By.xpath("//input[@id='modelNumber']"));
			modelNumber.sendKeys(ModelNumber);
			
		//Category
			WebElement category = driver.findElement(By.xpath("//input[@id='category']"));
			category.sendKeys(Category);
				
		//Permit Number
			WebElement permitNumber = driver.findElement(By.xpath("//input[@id='permitNumber']"));
			permitNumber.sendKeys(PermitNumber);
		
			
		//Appliance Condition
			WebElement appliance = driver.findElement(By.xpath("//input[@id='condition']"));
			appliance.sendKeys(ApplianceCondition);
			
		//Seal Number
			WebElement seal = driver.findElement(By.xpath("//input[@id='sealNumber']"));
			seal.sendKeys(SealNumber);
			
			
	}

	@When("Upload Zip file {string}")
	public void upload_zip_file(String upload) throws Exception {
		Thread.sleep(1000);
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='poeFile']"));
		upload_file.sendKeys("C:\\Users\\Dell\\Pictures\\New folder.zip");
		
		
	}

	@Then("Click on submit button")
	public void click_on_submit_button() throws Exception {
	   

		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);
	
		
	}

		
	
}
