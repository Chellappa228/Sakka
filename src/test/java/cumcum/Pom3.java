package cumcum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 extends BaseClass{
public Pom3() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotels;

@FindBy(id="room_type")
private WebElement room_type;

@FindBy(id="room_nos")
private WebElement room_nos;

@FindBy (id="datepick_in")
private WebElement datepick_in;

@FindBy (id="datepick_out")
private WebElement datepick_out;

@FindBy(id="adult_room")
private WebElement adult_room;

@FindBy(id="child_room")
private WebElement child_room;

@FindBy(id="Submit")
private WebElement Submit;

@FindBy(id="radiobutton_0")
private WebElement radiobutton_0;

@FindBy(id="continue")
private WebElement continu;


public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom_type() {
	return room_type;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public WebElement getDatepick_in() {
	return datepick_in;
}

public WebElement getDatepick_out() {
	return datepick_out;
}

public WebElement getAdult_room() {
	return adult_room;
}

public WebElement getChild_room() {
	return child_room;
}

public WebElement getSubmit() {
	return Submit;
}

public WebElement getRadiobutton_0() {
	return radiobutton_0;
}

public WebElement getContinue() {
	return continu;
}

public void secondMod(String value, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
	
	dropDown(getLocation(),value);
	dropDown(getHotels(), value2);
	dropDown(getRoom_type(),value3);
	dropDown(getRoom_nos(), value4);
	sendkey(getDatepick_in(), value5);
	sendkey(getDatepick_out(), value6);
	dropDown(getAdult_room(), value7);
	dropDown(getChild_room(), value8);
	btnclick(getSubmit());
	btnclick(getRadiobutton_0());
    btnclick(getContinue());
    
}


}
