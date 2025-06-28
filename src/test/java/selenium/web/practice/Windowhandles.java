package selenium.web.practice;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		//driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");//open multiple window and tabs
		https://www.hyrtutorials.com/p/window-handles-practice.html
		driver.manage().window().maximize();
		multipleWindowAndTab(driver);
		//multiplewindows(driver);
		driver.quit();
	}

	private static void multipleWindowAndTab(EdgeDriver driver) {
		WebElement element = driver.findElement(By.id("newTabsWindowsBtn"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
         System.out.println("Parent window handle :"+ driver.getWindowHandle());
		element.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		System.out.println(driver.getWindowHandles().size());
		List<String> handles= new ArrayList<>(driver.getWindowHandles());
		for (String handle : handles) {
			System.out.println(handle);
		}
		}

	private static void multiplewindows(EdgeDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Click Here")).click();
		driver.getWindowHandles().iterator().next();
		
		

		driver.switchTo().window(driver.getWindowHandles().iterator().next());
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println(driver.getWindowHandles().size());
		
		
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		for (String handle : windowHandles) {
			System.out.println(handle);
		}
		driver.switchTo().window(windowHandles.get(windowHandles.size() - 1));
		System.out.println(driver.getWindowHandle());

				Thread.sleep(3000);
				WebElement d=driver.findElement(By.xpath("(//span[.='Select Elements'])[2]"));
				System.out.println(d.getText());

				Actions a = new Actions(driver);
			
				a.moveToElement(d).click().build().perform();
				WebElement c=driver.findElement(By.xpath("//*[.='Draw a box with your cursor to select items. Hold down the Ctrl key to make multiple non-adjacent selections.']"));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.pollingEvery(Duration.ofMillis(200))
				.until(ExpectedConditions.visibilityOf(c));
				
				System.out.println(c.getText());
				//System.out.println(driver.findElement(By.xpath("(//iframe[contains(@class,'demo-frame')])[1]")));
				WebElement frame=driver.findElement(By.xpath("(//iframe[contains(@class,'demo-frame')])[1]"));
				  driver.switchTo().frame(frame);
				//System.out.println(driver.findElement(By.xpath("//*[.='Item 1']")).getText());
				List<WebElement> options= driver.findElements(By.xpath("//ol[@id='selectable']/li"));
				//System.out.println(options.);
				a.moveToElement(options.get(0)).keyDown(Keys.CONTROL).click(options.get(0)).click(options.get(1)).keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(3000);	

	}

}
