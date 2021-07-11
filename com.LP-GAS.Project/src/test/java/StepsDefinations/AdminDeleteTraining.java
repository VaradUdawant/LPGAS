package StepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminDeleteTraining extends Base{

	
	@Given("clik on masters module")
	public void clik_on_masters_module() throws Exception {
	
		Thread.sleep(1000);
		WebElement master = driver.findElement(By.xpath("//span[normalize-space()='Masters']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", master);
		
	}

	@When("Click on Trainings module")
	public void click_on_trainings_module() throws Exception {
		
		Thread.sleep(1000);
		WebElement trainings = driver.findElement(By.xpath("//span[normalize-space()='Trainings']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", trainings);
		
		
	}

	@When("Search by Title {string}")
	public void search_by_title(String Title) throws Exception {
	    
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//th[1]//input[1]"));
		search.sendKeys(Title);
		
	}

	@When("click on delete option")
	public void click_on_delete_option() throws Exception {
	
		Thread.sleep(1000);
		WebElement delete = driver.findElement(By.xpath("//tbody/tr/td/span[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", delete);
	
	}

	@Then("Click on yes I want to delete")
	public void click_on_yes_i_want_to_delete() throws Exception {
		
		Thread.sleep(1000);
		WebElement delete = driver.findElement(By.xpath("//button[normalize-space()='Yes, delete it!']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", delete);
	
	}

	
}
