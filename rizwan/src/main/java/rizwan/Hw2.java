package rizwan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.delta.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS );
		
	       System.out.println(driver.getTitle());
		
		   System.out.println(driver.getCurrentUrl());
		
		// all the links start with anchor tag(<a) , hence "a"
		List<WebElement> b=driver.findElements(By.tagName("a"));
		
		
		
		int sizeb=b.size();
		
		System.out.println(sizeb);
		for (int i=1;i<sizeb;i++) {
			WebElement a= b.get(i);
			 String c= a.getText();
			 
			 System.out.println(c);
			
		}

	}

}
