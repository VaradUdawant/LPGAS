package StepsDefinations;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Users extends Base {

	@Given("admin click on Masters")
	public void admin_click_on_masters() throws Exception {
	  
		
		action = new Actions(driver);
		WebElement master = driver.findElement(By.xpath("//span[normalize-space()='Masters']"));
		action.moveToElement(master).click().build().perform();
		Thread.sleep(2000);
	}

	
	@When("Select Users from drop down list")
	public void select_users_from_drop_down_list() throws Exception {
	 Thread.sleep(2000);
	 action = new Actions(driver);
	 WebElement users = driver.findElement(By.xpath("//span[normalize-space()='Users']"));
	 action.moveToElement(users).click().perform();
	}
	
	
	@When("Click on create user button")
	public void click_on_create_user_button() throws Exception {
		WebElement CreateUser = driver.findElement(By.xpath("//button[normalize-space()='Create User']"));
		CreateUser.click();
		Thread.sleep(2000);
	}

	
	
	@When("Enter First Name {string} Last Name {string} E-mail {string} Cell No {string}  SA ID {string} Password {string}")
	public void enter_first_name_last_name_e_mail_cell_no_sa_id_password(String FirstName, String LastName, String Email, String CellNo, String SAID, String Password) throws Exception {
	  
	//First Name	
		WebElement fname = driver.findElement(By.xpath("//input[@formcontrolname='Firstname']"));
		fname.sendKeys(FirstName);
		Thread.sleep(1000);
		
	//Last Name
		WebElement lname = driver.findElement(By.xpath("//input[@formcontrolname='Lastname']"));
		lname.sendKeys(LastName);
		Thread.sleep(1000);
		
	//	Email
		WebElement email1 = driver.findElement(By.xpath("//input[@type='email']"));
		email1.sendKeys(Email);		
		
	//Cell Number
		WebElement cell = driver.findElement(By.xpath("//input[@name='CellNo']"));
		cell.sendKeys(CellNo);
		
	//	SA ID
		
		WebElement said1 = driver.findElement(By.xpath("//input[@formcontrolname='SocialId']"));
		said1.sendKeys(SAID);
		
		
	//Password
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys(Password);
		
		
	}
	
	
	@When("Select User Role {string}")
	public void select_user_role(String userrole) throws Exception {
	  //Select User Role
		WebElement user1 = driver.findElement(By.xpath("//select[@name='RolesList']"));
	    Select element1 = new Select(user1);
	    Thread.sleep(2000);
		
	}


	@When("Select Gender Status Birth Date as {string}")
	public void select_gender_status_birth_date_as(String BirthDate) {
	
		//Gender
		WebElement male = driver.findElement(By.xpath("//p-radiobutton[@value='M']//div//div//span"));
		male.click();
		//	WebElement radio2 = driver.findElement(By.xpath("//p-radiobutton[@value='F']//div[2]"));
		
		//Status
		WebElement radio3 = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		radio3.click();
	
		//Birth Date
		//WebElement birthdate = driver.findElement(By.xpath("//input[@formcontrolname='dob']"));
		//birthdate.sendKeys(BirthDate);
	
		driver.findElement(By.xpath("//button[@type='button']//i")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span[1]")).click();
		
		
		
	}
	
	@When("click on create user button")
	public void click_on_create_user_button1() throws Exception {
		
		
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);
		
		
	  	}
	
}
