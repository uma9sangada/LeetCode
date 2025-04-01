package uicontrols.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	
	@Test
	public void action() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");//drag and drop
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");// remaininf all scroll
		//driver.get("file:///C:/Users/umasa/OneDrive/Documents/scroll.html");// scroll horizontal and vertical inside table
																		
		driver.manage().window().maximize();

		dragAndDrop(driver);
		driver.quit();
	}
	
	public void dragAndDrop(WebDriver driver) {
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		driver.switchTo().frame(0);
		Actions uiAction = new Actions(driver);
		WebElement x = driver.findElement(By.id("draggable"));
		WebElement y = driver.findElement(By.id("droppable"));
		uiAction.dragAndDrop(x, y).build().perform();
		driver.switchTo().defaultContent();
	}

}
