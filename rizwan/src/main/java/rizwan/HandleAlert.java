package rizwan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		
		//simple alert
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		
		Alert simpleAlert=driver.switchTo().alert();
		
	     System.out.println(simpleAlert.getText());
	     Thread.sleep(2000);
	     simpleAlert.accept();
	     Thread.sleep(2000);
	     driver.quit();
	     
		
		
		
		

	}

}
