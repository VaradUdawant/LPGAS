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

public class Trainings extends Base{

	
	
	@Given("admin click on the  Masters")
	public void admin_click_on_the_masters() throws Exception {
	
		WebElement master = driver.findElement(By.xpath("//span[normalize-space()='Masters']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", master);
		Thread.sleep(1000);
		
	}


	@When("select Trainings from dropdown list")
	public void select_trainings_from_dropdown_list() throws Exception {
	
		Thread.sleep(2000);
		action = new Actions(driver);
		 WebElement trainings = driver.findElement(By.xpath("//span[normalize-space()='Trainings']"));
		 action.moveToElement(trainings).click().perform();
		
	}

	@When("Click on add trainings")
	public void click_on_add_trainings() throws Exception {
	    WebElement Addtraining = driver.findElement(By.xpath("//button[normalize-space()='Add Training']"));
	    Addtraining.click();
	    Thread.sleep(2000);
		
	}

	@When("Enter Course Name {string} Venue {string} Seats Available {string}")
	public void enter_course_name_venue_seats_available(String CourseName, String Venue, String SeatsAvailable) {
	    //Course Name
		WebElement course = driver.findElement(By.xpath("//input[@name='RoleName']"));
		course.sendKeys(CourseName);
		
		// Venue
		WebElement venue = driver.findElement(By.xpath("//input[@formcontrolname='Venue']"));
		venue.sendKeys(Venue);
		
		
		// Seats available
		WebElement seats = driver.findElement(By.xpath("//input[@formcontrolname='SeatsAvailable']"));
		seats.sendKeys(SeatsAvailable);
		
	}

	@When("Select Account {string}")
	public void select_account(String Account) throws Exception {
		//Select User Role
		WebElement type1=driver.findElement(By.xpath("//select[@name='TrainingSageCode']"));
		Select element1 = new Select(type1);
		element1.selectByVisibleText(Account);
				
	}

		
		@When("Select Status and Time  StartDate {string} EndDate {string} StartTimeHH {string} StartTimeMM  EndTimeHH {string} EndTimeMM")
		public void select_status_and_time_start_date_end_date_start_time_hh_start_time_mm_end_time_hh_end_time_mm(String Startdate, String EndDate, String StartTimeHH, String EndTimeHH) throws Exception {
			
			//Status

			WebElement radio3 = driver.findElement(By.xpath("//body//p-dynamicdialog//div[@id='trainingdetails']//div//div//div[2]"));
			radio3.click();
			
			//StartDate
			WebElement startdate = driver.findElement(By.xpath("//input[@formcontrolname='startsAt']"));
			startdate.sendKeys(Startdate);
			
			//EndDate
			WebElement enddate = driver.findElement(By.xpath("//input[@formcontrolname='endsAt']"));
			enddate.sendKeys(EndDate);
			
		
			//StartTimeHH
			WebElement startHH = driver.findElement(By.xpath("//body[1]/p-dynamicdialog[1]/div[2]/div[2]/app-edit-training[1]/div[1]/form[1]/div[5]/div[2]/timepicker[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"));
			startHH.sendKeys(StartTimeHH);
			
			//StartTime MM
			WebElement start = driver.findElement(By.xpath("//body[1]/p-dynamicdialog[1]/div[2]/div[2]/app-edit-training[1]/div[1]/form[1]/div[5]/div[2]/timepicker[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]"));
			start.click();
			
			//EndTimeHH
			WebElement endHH = driver.findElement(By.xpath("//body[1]/p-dynamicdialog[1]/div[2]/div[2]/app-edit-training[1]/div[1]/form[1]/div[5]/div[4]/timepicker[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"));
			endHH.sendKeys(EndTimeHH);

			//ENdTimeMM
			WebElement end = driver.findElement(By.xpath("//body[1]/p-dynamicdialog[1]/div[2]/div[2]/app-edit-training[1]/div[1]/form[1]/div[5]/div[4]/timepicker[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]/span[1]"));
			end.click();

			
		}
		
		
	@Then("click on the save button")
	public void click_on_the_save_button() throws Exception {
	
		Thread.sleep(1000);
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		
	/*	 action = new Actions(driver);
		 WebElement trainings = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		 action.moveToElement(trainings).click().perform();
		

		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", save);
	*/	
		}
	
}



