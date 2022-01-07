package rizwan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadiobutton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for (int i=0;i<radio.size();i++) {
			
			WebElement local_radio = radio.get(i);
			
			String value=local_radio.getAttribute("value");
			
			System.out.println("values from radio button -------->"+value);
			
			if(value.equalsIgnoreCase("c#")) {
				local_radio.click();
			}
			
		}

	}

}
