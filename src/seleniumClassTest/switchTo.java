package seleniumClassTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://omayo.blogspot.com/2013/05/page-one.html");
		d.manage().window().maximize();
		
		WebElement alrt=d.findElement(By.id("alert1"));
		alrt.click();
		
		Thread.sleep(30000);
		
		Alert a=d.switchTo().alert();
		a.accept();

	}

}
