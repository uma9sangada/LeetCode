package selenium.web.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkbox_Radiobutton {

	@Test 
	public void checkboxRadio() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		selectCheckBox(driver,js);
		selectRadioButton(driver);
		driver.close();

	}

	public void selectRadioButton(WebDriver driver) throws InterruptedException {
		WebElement radio= driver.findElement(By.id("malerb"));
		WebElement radio2=driver.findElement(By.xpath("//input[@id='femalerb']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",radio);
		Assert.assertTrue(radio.isSelected());
		Assert.assertFalse(radio2.isSelected());
		radio2.click();
		Assert.assertTrue(radio2.isSelected());

	}

	public  void selectCheckBox(WebDriver driver,JavascriptExecutor js) {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
		WebElement chinese = driver.findElement(By.id("chinesechbx"));
		js.executeScript("arguments[0].scrollIntoView(true);", checkboxes.get(2));
		
		System.out.println(checkboxes.size());
		Assert.assertEquals(checkboxes.size(), 6);
		Assert.assertFalse(checkboxes.get(2).isSelected());
		chinese.click();
		Assert.assertTrue(checkboxes.get(2).isSelected());

	}

}
