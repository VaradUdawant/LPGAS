package StepsDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Base;
import io.cucumber.java.en.When;

public class ExamModule extends Base{

	@When("Select  Exams Modules from drop down list")
	public void select_exams_modules_from_drop_down_list() throws Exception {
		 Thread.sleep(2000);
		 action = new Actions(driver);
		 WebElement exammodule = driver.findElement(By.xpath("//span[normalize-space()='Exam Modules']"));
		 action.moveToElement(exammodule).click().perform();
		
	}

	@When("click on create exam button")
	public void click_on_create_exam_button() throws Exception {
		WebElement ExamModule = driver.findElement(By.xpath("//button[normalize-space()='Create Exam']"));
		ExamModule.click();
		Thread.sleep(2000);
	}

	@When("Enter Module Name {string} Description {string} Total Marks {string}")
	public void enter_module_name_description_total_marks(String ModuleName, String Description, String TotalMarks) {
		//Module Name
		WebElement modulename = driver.findElement(By.xpath("//input[@formcontrolname='ModuleName']"));
		modulename.sendKeys(ModuleName);
		
		//Description
		WebElement description = driver.findElement(By.xpath("//input[@formcontrolname='Description']"));
		description.sendKeys(Description);
		
		//Total marks
		WebElement totalmarks = driver.findElement(By.xpath("//input[@formcontrolname='TotalMarks']"));
		totalmarks.sendKeys(TotalMarks);
		

	}

	@When("Select status as active")
	public void select_status_as_active() {
	  
		WebElement radio1 = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));	
		radio1.click();
	}

	@When("click on create exam button1")
	public void click_on_create_exam_button1() throws Exception {
/*	
		action = new Actions(driver);
		WebElement CreateExam = driver.findElement(By.xpath("//button[@type='submit']"));
		action.moveToElement(CreateExam).click().build().perform();
		Thread.sleep(2000);
	*/	
		
	}

	@When("click on ok button and click on cross")
	public void click_on_ok_button_and_click_on_cross() throws Exception {
	 
		WebElement ModalClick=driver.findElement(By.xpath("//button[contains(.,'OK')]"));

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ModalClick);
	
		
		
		action = new Actions(driver);
		WebElement cross = driver.findElement(By.xpath("//span[@class='pi pi-times']"));
		action.moveToElement(cross).click().build().perform();
		Thread.sleep(1000);
		
		
	}

	
	
	
	@When("Edit to view or edit the exam module")
	public void edit_to_view_or_edit_the_exam_module() throws Exception {
		action = new Actions(driver);
		WebElement editexam = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]"));
		action.moveToElement(editexam).click().build().perform();
		Thread.sleep(2000);
		
	}

	
}
