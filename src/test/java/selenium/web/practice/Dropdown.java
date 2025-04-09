package selenium.web.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void dropDowns() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");// singleSelect and MultiSelect	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//loopingDropdown and DynamicDropdown
		driver.manage().window().maximize();
		singleSelect(driver);
		multiSelect(driver);
		loopingDropdown(driver);
		DynamicDropdown(driver);
		driver.close();

	}

	

	private void DynamicDropdown(WebDriver driver) {
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		int i=1;
		while(i<4)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
	}



	public  void singleSelect(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//select[@id='course']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
		Select dropdown = new Select(element);
		List<WebElement> options = dropdown.getOptions();

		for (WebElement option : options) {
			System.out.println(option.getText());
		}

		// dropdown.selectByIndex(1);
		// System.out.println(dropdown.getFirstSelectedOption().getText());

		// dropdown.selectByValue("Python");
		// System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("Javascript");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

	public  void multiSelect(WebDriver driver) {
		// <select id="ide" multiple="true"> multiple attribute should be true

		WebElement element = driver.findElement(By.xpath("//select[@id='ide']"));
		Select dropdown = new Select(element);

		List<WebElement> options = dropdown.getOptions();

		for (WebElement option : options) {
			System.out.println(option.getText());
		}

		System.out.println(dropdown.isMultiple());
		if (dropdown.isMultiple()) {
			dropdown.selectByVisibleText("IntelliJ IDEA");
			dropdown.selectByVisibleText("NetBeans");
		}

		// using Actions class
		Actions uiAction = new Actions(driver);
		
	
		
		WebElement p = driver.findElement(By.xpath("//option[normalize-space(.)='IntelliJ IDEA']"));
		
		WebElement d = driver.findElement(By.xpath("//option[normalize-space(.)='NetBeans']"));
		
		uiAction.moveToElement(element).keyDown(Keys.CONTROL).click(p).click(d).keyUp(Keys.CONTROL).build().perform();

		List<WebElement> doptios = dropdown.getAllSelectedOptions();
		for (WebElement dop : doptios) {
			System.out.println(dop.getText());
		}

		// individual deSelect
		dropdown.deselectByVisibleText("NetBeans");

		// Multiple deSelect
		dropdown.deselectAll();

		// verify all are deSelected
		List<WebElement> ioptios = dropdown.getAllSelectedOptions();
		for (WebElement idop : ioptios) {
			System.out.println(idop.getText());
		}
	}
	
	
	
	public void loopingDropdown(WebDriver driver)  {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CCU']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CCU']")).click();
		}

}
