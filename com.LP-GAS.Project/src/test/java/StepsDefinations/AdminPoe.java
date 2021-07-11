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

public class AdminPoe extends Base{

	
	@Given("Click on the POE module")
	public void click_on_the_poe_module() throws Exception {
		
		Thread.sleep(1000);
		WebElement poe = driver.findElement(By.xpath("//span[normalize-space()='POE']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", poe);
	}

	
	@When("Click on the POE List from drop down")
	public void click_on_the_poe_list_from_drop_down() throws Exception {
	
		Thread.sleep(1000);
		WebElement poelist = driver.findElement(By.xpath("//span[normalize-space()='POE List']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", poelist);
	}

	@When("Click on the edit option")
	public void click_on_the_edit_option() throws Exception {
		Thread.sleep(1000);
		WebElement edit1 = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", edit1);

	}

	@When("Select the Assign Accessor {string}")
	public void select_the_assign_accessor(String Accessor) {
	/*	WebElement type1=driver.findElement(By.xpath("//select[@id='acceessorList']"));
		Select element1 = new Select(type1);
		element1.selectByVisibleText(Accessor);
		
	*/}


	@Then("Click on the Assign  Accessor")
	public void click_on_the_assign_accessor() throws Exception {
		Thread.sleep(1000);
		WebElement assign = driver.findElement(By.xpath("//button[normalize-space()='Assign Assessor']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", assign);
	}

	
}
