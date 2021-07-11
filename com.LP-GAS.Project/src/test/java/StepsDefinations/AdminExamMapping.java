package StepsDefinations;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminExamMapping extends Base{

	@When("select Exam Module Mapping from drop down list")
	public void select_exam_module_mapping_from_drop_down_list() throws Exception {
		 Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement ExamModule  = driver.findElement(By.xpath("//span[normalize-space()='Exam Module Mapping']"));
		 action.moveToElement(ExamModule).click().perform();
		 }

	@When("Select trainings as {string}")
	public void select_trainings_as(String Training1) throws Exception {
			
		WebElement t = driver.findElement(By.xpath("//span[@class=\"ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down\"]"));
	     t.click();
	  List<WebElement> dp=  t.findElements(By.xpath("//span[@class=\"ng-star-inserted\"]"));
	 // System.out.println(dp.size());
	  for(int i=0;i<dp.size();i++) {
		 // System.out.println(dp.get(i).getText());
		 if(dp.get(i).getText().contains("Demo On 3rd March 2021")) {
			 dp.get(i).click();
			 System.out.println("element clicked");
			 break;
		 }
	  }
		
		
		Thread.sleep(1000);
		
	}

	@When("select exam modules form given options")
	public void select_exam_modules_form_given_options() {
    
	//WebElement checkbox1 = driver.findElement(By.xpath("//div[@layout='row']//div[1]//p-checkbox[1]//div[1]//div[2]"));
	//checkbox1.isSelected();
	//checkbox1.click();
	
//	WebElement checkbox2 = driver.findElement(By.xpath("//div[@class='row div_margin']//div[4]//p-checkbox[1]//div[1]//div[2]"));
//	checkbox2.click();
	
//	WebElement checkbox3 = driver.findElement(By.xpath("//div[8]//p-checkbox[1]//div[1]//div[2]"));
//	checkbox3.click();
	
	
		}
		
		
	

	@Then("click on save button below")
	public void click_on_save_button_below() throws Exception {
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		Thread.sleep(1000);
		
	}

	
}
