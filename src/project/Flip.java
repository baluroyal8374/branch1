package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input [@type='text'])[2]")).sendKeys("poosalabalaji6@gmail.com");
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("myindia9176");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.xpath("(//div[.='Poosala'])[3]"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(d);
		

	}

}
