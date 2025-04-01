package uicontrols.practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Waits {

	WebDriver driver;
	By locator = By.id("txt1");
	By locator2 = By.id("txt2");

	@Test
	public void waits() {

		driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		webdriverWait();
		FluentWait();
		driver.close();
	}

	public void webdriverWait() {
		driver.findElement(By.xpath("//button[.='Add Textbox1']")).click();

		new WebDriverWait(driver, Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(200))
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));

		Assert.assertTrue(driver.findElement(locator).isDisplayed());

		driver.findElement(locator).sendKeys("uma");
	}

	public void FluentWait() {
		driver.findElement(By.xpath("//button[.='Add Textbox2']")).click();

		new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(locator2));

		Assert.assertTrue(driver.findElement(locator2).isDisplayed());
		driver.findElement(locator2).sendKeys("sangada");

	}

}
