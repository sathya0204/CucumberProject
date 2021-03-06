package Com.Step.Details;


import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {

	static WebDriver driver;
	
 @Given("The user is in Telecom Home Page")
	public void the_user_is_in_Telecom_Home_Page() {
	   System.setProperty("webdriver.gecko.driver", "E:\\Sathya\\SeleniumFirstDay\\CucumberProject\\Driver\\geckodriver.exe");
	   driver= new FirefoxDriver();
	   driver.get("http://demo.guru99.com/telecom/");
   
	}
//
//	@Given("The User Click on Add Customer")
//	public void the_User_Click_on_Add_Customer() {
//	    driver.findElement(By.xpath("(//a[text()='Add Customer'][1])")).click();
//	    
//	}
//
//	@When("The User Fill All Details")
//	public void the_User_Fill_All_Details() {
//	    driver.findElement(By.xpath("//label[@for='done']")).click();
//	    driver.findElement(By.id("fname")).sendKeys("Sathya");
//	    driver.findElement(By.id("lname")).sendKeys("Narayanan");
//	    driver.findElement(By.id("email")).sendKeys("Sathyanarayanan0204@gmail.com");
//	    driver.findElement(By.name("addr")).sendKeys("Madipakkam");
//	    driver.findElement(By.name("telephoneno")).sendKeys("7418480262");
//	}
//
//	@When("The Click a Submit Button")
//	public void the_Click_a_Submit_Button() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//	}
//
//	@Then("The User Get The ID Number")
//	public void the_User_Get_The_ID_Number() {
//	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
//}
// @Given("The User Click on Add Customer")
// public void the_User_Click_on_Add_Customer() {
//	 driver.findElement(By.xpath("(//a[text()='Add Customer'][1])")).click();
// }
//
// @When("The User Fill All Details")
// public void the_User_Fill_All_Details(DataTable CustomerDetails) {
//     List<String> CustomerDetailsList = CustomerDetails.asList(String.class);
//     System.out.println(CustomerDetailsList);
//     driver.findElement(By.xpath("//label[@for='done']")).click();
//	    driver.findElement(By.id("fname")).sendKeys(CustomerDetailsList.get(0));
//	    driver.findElement(By.id("lname")).sendKeys(CustomerDetailsList.get(1));
//	    driver.findElement(By.id("email")).sendKeys(CustomerDetailsList.get(2));
//	    driver.findElement(By.name("addr")).sendKeys(CustomerDetailsList.get(3));
//	    driver.findElement(By.name("telephoneno")).sendKeys(CustomerDetailsList.get(4));
// }
//
// @When("The Click a Submit Button")
// public void the_Click_a_Submit_Button() {
//	 driver.findElement(By.xpath("//input[@type='submit']")).click();
// }
//
// @Then("The User Get The ID Number")
// public void the_User_Get_The_ID_Number() {
//	  Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
// }
 @Given("The User Click on Add Customer")
 public void the_User_Click_on_Add_Customer() {
	 driver.findElement(By.xpath("(//a[text()='Add Customer'][1])")).click();
 }

 @When("The User Fill All Details")
 public void the_User_Fill_All_Details(DataTable CustomerDetails) {
	 Map<String,String> CustomerDetailsMap = CustomerDetails.asMap(String.class,String.class);
     System.out.println(CustomerDetailsMap);
     driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(CustomerDetailsMap.get("FirstName"));
	    driver.findElement(By.id("lname")).sendKeys(CustomerDetailsMap.get("LastName"));
        driver.findElement(By.id("email")).sendKeys(CustomerDetailsMap.get("EmailID"));
        driver.findElement(By.name("addr")).sendKeys(CustomerDetailsMap.get("Address"));
	    driver.findElement(By.name("telephoneno")).sendKeys(CustomerDetailsMap.get("Phon"));
     
 }

 @When("The Click a Submit Button")
 public void the_Click_a_Submit_Button() {
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 }

 @Then("The User Get The ID Number")
 public void the_User_Get_The_ID_Number() {
	 Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
 }


}

 