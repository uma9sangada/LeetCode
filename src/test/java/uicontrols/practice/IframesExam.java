package uicontrols.practice;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframesExam {

	WebDriver driver;

	@FindBy(xpath = "//input[contains(@name,'mytext')]")
	List<WebElement> frameTextBox;

	@FindBy(linkText = "https://a9t9.com")
	WebElement frameLink;
	
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement dropdown;
	
	
	@FindBy(xpath = "(//div[contains(@class,'AB7Lab')])[2]")
	WebElement radiobutton;
	
	
	@FindBy(xpath = "(//div[contains(@class,'uHMk6b')])[3]")
	WebElement checkbox;
	
	
	

	By logo = By.xpath("(//*[contains(@class,'responsive-img')])[1]");

	@FindBy(xpath = "//frame")
	List<WebElement> frames;

	@BeforeTest
	public void testFrames() {
		driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}

	@AfterTest
	void closeBrowser() {
		driver.quit();
	}

	@Test(enabled = false)
	void frame1() {
		driver.switchTo().frame(frames.get(0));
		frameTextBox.get(0).sendKeys("uma");
		driver.switchTo().defaultContent();
	}

	@Test(enabled = false)
	void frame2() {
		driver.switchTo().frame(frames.get(1));
		frameTextBox.get(1).sendKeys("uma");
		driver.switchTo().defaultContent();
	}

	@Test(enabled = false)
	void frame4() {
		driver.switchTo().frame(frames.get(3));
		frameTextBox.get(3).sendKeys("uma");
		driver.switchTo().defaultContent();
	}

	@Test(enabled = false)
	void frame5() {
		driver.switchTo().frame(frames.get(4));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", frameTextBox.get(0));
		frameTextBox.get(0).sendKeys("uma");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", frameLink);
		frameLink.click();

		new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(logo));

		Assert.assertTrue(driver.findElement(logo).isDisplayed());

		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
	}
	
	
	@Test(enabled = true)
	void frame3() {
		driver.switchTo().frame(frames.get(2));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", frameTextBox.get(0));
		frameTextBox.get(0).sendKeys("uma");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", radiobutton);
		radiobutton.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", checkbox);
		checkbox.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", dropdown);
		dropdown.click();
		driver.findElement(By.xpath("(//*[.='Yes'])[4]")).click();
		
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
	}

}
