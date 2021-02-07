package com.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cumcum.BaseClass;
import cumcum.Pom1;
import cumcum.Pom2;
import cumcum.Pom3;

public class StepDefini extends BaseClass{
	Pom1 p;
	Pom3 p1;
	Pom2 p2;
	@Given("User is on Adactin page")
	public void user_is_on_Adactin_page() {
	  launchBrowser();
	  getUrl("http://adactinhotelapp.com/");
	  windowMaximize();
	  Wait();
	  p=new Pom1();
	  
	  
	}

	@When("User Should enter {string} and {string}")
	public void user_Should_enter_and(String name, String pass) {
	  p.getUser(name, pass);
	  
	  
	}

	@When("Should click the login button")
	public void should_click_the_login_button() {
	    
	    p1=new Pom3();
	}

	@When("Select {string},{string},{string},{string}, {string}, {string}, {string}, {string}")
	public void select(String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    p1.secondMod(string1);
	    dropDown(loc, string1);
	    WebElement hotel = p1.getHotels();
	    dropDown(hotel, string2);
	    WebElement roomtype = p1.getRoom_type();
	    dropDown(roomtype, string3);
	    WebElement nroom = p1.getRoom_nos();
	    dropDown(nroom, string4);
	    WebElement chkin = p1.getDatepick_in();
	    dateEnter(chkin, string5);
	    WebElement chkout = p1.getDatepick_out();
	    dateEnter(chkout, string6);
	    WebElement aroom = p1.getAdult_room();
	    dropDown(aroom, string7);
	    WebElement croom = p1.getChild_room();
	    dropDown(croom, string8);
	  	    		  
	}

	@When("Click Search")
	public void click_Search() {
		 WebElement sear = p1.getSubmit();
		    btnclick(sear);
	}

	@When("Click on radio button")
	public void click_on_radio_button() {
	   WebElement radi = p1.getRadiobutton_0();
	   btnclick(radi);
	}

	@When("Click on Continue button")
	public void click_on_Continue_button() {
	   WebElement conti = p1.getContinue();
	   conti.click();
	   p2=new Pom2();
	   
	}

	@When("Provide{string}, {string}, {string}, {string}, Select {string}, {string}, {string}, provide {string}")
	public void provide_Select_provide(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    WebElement fname = p2.getFirst_name();
	    sendkey(fname, string);
	    WebElement LaName = p2.getLast_name();
	    sendkey(LaName, string2);
	    WebElement addr = p2.getAddress();
	    sendkey(addr, string3);
	    WebElement ccno = p2.getCc_num();
	    sendkey(ccno, string4);
	    WebElement cctype = p2.getCc_type();
	    dropDown(cctype, string5);
	    WebElement ccem = p2.getCc_exp_month();
	    dropDown(ccem, string6);
	    WebElement ccex = p2.getCc_exp_year();
	    dropDown(ccex, string7);
	    WebElement cvv = p2.getCc_cvv();
	    sendkey(cvv, string8);
	}

	@Then("Click Book Now button")
	public void click_Book_Now_button() {
	    WebElement book = p2.getBook_now();
	    btnclick(book);
	}



}
