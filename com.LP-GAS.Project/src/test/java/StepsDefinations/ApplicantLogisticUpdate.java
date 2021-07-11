package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantLogisticUpdate extends Base{

	@Given("Select TrainingEnrolment module")
	public void select_training_enrolment_module() throws Exception {
		
		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
	
	  
	}

	@When("Select LogisticDetails list")
	public void select_logistic_details_list() throws Exception {
	
		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//span[normalize-space()='Logistic Details List']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
	
		
	}

	@When("Click on the view option if front of appication")
	public void click_on_the_view_option_if_front_of_appication() throws Exception {
		
		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//tbody/tr[3]/td[8]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
	
	}

	@When("Update the values Travelling from {string} Arrival Airport {string} Departure Airport {string}")
	public void update_the_values_travelling_from_arrival_airport_departure_airport(String Travelling, String Arrival, String Departure) throws Exception {
	 
		//Travelling From
		WebElement travelling = driver.findElement(By.xpath("//input[@placeholder='city']"));
		travelling.clear();
		travelling.sendKeys(Travelling);
		Thread.sleep(1000);
		
		//Arrival Airport
		WebElement arrival = driver.findElement(By.xpath("//input[@placeholder='Arrival Airport']"));
		arrival.clear();
		arrival.sendKeys(Arrival);
		Thread.sleep(1000);
		
		
		//Departure Airport
		WebElement departure = driver.findElement(By.xpath("//input[@placeholder='Departure Airport']"));
		departure.clear();
		departure.sendKeys(Departure);
		Thread.sleep(1000);
		
		
		
	}

	@Then("click on update button")
	public void click_on_update_button() throws Exception {
	
		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//button[normalize-space()='Update Logistic']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);
	
	}

	
	
	
}
