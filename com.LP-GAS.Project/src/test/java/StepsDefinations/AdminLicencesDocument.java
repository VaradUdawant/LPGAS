package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLicencesDocument extends Base{

	@Given("Select the Licences Module from list")
	public void select_the_licences_module_from_list() throws Exception {
	
		WebElement licences = driver.findElement(By.xpath("//span[normalize-space()='Licences']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", licences);
		Thread.sleep(1000);
		
	}

	@When("Select Licences list")
	public void select_licences_list() throws Exception {
	    
		WebElement licenceslist = driver.findElement(By.xpath("//span[normalize-space()='Licence List']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", licenceslist);
		Thread.sleep(1000);
		
	}

	@When("Click on the view option")
	public void click_on_the_view_option() throws Exception {
		WebElement edit = driver.findElement(By.xpath("//tbody/tr[3]/td[7]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit);
		Thread.sleep(1000);
		
	}

	@When("click on the verify Licences Document button")
	public void click_on_the_verify_licences_document_button() throws Exception {
		WebElement verify = driver.findElement(By.xpath("//body/app-root/block-ui/div/div/section/app-home/app-temp-licence-form/div[1]/div[1]/button[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",verify);
		Thread.sleep(1000);
	
		
	}

	@When("Write in the commentbox {string}")
	public void write_in_the_commentbox(String Valid) throws Exception {
	
	//Write Comment
		WebElement comment = driver.findElement(By.xpath("//textarea[@type='text']"));
		comment.sendKeys(Valid);
		Thread.sleep(1000);
		
		
	}

	@Then("Click on the Approve button")
	public void click_on_the_approve_button() throws Exception {
	    
		WebElement Approve = driver.findElement(By.xpath("//button[normalize-space()='Approve']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Approve);
		Thread.sleep(1000);
	}


}
