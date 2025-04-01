package uicontrols.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		
		//driver.findelement(withTagName("label").above(webElement))//only supports tag name
//above of		
		WebElement one = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(one)).getText());
//below off
		WebElement two = driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).below(two)).click();
//left of
		WebElement three = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(three)).click();
//right of
		WebElement four = driver.findElement(By.id("inlineRadio1"));
		
		//driver.findElement(RelativeLocator.with(By.className("")).)		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(four)).getText());

	}

}
