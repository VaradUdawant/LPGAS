package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLicenceReprint extends Base {

	@Given("Select the Licences Module")
	public void select_the_licences_module() throws Exception {
		
		WebElement licences = driver.findElement(By.xpath("//span[normalize-space()='Licences']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", licences);
		Thread.sleep(1000);
		
	}

	@When("Select Reprint list")
	public void select_reprint_list() throws Exception {
	 
		WebElement licenceslist = driver.findElement(By.xpath("//a[@href='#/home/LicenceReprintList']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", licenceslist);
		Thread.sleep(1000);
		
	}
	

	@When("Click on the Action option")
	public void click_on_the_action_option() throws Exception {
	 
		WebElement action = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", action);
		Thread.sleep(1000);
			
	}

	@When("Write in the comment {string}")
	public void write_in_the_comment(String Approve) throws Exception {
	 
		WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment.sendKeys(Approve);
		Thread.sleep(1000);
				
	}

	@Then("Click on the Approve button below")
	public void click_on_the_approve_button_below() throws Exception {
		
		WebElement approve1 = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve1);
		Thread.sleep(1000);
			
	}

	
	
}
