package rizwan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		
		    WebDriver driver =new ChromeDriver();
		    driver.get("https://courses.letskodeit.com/practice");
		    driver.switchTo().frame("courses-iframe");
		    driver.quit();
		    
		  //  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/fieldset[1]"));

	}

}
