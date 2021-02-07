package cumcum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	 public static WebDriver driver;

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
		
	}

	public void getUrl(String Url) {
		driver.get(Url);

	}

	public void windowMaximize() {
		driver.manage().window().maximize();
	}

	public void Wait() {
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	}

	public void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void btnclick(WebElement element) {
		element.click();
	}

	public void dropDown(WebElement element, String visibleText) {
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);

	}

	public void dateEnter(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}
	
public void getText(WebElement element) {
	String t = element.getAttribute("value");
	System.out.println("Order id is:"+ t);
	

}
}
