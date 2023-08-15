package com.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef
{
	WebDriver driver;
	
	
	public void init() {
		System.setProperty("webDriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.getTitle();
		String tile=driver.getTitle();
	
	}
	@When("User needs to enter the following fields")
	public void user_needs_to_enter_the_following_fields(io.cucumber.datatable.DataTable dataTable)
	{
	   Map<String, String> map=dataTable.asMap(String.class, String.class);
	  
	   String firstName=map.get("FirstName");
	   String LastName=map.get("LastName");
	   String Address=map.get("Address");
	   String email=map.get("email");
	   String Phone=map.get("Phone");
	   
	   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
		 
		 driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']//textarea")).sendKeys(Address);
		 
		
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		
		 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(Phone);
		 
		}
	
	@When("User needs to select Gender")
	public void user_needs_to_select_gender(io.cucumber.datatable.DataTable dataTable) 
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		  
		String Gender=map.get("Gender");
		   
		List<WebElement> Genders=driver.findElements(By.xpath("//label//input[@type='radio']"));
		 for(int i=0;i<Genders.size();i++)
		 {
			
			 
			   
			if(Genders.get(i).getAttribute("value").equalsIgnoreCase(Gender))
			{	
				Genders.get(i).click();
				System.out.println("Hello Registration Page");
			
			break;
				
			}
		 }
	 
	}
	
	
	@When("User needs to select Hobbies")
	public void user_needs_to_select_hobbies(io.cucumber.datatable.DataTable dataTable) 
	{
			Map<String, String> map=dataTable.asMap(String.class, String.class);
			String Hobbies=map.get("Hobbies");
			
			List<WebElement> hobbies=driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(int i=0;i<hobbies.size();i++)
		 {
			
			if(hobbies.get(i).getAttribute("value").equalsIgnoreCase(Hobbies))
			{
				hobbies.get(i).click();
				
				break;
				
			}
		 }
	
	}
	
	
	
	@When("User needs to select Languages")
	public void user_needs_to_select_languages(io.cucumber.datatable.DataTable dataTable)
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		String Languages=map.get("Languages");
		   
		
		driver.findElement(By.xpath("//div[contains(@id,'msdd')]")).click();
		List<WebElement> langOptions=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
		
		for(int i=0;i<langOptions.size();i++)
		 {
			
			if(langOptions.get(i).getText().equalsIgnoreCase(Languages))
			{
				langOptions.get(i).click();
				
			}
		 }
	 
	}
	@When("User needs to select Skills")
	public void user_needs_to_select_skills(io.cucumber.datatable.DataTable dataTable) 
	{		
			Map<String, String> map=dataTable.asMap(String.class, String.class);
			String Skills=map.get("Skills");
		   
			WebElement skill= driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select s=new Select(skill);
		List<WebElement> skills=s.getOptions();
		
		for(int i=0;i<skills.size();i++)
		 {
			
			if(skills.get(i).getText().equalsIgnoreCase(Skills))
			{
				skills.get(i).click();
				
			}
		 }
		
	}
	@When("User needs to select Country")
	public void user_needs_to_select_country(io.cucumber.datatable.DataTable dataTable)
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		
		String Country=map.get("Country");
		   String SelectCountry=map.get("SelectCountry");
		   
		WebElement country= driver.findElement(By.xpath("//Select[@id='countries']"));
		
		Select s=new Select(country);
		s.selectByVisibleText(Country);
		
		WebElement selectcountry=driver.findElement(By.xpath("//Select[@id='country']"));
		Select s1=new Select(selectcountry);
		
		s1.selectByVisibleText(SelectCountry);
		
	
	}
	//String Password=map.get("Password");
	   //String ConfirmPassword=map.get("ConfirmPassword");
	   //String FileUpload=map.get("FileUpload");
	
	@When("User needs to select DOB")
	public void user_needs_to_select_dob(io.cucumber.datatable.DataTable dataTable) throws InterruptedException
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		  String yearr= map.get("Year");
		  String monthh=map.get("Monthh");
		  String dayy=map.get("Day");
		WebElement yeaar= driver.findElement(By.xpath("//select[@id='yearbox']"));
		
		Select s=new Select(yeaar);
		s.selectByValue(yearr);
		
		WebElement montth= driver.findElement(By.xpath("//select[@type='text' and @placeholder='Month']"));
		
		Select s1=new Select(montth);
		s1.selectByValue(monthh);
		
		WebElement daay= driver.findElement(By.xpath("//select[@type='text' and @id='daybox']"));
		
		Select s2=new Select(daay);
		s2.selectByValue(dayy);
		Thread.sleep(2000);

	}
	@When("User needs to select passwordandConfirmPassword")
	public void user_needs_to_select_passwordand_confirm_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		  String pwd= map.get("Password");
		  String pwd1=map.get("ConfirmPassword");
		
		WebElement pwd2= driver.findElement(By.xpath("//input[@id='firstpassword']"));
		 pwd2.sendKeys(pwd);
		 driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(pwd1);
		 Thread.sleep(2000);
	}
	@When("User needs to select FileUpload")
	public void user_needs_to_select_file_upload(io.cucumber.datatable.DataTable dataTable) 
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		  String fileUpload= map.get("FileUpload");
		
		WebElement file= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		file.sendKeys(fileUpload);
		
	}



	
	
	
	

	
	@When("User needs to click on submit button")
	public void user_needs_to_click_on_submit_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		 Thread.sleep(4000);
	
	}
	@Then("User gets succesful membership email")
	public void user_gets_succesful_membership_email()
	{
	    System.out.println("User Successfully got Membership email.");
	}
	
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
