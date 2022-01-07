package rizwan;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args)  {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		String parentHandle=driver.getWindowHandle();
		
		System.out.println("parent window - "+ parentHandle);
		
	
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	    
		Set<String>	Handles=driver.getWindowHandles();
	    
	    for (String handle : Handles) {
	    	
	    	System.out.println(handle);
	    	
	    	
	    	if(!handle.equals(parentHandle)) {
	    		driver.switchTo().window(handle);
	    		
	    		driver.findElement(By.id("firstName")).sendKeys("rizwan");
	    		
	    		
	    		driver.close();
		}
	    	
	    	driver.switchTo().window(parentHandle);
	    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hammerbliss");

	}

}
	}
