package uicontrols.practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleTabsorwindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
  // driver.switchTo().newWindow(WindowType.WINDOW)
		// driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String ParentWindowId = it.next();
		System.out.println(ParentWindowId);
		String ChildwindowId = it.next();

		driver.switchTo().window(ChildwindowId);// now the scope changes to child window

		driver.get("https://rahulshettyacademy.com");

		String text = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1)
				.getText();

		driver.switchTo().window(ParentWindowId);

		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys(text);

		// get screenshot of the web element and store in local

		File file = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"))
				.getScreenshotAs(OutputType.FILE);
		// download apache common io jar file so that it convert file object to physical
		// file
		FileUtils.copyFile(file, new File("Logo.png"));
		
		// get dimension of the webelement
		
		System.out.println(driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).getRect().getDimension().getHeight());
		System.out.println(driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).getRect().getDimension().getWidth());
	}
}
