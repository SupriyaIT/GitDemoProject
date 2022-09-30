package seleniumClassTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToframe {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		d.switchTo().frame(0);
		d.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Supriya");
		Thread.sleep(3000);
		
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		

	}

}
