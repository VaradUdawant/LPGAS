package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MembersipPaymentApproval extends Base{

	@Given("Click on Membership module")
	public void click_on_membership_module() throws Exception {
	  
		WebElement Membership = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Membership);
		Thread.sleep(1000);
		
	}

	@When("Click on Membership Application Module")
	public void click_on_membership_application_module() throws Exception {
	    
		WebElement MembershipApplication = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", MembershipApplication);
		Thread.sleep(1000);
	
		
	}

	@When("Click on edit butoon in front of application")
	public void click_on_edit_butoon_in_front_of_application() throws Exception {
	    
		WebElement MembershipApplication = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", MembershipApplication);
		Thread.sleep(1000);

	}

	@When("Click on approve payment button")
	public void click_on_approve_payment_button() throws Exception {
	    
		WebElement MembershipApplication = driver.findElement(By.xpath("//body//app-root//div//div//div[1]//div[1]//button[2]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", MembershipApplication);
		Thread.sleep(1000);

	}

	@When("writte a comment in comment box {string}")
	public void writte_a_comment_in_comment_box(String validate) throws Exception {
	  
		WebElement comment1 = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment1.sendKeys(validate);
		Thread.sleep(1000);
		
	}

	@Then("Click on Approve Button")
	public void click_on_approve_button() throws Exception {
		
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
		Thread.sleep(1000);

	}
	
	
}
