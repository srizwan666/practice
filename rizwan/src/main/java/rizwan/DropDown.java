package rizwan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement ddown=driver.findElement(By.xpath("//select[@id='carselect']"));
		
		Select s=new Select(ddown);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		
	    s.selectByValue("bmw");
	    Thread.sleep(2000);
		
		s.selectByVisibleText("Honda");

	}

}
