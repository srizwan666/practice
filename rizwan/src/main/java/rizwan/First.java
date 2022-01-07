package rizwan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://courses.letskodeit.com/practice";
	   
		driver.get(url);
		//System.out.println(driver.getTitle());

		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hpow@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("args");
		
		//radio button
		
		driver.findElement(By.xpath("//input[@id='benzradio']")).click();
		
		
		
		
	
	
	
	
	
	}

}
