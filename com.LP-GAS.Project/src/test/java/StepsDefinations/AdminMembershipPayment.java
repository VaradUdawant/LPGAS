package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminMembershipPayment extends Base{

	@Given("Select on the membership module")
	public void select_on_the_membership_module() throws Exception {
		
		
		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);	
		
		
	}

	@When("Select membership Applicetion")
	public void select_membership_applicetion() throws Exception {
	    
		action = new Actions(driver);
		WebElement membershipApp = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		action.moveToElement(membershipApp).click().build().perform();
		Thread.sleep(1000);	
		
		
	}

	@When("Click on the edit or view button")
	public void click_on_the_edit_or_view_button() throws Exception {
		WebElement element = driver.findElement(By.xpath("//tbody/tr[3]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		
		
	}

	@When("Click on the approve payment")
	public void click_on_the_approve_payment() throws Exception {
	    
		WebElement verify = driver.findElement(By.xpath("//body//app-root//div//div//div[1]//div[1]//button[2]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", verify);
		Thread.sleep(1000);
		
		
	}

	@When("Write a comment {string}")
	public void write_a_comment(String Payment) throws Exception {
	
		WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment.sendKeys(Payment);
		Thread.sleep(1000);
		
	}

	@Then("click on the approve button")
	public void click_on_the_approve_button() throws Exception {
	
		Thread.sleep(1000);
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
		
	}
	
	
}
