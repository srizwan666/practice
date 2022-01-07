package rizwan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
	
		
	
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rizwan\\eclipse-workspace\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				WebElement click=driver.findElement(By.xpath(""));
				
				//right click 
				Actions action=new Actions(driver);
				action.contextClick(click).click();
				
				
				//drag n drop
				//the foolowing two lines to be used ,if there is an iframe , otherwise ignore
				WebElement frame=driver.findElement(By.className(""));
				driver.switchTo().frame(frame);
				
				WebElement drag = driver.findElement(By.id(""));
				WebElement drop = driver.findElement(By.id(""));
				
				action.dragAndDrop(drag, drop);

	}

}
