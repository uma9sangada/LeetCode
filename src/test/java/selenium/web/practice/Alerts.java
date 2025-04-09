package selenium.web.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		///promptBox(driver);
		//alertBox(driver);
		confirmBox(driver);
		driver.close();

	}

	public static void promptBox(WebDriver driver) {
		WebElement button = driver.findElement(By.id("promptBox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		driver.switchTo().alert().sendKeys("sekhar");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id='output']")).getText());

	}

	public static void alertBox(WebDriver driver) {
		WebElement button = driver.findElement(By.id("alertBox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id='output']")).getText());

	}

	public static void confirmBox(WebDriver driver) {
		WebElement button = driver.findElement(By.id("alertBox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		 String vsl=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id='output']")).getText());

	}

}
