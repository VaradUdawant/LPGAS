package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantTrainingDetails extends Base{

	@Given("click on Training Enrolment")
	public void click_on_training_enrolment() throws Exception {
		action = new Actions(driver);
		WebElement TrainingDetails = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		action.moveToElement(TrainingDetails).click().build().perform();
		Thread.sleep(2000);
		
	}

	@When("select Training Details List from dropdown list")
	public void select_training_details_list_from_dropdown_list() throws InterruptedException {
		 Thread.sleep(1000);
		 action = new Actions(driver);
		 WebElement trainingdetails = driver.findElement(By.xpath("//span[normalize-space()='Training Details List']"));
		 action.moveToElement(trainingdetails).click().perform();
		
	}

	@When("click on new application")
	public void click_on_new_application() throws Exception {
	    
		WebElement newApp = driver.findElement(By.xpath("//button[normalize-space()='New Application']"));
		newApp.click();
		Thread.sleep(2000);
		
	}

	@When("select exam or non-exam options from radio buttons")
	public void select_exam_or_non_exam_options_from_radio_buttons() {
		WebElement radio1 = driver.findElement(By.xpath("//p-radiobutton[@name='TraningType']//div[@class='ui-radiobutton-box ui-widget ui-state-default']"));
		radio1.click();
	}

	@When("Enter Highest School Grade {string} Tertiary Qualifications {string}  Company Name {string} Contact Person {string} Telephone {string} Postal Address {string}")
	public void enter_highest_school_grade_tertiary_qualifications_company_name_contact_person_telephone_postal_address(String SchoolGrade, String Qualifications, String CompanyName, String ContactPerson, String Telephone, String PostalAddress) {
	    
		//Highest School Grade
		WebElement schoolgrade = driver.findElement(By.xpath("//input[@name='HighestSchoolGrade']"));
		schoolgrade.sendKeys(SchoolGrade);
		
		//Tertiary Qualifications
		WebElement qualifications = driver.findElement(By.xpath("//input[@name='TertiaryQualifications']"));
		qualifications.sendKeys(Qualifications);
		
		
		//Company Name
		WebElement companyname = driver.findElement(By.xpath("//input[@name='NameOfCompany']"));
		companyname.sendKeys(CompanyName);
		
		//Contact Person
		 WebElement contactperson = driver.findElement(By.xpath("//input[@name='ContactPerson']"));
		 contactperson.sendKeys(ContactPerson);
				
		//Telephone
		 WebElement telephone = driver.findElement(By.xpath("//input[@name='Telephone']"));
		 telephone.sendKeys(Telephone);
		 
		 //PostalAddress
		 WebElement postaladd = driver.findElement(By.xpath("//input[@name='PostalAddress']"));
		 postaladd.sendKeys(PostalAddress);
		 
		
		
	}

	@When("Select course details from dropdown {string}")
	public void select_course_details_from_dropdown(String coursedetails) throws Exception {
	 
		//WebElement course = driver.findElement(By.cssSelector(".form-control.ng-valid.ng-star-inserted.ng-dirty.ng-touched"));
		
		WebElement course = driver.findElement(By.name("TrainingList"));
		Select element1 = new Select(course);
		element1.selectByVisibleText(coursedetails);

	    
	  
	}
	
	@When("Click on logistic requirement check box if required")
	public void click_on_logistic_requirement_check_box_if_required() {
	  
		WebElement radio1 = driver.findElement(By.xpath("//div[contains(text(),'Only for candidates resident outside of Gauteng ci')]//div[2]"));
		radio1.click();
	}


	@When("Upload document {string} and click on terms and condition check box")
	public void upload_document_and_click_on_terms_and_condition_check_box(String choosefile) throws Exception {
	
	
	//Upload file
	WebElement upload_file = driver.findElement(By.id("file1"));
	upload_file.sendKeys(choosefile);
		
	//Accepting Declaration
			WebElement  checkbox = driver.findElement(By.xpath("//p-checkbox[@class='ng-untouched ng-pristine ng-invalid']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
			checkbox.click();
				
		//System.out.println("File uploaded successfully");
}
	

	@Then("click on submit button")
	public void click_on_submit_button() throws Exception {
	 
		
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		submit.click();
		Thread.sleep(2000);
		
		
		
	}

	
	
	
}
