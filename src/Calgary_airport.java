import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calgary_airport {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yyc.com/");
	String d=driver.getCurrentUrl();
	System.out.println(d);
	String dd=driver.getTitle();
	System.out.println(dd);
	List<WebElement>o=driver.findElements(By.tagName("span"));
	System.out.println(o);
	driver.manage().window().maximize();
		WebElement t=driver.findElement(By.xpath("//a[.='Traveller Info']"));
		Thread.sleep(3000);
		t.click();
		driver.findElement(By.xpath("//a[.='Flight Information']")).click();
		
		WebElement s=driver.findElement(By.xpath("//a[.='Airline Information']"));
		s.click();
		
		
	}

}
