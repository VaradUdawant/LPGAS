package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantLicence extends Base{

	
	@Given("Select Licence")
	public void select_licence() throws Exception {
	    
		WebElement licence = driver.findElement(By.xpath("//span[normalize-space()='Licences']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", licence);
		Thread.sleep(1000);	
	
	}

	@When("Select Apply Licence from drop down")
	public void select_apply_licence_from_drop_down() throws Exception {
	
		WebElement Applylicence = driver.findElement(By.xpath("//span[normalize-space()='Apply Licence']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Applylicence);
		Thread.sleep(1000);	
		
	}

	@When("Click on Request Reprint button")
	public void click_on_request_reprint_button() throws Exception {
		
		WebElement reprint = driver.findElement(By.xpath("//button[normalize-space()='Request Reprint']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", reprint);
		Thread.sleep(1000);	
		
	}

	@Then("Click on Yes I want to reprint licence button")
	public void click_on_yes_i_want_to_reprint_licence_button() throws Exception {
	  
		
		
		WebElement reprint1 = driver.findElement(By.xpath("//button[normalize-space()='Yes, I want to reprint Licence']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", reprint1);
		Thread.sleep(1000);	
	
	}

	
}
