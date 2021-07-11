package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminMembership extends Base{
	
	
	@Given("clicks on Membership")
	public void clicks_on_membership() throws Exception {
	    

		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);	
		
	}

	@When("select membership application")
	public void select_membership_application() throws Exception {
		
		action = new Actions(driver);
		WebElement membershipApp = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		action.moveToElement(membershipApp).click().build().perform();
		Thread.sleep(1000);	
		
	}

	@When("Click on edit option")
	public void click_on_edit_option() throws Exception {
	    
		WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);
		
	}

	@When("Click on verify Document")
	public void click_on_verify_document() throws Exception {
	   
		WebElement verify = driver.findElement(By.xpath("//div[@class='content-wrapper']//div[1]//div[1]//button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", verify);
		Thread.sleep(1000);
		}

	@Then("Write Comment {string} and click on approve button")
	public void write_comment_and_click_on_approve_button(String Approve) throws Exception {
	 //Write Comment
		WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment.sendKeys(Approve);
		Thread.sleep(1000);
		
	//Click on Approve	
		
		Thread.sleep(1000);
		WebElement approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", approve);
	
		
	}


	
}
