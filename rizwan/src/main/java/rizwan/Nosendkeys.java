package rizwan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nosendkeys {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.org/clientarea.php");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("document.getElementById('inputEmail').value='myusername'");
		js.executeAsyncScript("document.getElementById('inputPassword').value='mypassword'");
	}

}
