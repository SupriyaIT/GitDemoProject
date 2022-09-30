package seleniumClassTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class switchtoAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		

        
        d.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert al=d.switchTo().alert();
        
        Thread.sleep(3000);
        al.accept();
        
        d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        Thread.sleep(3000);
        d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        Thread.sleep(3000);
        al.accept();
        
        d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        d.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        Thread.sleep(3000);
        al.sendKeys("Supriya");
        Thread.sleep(3000);
        al.accept(); 
	}
}
