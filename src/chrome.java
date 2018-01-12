import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class chrome {

	public static void main(String []args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Fouzzz\\Desktop\\Work\\Selenium\\chromedriver_win32\\chromedriver.exe");

ChromeOptions options = new ChromeOptions();
options.addArguments("disable-infobars");

		
WebDriver driver = new ChromeDriver(options);
driver.get("http://www.google.com");
	}
	
	
}



