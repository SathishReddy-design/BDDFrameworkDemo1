package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef
{
	WebDriver driver;
	
	@Before(order=1)
	public void init() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);
	}
	@Before(order=2)
	public void init1() 
	{
		System.out.println("I am in init1");
	}
	
	@When("User needs to enter {string} and {string}")
	public void user_needs_to_enter_and(String uname, String pwd) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("login")).sendKeys(uname);
		
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}
	
	@Then("User is  not able to view their GitHub Account")
	public void user_is_not_able_to_view_their_git_hub_account() {
	    System.out.println("User is not able to view the account");
	}

	@When("User need to click on Signin button")
	public void user_need_to_click_on_signin_button() throws InterruptedException
	{
		driver.findElement(By.name("commit")).click();
		Thread.sleep(1000);

	}
	@Then("User is able to view their GitHub Account")
	public void user_is_able_to_view_their_git_hub_account() 
	{
		System.out.println("User is in the github page");
		System.out.println("User is in the github page");
System.out.println("User is in the github page");
	
	}

	@After
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.quit();
	}
	@AfterStep
	public void stepAfter() 
	{
		System.out.println("After Step Demo");
	}
	
	

}
