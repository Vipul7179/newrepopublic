package baselibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibrary
{
	@Test
	public void geturllaunch()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://develop-app.workeat.co.il/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class=\"dropdown\"]")).click();
		
		
		driver.findElement(By.xpath("//a[@class=\"dropdown-item\"][1]")).click();
		driver.findElement(By.xpath("//button[@class=\"accept-btn\"]")).click();
	WebElement element=	driver.findElement(By.xpath("(//input[@class=\"input-field\"])[1]"));
	element.sendKeys("3929327");
	element.clear();
//		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("9867565464");
//		driver.findElement(By.xpath("//button[@class=\"we-button active btn\"]")).click();	
//		driver.findElement(By.xpath("//button[@class=\"swal2-confirm swal2-styled\"]")).click();
//		driver.findElement(By.xpath("(//input[@class=\"input-field\"])[1]")).sendKeys("1900");
//		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("12345678");
//		driver.findElement(By.xpath("//button[@class=\"we-button active btn\"]")).click();	
	}

}
