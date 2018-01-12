import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mozilla {

	
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fouzzz\\Desktop\\Work\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
				
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
			}
}
