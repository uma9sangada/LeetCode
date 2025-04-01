package uicontrols.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class Scrolling {

	@Test
	public void scroll() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");// remaininf all scroll
		//driver.get("file:///C:/Users/umasa/OneDrive/Documents/scroll.html");// scroll horizontal and vertical inside table
																		
		driver.manage().window().maximize();

		scrollCompleteBottom(driver);
		scrollCompleteTop(driver);
		scrollHorizontal(driver);
		scrollVertical(driver);
//		scrollToElement(driver);
		// scrollhorizontalInsideElement(driver);
		// scrollVerticalInsideElement(driver);

		driver.quit();
	}

	public void scrollCompleteBottom(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
	}

	public void scrollCompleteTop(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
	}

	public void scrollHorizontal(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(2000,0)", "");
		Thread.sleep(2000);
		

	}

	public void scrollVertical(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
	}

	public void scrollToElement(WebDriver driver) {

		/*
		 * Example Scenario:
		 * 
		 * Imagine a long list of items.
		 * 
		 * If you want to ensure the first item in the list is always visible at the
		 * top, you would use scrollIntoView(true). If you want to ensure the last item
		 * in the list is always visible at the bottom, you would use
		 * scrollIntoView(false).
		 */
		WebElement mailtextbox = driver.findElement(By.id("email"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", mailtextbox);

		mailtextbox.sendKeys("uma@gmail.com");

	}

	public void scrollhorizontalInsideElement(WebDriver driver) throws InterruptedException {

		WebElement tableContainerId = driver.findElement(By.id("tableContainer"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = 5000;", tableContainerId);

		WebElement checkbox = driver.findElement(By.xpath("//tr/td[.='Tablet']/parent::tr/td/input"));
		Thread.sleep(2000);
		// new
		// WebDriverWait(driver,Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(checkbox));

		checkbox.click();

		boolean flag = checkbox.isSelected();
		Assert.assertTrue(flag, "The checkbox is not selected");

	}

	public void scrollVerticalInsideElement(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		int total = 0;
		WebElement tableContainerId = driver.findElement(By.id("tableContainer"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 5000;", tableContainerId);

		List<WebElement> quantity = driver.findElements(By.xpath("//tr/td[3]"));
		for (WebElement q : quantity) {
			total += Integer.parseInt(q.getText().trim());
		}
		Thread.sleep(2000);
		System.out.println(total);

	}

}
