package mod1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_GooglePageNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\blessy.precilla\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	String at = driver.getTitle();
	String et = "Google";
	driver.close();
if(at.equalsIgnoreCase(et))
{
	System.out.println("Test Successfull");
}
else
{
	System.out.println("Test Failure");
}
	}

}
