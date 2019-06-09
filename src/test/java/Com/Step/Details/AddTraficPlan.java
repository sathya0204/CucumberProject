package Com.Step.Details;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTraficPlan {
		
		static WebDriver driver;
		
		@Given("The User is In ADD Trafic Plan")
		public void the_User_is_In_ADD_Trafic_Plan() {
			 System.setProperty("webdriver.gecko.driver", "E:\\Sathya\\SeleniumFirstDay\\CucumberProject\\Driver\\geckodriver.exe");
			   driver= new FirefoxDriver();
			   driver.get("http://demo.guru99.com/telecom/");
			   driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

		}

		@When("The User Enter Vaild Plan Details {string},{string},{string},{string},{string},{string},{string},")
		public void the_User_Enter_Vaild_Plan_Details(String MonthlyRE, String FreeLoM, String FreeIntM, String FreeSMSC, String LocalPerM, String InterMin, String SMSPer) {
		    driver.findElement(By.id("rental1")).sendKeys(MonthlyRE);
		    driver.findElement(By.id("local_minutes")).sendKeys(FreeLoM);
		    driver.findElement(By.id("inter_minutes")).sendKeys(FreeIntM);
		    driver.findElement(By.id("sms_pack")).sendKeys(FreeSMSC);
		    driver.findElement(By.id("minutes_charges")).sendKeys(LocalPerM);
		    driver.findElement(By.id("inter_charges")).sendKeys(InterMin);
		    driver.findElement(By.id("sms_charges")).sendKeys(SMSPer);
		    		}
		
		@When("The User Click The Submit Button")
		public void the_User_Click_The_Submit_Button() {
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		}

		@Then("The User Should See The Sucess Message")
		public void the_User_Should_See_The_Sucess_Message() {
		  Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
		  
		}


	}
