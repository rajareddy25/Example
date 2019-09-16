package apractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abhibus 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Mysuru");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Mangaluru");
		Thread.sleep(2000);
		
		
		//WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		//date.sendKeys("21092019");
		//date.sendKeys(Keys.ENTER);
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('datepicker1').setAttribute('value','20-09-2019')");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"roundTrip\"]/a")).click();
	}

}
