package cumcum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 extends BaseClass{
	
	public Pom1() {
		PageFactory.initElements(driver, this);
	
	}
	
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement login;

public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
public void getUser(String name, String pass) {
	 WebElement user = getUsername();
	  sendkey(user, name);
	  WebElement passy = getPassword();
	  sendkey(passy, pass);
	  WebElement log = getLogin();
	  btnclick(log);

}

}
