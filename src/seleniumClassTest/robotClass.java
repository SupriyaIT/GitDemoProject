package seleniumClassTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotClass {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		String t1=d.getWindowHandle();
		System.out.println(t1);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);   //for Releasing the press effect on the key ,VK used to report Virtual key codes are used to report which keyboard key has been pressed
		
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Set<String> id=d.getWindowHandles();
		for(String s:id)
		{
			if(s.equals(t1))
			{
				System.out.println(s);
				
			}
			else
			{
				d.switchTo().window(s);
				d.get("https://www.amazon.in/");
				
				Thread.sleep(3000);
				 d.close();
			}
			
		}
		d.switchTo().window(t1);
		WebElement w=d.findElement(By.id("checkbox1"));
		w.click();
		
	}

}
