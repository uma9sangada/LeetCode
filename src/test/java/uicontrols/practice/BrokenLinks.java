package uicontrols.practice;

import java.net.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class BrokenLinks {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		verifyBrokenLinks(driver);
		driver.quit();
	}

	private static void verifyBrokenLinks(EdgeDriver driver) {
		try {
			
			System.out.println("Total links in page: "+ driver.findElements(By.tagName("a")).size());
			
			
			WebElement linkSection = driver.findElement(By.xpath("//table[@class='gf-t']"));
			List<WebElement> Links = linkSection.findElements(By.xpath("//table[@class='gf-t']//li/a"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkSection);
			
			System.out.println("Total links in section: "+ Links.size());
			
//			
//			for(WebElement link : Links)
//			{
//			new Actions(driver).moveToElement(link).keyDown(Keys.CONTROL).click().build().perform();
//			}
//			
//			while(driver.getWindowHandles().iterator().hasNext())
//			{
//			  driver.switchTo().window(driver.getWindowHandles().iterator().next());
//			   System.out.println(driver.getTitle());
//			}

			for (WebElement Link : Links) {
				URI uri = new URI(Link.getAttribute("href"));
				HttpURLConnection httpConn = (HttpURLConnection) uri.toURL().openConnection();
				httpConn.connect();
				int code = httpConn.getResponseCode();
				if (code >= 400) {
					System.out.println("Broken Link: " + Link.getAttribute("href"));
				} else {
					System.out.println("Valid Link: " + Link.getAttribute("href"));
				}
			}

			System.out.println();
			System.out.println("All Links Checked");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
