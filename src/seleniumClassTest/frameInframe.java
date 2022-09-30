package seleniumClassTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameInframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Software Testing\\\\Automation Testing\\\\seleniumClassTest\\\\src\\\\seleniumClassTest\\\\utility\\\\chromedriver_win32\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
//	     driver.get("https://demo.automationtesting.in/Register.html");
//	     driver.manage().window().maximize();
//	     driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
//	     
 //	     Actions a=new Actions(driver);
//	     
//	     
//	     WebElement w=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
//	     a.moveToElement(w).click().build().perform();
//	     WebElement w1=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
//         a.moveToElement(w1).click().build().perform();
         driver.get("https://demo.automationtesting.in/Frames.html");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
         
         WebElement fr=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
         driver.switchTo().frame(fr);
         Thread.sleep(2000);
         //driver.switchTo().frame(1);
         WebElement fr1=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
         driver.switchTo().frame(fr1);
         Thread.sleep(2000);
//         
//         WebElement fr2=driver.findElement(By.xpath("/html/body/section/div/div"));
//         driver.switchTo().frame(fr2);
         
         WebElement w3=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
         w3.sendKeys("Supriya");
         Thread.sleep(2000);
         
         driver.switchTo().defaultContent();
         driver.switchTo().defaultContent().findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
	}

}
