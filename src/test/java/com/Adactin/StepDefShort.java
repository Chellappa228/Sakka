package com.Adactin;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cumcum.BaseClass;
import cumcum.Pom1;
import cumcum.Pom2;
import cumcum.Pom3;

public class StepDefShort{
	Pom1 p1;
	Pom2 p3;
	Pom3 p2;
	@Given("Adacting Page")
	public void adacting_Page() throws InterruptedException {
	  launchBrowser();
	  getUrl("http://adactinhotelapp.com/");
	  windowMaximize();
      Wait();
	  p1=new Pom1();
	}

	@When("Login with Credentials {string} {string} {string}")
	public void login_with_Credentials(String string, String string2, String string3) {
	
	   p1.getUser(string, string2);
	   
	   p2=new Pom3();
	   
	}

	@When("Searching Hotel {string},{string},{string},{string}, {string}, {string}, {string},{string}")
	public void searching_Hotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   p2.secondMod(string, string2, string3, string4, string5, string6, string7, string8);
	   p3=new Pom2();
	}

	@Then("Provide{string},{string}, {string}, {string},{string}, {string}, {string}, {string}")
	public void provide(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   p3.thirdMod(string, string2, string3, string4, string5, string6, string7, string8);
	}
}
