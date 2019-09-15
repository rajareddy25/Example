package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		Point p=new Point(50,50);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		Dimension d=new Dimension(70,30);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
	}

}
