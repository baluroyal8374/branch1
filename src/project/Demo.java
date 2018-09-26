package project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo {		
		
			
			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver","./Soft/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.naukri.com/");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[.='Login']")).click();
				//*Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poosalabalaji6@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.id("pLogin")).sendKeys("myindia8374");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button [@value='Login' ]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[.='UPDATE PROFILE']")).click();
				Thread.sleep(3000);
				JavascriptExecutor j=(JavascriptExecutor) driver;
				for(int i=0;i<3;i++)
				{
					j.executeScript("window.scrollBy(0,100)");
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[.='Update']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("E:\\resume\\balu.docx");
				for(int i=0;i<3;i++)
				{
					j.executeScript("window.scrollBy(0,500)");
				}
			
				
				
				WebElement ele=driver.findElement(By.xpath("//div[.='My Naukri']"));
				Actions act=new Actions(driver);
				act.moveToElement(ele).perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@title='Logout']")).click();

				//driver.quit();
				//driver.findElement(By.xpath("//div[.='My Naukri']")).click();
				
			}

		


	}

