package uicontrols.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class HandlingFrames {

	Dropdown a;
	Checkbox_Radiobutton b;

	@Test
	public void frame() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		a = new Dropdown();
		b = new Checkbox_Radiobutton();
		// driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//single frame
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");// nested frames

		driver.manage().window().maximize();

		// signleframe(driver);
		nestedFrames(driver);
		driver.quit();
	}

	private void nestedFrames(WebDriver driver) throws InterruptedException {
		WebElement frame3 = driver.findElement(By.id("frm3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frame3);

		driver.switchTo().frame("frm3");

		WebElement frame2 = driver.findElement(By.id("frm2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frame2);

		driver.switchTo().frame(frame2);
		b.selectRadioButton(driver);

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frm3");
		WebElement frame1 = driver.findElement(By.id("frm1"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frame1);

		Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
		dropdown.selectByVisibleText("YouTube Courses");

		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

		Thread.sleep(2000);

	}

	public void signleframe(WebDriver driver) throws InterruptedException {
		WebElement frame = driver.findElement(By.id("courses-iframe"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frame);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		Thread.sleep(1000);
		String value = driver.findElement(By.xpath("(//ul/li/a[.='About us'])[1]")).getText();
		System.out.println(value);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

//		WebElement frame = driver.findElement(By.id("frm1"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",frame);
//		
//		driver.switchTo().frame("frm1");
//		
//		a.singleSelect(driver);
//		Thread.sleep(2000);
	}

}
