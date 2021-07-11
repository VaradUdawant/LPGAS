package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantMembershipUpdate extends Base {

	@Given("click on membership module")
	public void click_on_membership_module() throws Exception {
		Thread.sleep(1000);

		action = new Actions(driver);
		WebElement membership = driver.findElement(By.xpath("//span[normalize-space()='Membership']"));
		action.moveToElement(membership).click().build().perform();
		Thread.sleep(1000);

		
	}

	@When("select membership application from the dropdown")
	public void select_membership_application_from_the_dropdown() throws Exception {
		 Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement users = driver.findElement(By.xpath("//span[normalize-space()='Membership Application']"));
		 action.moveToElement(users).click().perform();  
		
	}
	
	
	@When("Click on edit\\/view button")
	public void click_on_edit_view_button() throws Exception {
		Thread.sleep(1000);
		
		WebElement edit = driver.findElement(By.xpath("//tbody/tr[1]/td[10]/input[1]"));
		edit.click();
	}

		

	@When("change postal address {string}")
	public void change_postal_address(String PostalAddress) throws Exception {
		Thread.sleep(1000);
		WebElement address = driver.findElement(By.xpath("//input[@formcontrolname='Address']"));
		address.clear();
		address.sendKeys(PostalAddress);

	}

	@Then("click on update membership")
	public void click_on_update_membership() throws Exception {
		
		WebElement update = driver.findElement(By.xpath("//button[normalize-space()='Update Membership']"));
		update.click();
		Thread.sleep(1000);

		
	}

	
	
}
