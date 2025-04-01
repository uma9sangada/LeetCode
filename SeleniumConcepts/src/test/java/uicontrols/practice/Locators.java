package uicontrols.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
	
	/*
	 * ID
	 * Name
	 * TagName
	 * ClassName
	 * LinkText
	 * PartialLinkText
	 * XPath
	 * CSS 
	 */
	
	WebDriver driver;
	public void xpathPractice(){
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		table();
		driver.quit();}
	
	
	
	public void table() {
		 /*ID
		  * Locates an element using its unique ID attribute. This is one of the fastest and most reliable locator types.
		  */
		 driver.findElement(By.id("name")).sendKeys("uma");
		
		/*Name
		 * Finds elements by their name attribute. This can be useful when multiple elements share the same name.
		 */
		driver.findElement(By.name("enter-name")).sendKeys("uma");
		
		
		/*ClassName
		 * Targets elements based on their class attribute. This is useful for selecting multiple elements that share a class.
		 */
		String value=driver.findElement(By.className("btn-style class1")).getText();
		System.out.println(value);
		
		
		
		/*TagName
		 * Locates elements by their tag name (e.g., input, button, div). This can be used to find all elements of a specific type.
		 */
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		
		
		
	}

}
