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

public class AdminPermitApproval extends Base{

	@Given("Click on Grant Permits module")
	public void click_on_grant_permits_module() throws Exception {
		
		WebElement GrantPermit = driver.findElement(By.xpath("//span[normalize-space()='Grant Permits']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", GrantPermit);
		Thread.sleep(1000);	
		
	}

	@When("Click on the  appliances")
	public void click_on_the_appliances() throws Exception {
	    
		WebElement appliances = driver.findElement(By.xpath("//span[normalize-space()='Appliances']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliances);
		Thread.sleep(1000);	
		
	}

	

	@When("Click on the edit or view option")
	public void click_on_the_edit_or_view_option() throws Exception {
	 
		WebElement appliances = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliances);
		Thread.sleep(1000);	
		
		
	}

	@When("Click on Permit Approval button")
	public void click_on_permit_approval_button() throws Exception {
	    
		WebElement appliances = driver.findElement(By.xpath("//body//app-root//div//div//div[1]//div[1]//button[3]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", appliances);
		Thread.sleep(1000);	
		
	}

	
	@When("Write in the  comment box {string}")
	public void write_in_the_comment_box(String Comment) {
	 
	   	WebElement box = driver.findElement(By.xpath("//textarea[@formcontrolname='AcceptRejectComment']"));
		box.sendKeys(Comment);
	
	}

	@When("Drag the slider to number of years permit should be approved")
	public void drag_the_slider_to_number_of_years_permit_should_be_approved() throws Exception {
	
		WebElement e = driver.findElement(By.xpath("//p-dialog[@header='Approval Comments']//span[2]"));
		Actions move = new Actions(driver);
		move.moveToElement(e).clickAndHold().moveByOffset(125,0).release().perform();	
		Thread.sleep(2000);

	}

	@Then("Click on approve button")
	public void click_on_approve_button() throws Exception {

		/*
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
		Thread.sleep(1000);	
		*/
		
	}

	
}
