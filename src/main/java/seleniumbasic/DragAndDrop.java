package seleniumbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		DragDrop();
	}
		public static void DragDrop() throws InterruptedException{
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			driver.get("https://jqueryui.com/droppable/");
			List<WebElement> frames =driver.findElements(By.tagName("iframe"));
			System.out.println(frames.size()); 	
//			Actions actions = new Actions(driver); 
			
			WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);
			Actions actions = new Actions(driver); 
			WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
			actions.dragAndDrop(source, target).build().perform();
			Thread.sleep(5000);
			driver.switchTo().parentFrame();
			driver.quit();
		}
		

	}


