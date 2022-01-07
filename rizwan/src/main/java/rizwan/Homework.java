package rizwan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys("Delta Airlines");
		
		Thread.sleep(10000);
		
		
		
		List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='pcTkSc']"));
	
        System.out.println(list.size());
        
        
        for(int i=0;i<list.size();i++) {
        	
        	String listitem=list.get(i).getText();
        	
        	System.out.println(listitem);
        	if(listitem.contains("Delta airlines")) {
        		
        		list.get(i).click();
        		break;
        	}
        	
        	Thread.sleep(2000);
        	
        	driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        	
        	driver.quit();
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
	
		
		
		
	
		
		

	}

}
