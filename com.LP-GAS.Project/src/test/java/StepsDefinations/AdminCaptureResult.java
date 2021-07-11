package StepsDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminCaptureResult extends Base {

	@Given("Select the training module")
	public void select_the_training_module() throws Exception {
	 
		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='Training Enrolment']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);
	}

	@When("Select training details from dropdown")
	public void select_training_details_from_dropdown() throws Exception {
	   
		action = new Actions(driver);
		WebElement membershipApp = driver.findElement(By.xpath("//span[normalize-space()='Training Details List']"));
		action.moveToElement(membershipApp).click().build().perform();
		Thread.sleep(1000);	

	}

	@When("select edit button infront of appliction")
	public void select_edit_button_infront_of_appliction() throws Exception {
	    
		WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		
	}
	
	@When("Click on capture result button")
	public void click_on_capture_result_button() throws Exception {
		WebElement element = driver.findElement(By.xpath("//div//div//div//div[1]//div[2]//button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		
		
	}


	@When("Enter marks in Module1 {string} Automation Tool {string} Module A {string}")
	public void enter_marks_in_module1_automation_tool_module_a(String Module1, String AutomationTool, String ModuleA) {
	 //Module 1
		
		WebElement module1 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		module1.clear();
		module1.sendKeys(Module1);
		
	//Automation Toot	
		WebElement automation = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		automation.clear();
		automation.sendKeys(Module1);
		
		
	//Module A	
		
		WebElement moduleA = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		moduleA.clear();
		moduleA.sendKeys(ModuleA);
		
	}

	@Then("Genrate result")
	public void genrate_result() throws Exception {
			
		
		Thread.sleep(1000);
		WebElement genrate = driver.findElement(By.xpath("//button[normalize-space()='Generate Certificate']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", genrate);
				
	}

	
	@Then("click on ok button which comes on pop-up window")
	public void click_on_ok_button_which_comes_on_pop_up_window() throws Exception {

		Thread.sleep(1000);
		WebElement ModalClick = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	 	executor.executeScript("arguments[0].click();", ModalClick);
	 	
	 /*
		Alert alert = driver.switchTo().alert();
		alert.accept();
	*/	
	}

	@Then("click on Capture button to check result")
	public void click_on_capture_button_to_check_result() throws Exception {
		Thread.sleep(1000);
		WebElement genrate = driver.findElement(By.xpath("div//div//div//div[1]//div[2]//button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", genrate);
		
	}

	
	
}
