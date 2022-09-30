package seleniumClassTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.name("SingleFrame")).click();
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Testing");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(15));
		w.until(ExpectedConditions.urlContains("dem00o."));
		
		

	}

}
