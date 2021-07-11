package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminCompanyTrainingList extends Base{

	@Given("Click on Training Enrolment")
	public void click_on_training_enrolment() throws Exception {
		Thread.sleep(1000);
		WebElement enrolment = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", enrolment);
		
	}

	@When("Click on Training Details List")
	public void click_on_training_details_list() throws Exception {
		Thread.sleep(1000);
		WebElement trainingDetails = driver.findElement(By.xpath("//a[@href='#/home/trainingEnrolmentdetails']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",trainingDetails);
	
	}

	@When("Click on Export Excel button to list training details")
	public void click_on_export_excel_button_to_list_training_details() throws Exception {
		
		Thread.sleep(1000);
		WebElement excel = driver.findElement(By.xpath("//button[normalize-space()='Export Excel']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", excel);
		
	}

	@When("Click on Company Training List")
	public void click_on_company_training_list() throws Exception {
	    
		Thread.sleep(1000);
		WebElement CompanyTraining = driver.findElement(By.xpath("//button[normalize-space()='Company Training LIst']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",CompanyTraining);
	
	}

	@When("Click on Export Excel button for list Company Training")
	public void click_on_export_excel_button_for_list_company_training() throws Exception {
		
		Thread.sleep(1000);
		WebElement excel2 = driver.findElement(By.xpath("//button[normalize-space()='Export Excel']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", excel2);
	
	}

	@When("Click on Company Training Application button")
	public void click_on_company_training_application_button() throws Exception {
		Thread.sleep(1000);
		WebElement Application = driver.findElement(By.xpath("//button[normalize-space()='Company Training Application']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Application);
	
	}

	@When("Upload excel file {string}")
	public void upload_excel_file(String UploadExcel) throws Exception {
		Thread.sleep(1000);
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='file1']"));
		upload_file.sendKeys(UploadExcel);
	
		
	}

	@When("From drop down list select companty {string}")
	public void from_drop_down_list_select_companty(String company) throws Exception {
	    
		Thread.sleep(1000);
		WebElement type1=driver.findElement(By.xpath("//select[@name='ComapanyDetails']"));
		Select element1 = new Select(type1);
		element1.selectByVisibleText(company);
		
	}

	@When("Select any one Dietary Requirement by clicking on radio button")
	public void select_any_one_dietary_requirement_by_clicking_on_radio_button() throws Exception {
		
		Thread.sleep(1000);
		
		WebElement radio1 = driver.findElement(By.xpath("//p-radiobutton[@value='Kosher']//div//div//span"));
		radio1.click();
		
	}

	@When("From drop down list select  Course details {string}")
	public void from_drop_down_list_select_course_details(String course) throws Exception {
	    
		
		Thread.sleep(1000);
		WebElement type1=driver.findElement(By.xpath("//select[@name='TrainingList']"));
		Select element1 = new Select(type1);
		element1.selectByVisibleText(course);
		
		
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() throws Exception {
		
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);
	
	}

	
	
}
