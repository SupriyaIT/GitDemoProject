package seleniumClassTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		//d.findElement(By.tagName("input")).sendKeys("Supriya");
		
//WebElement w=d.findElement(By.className("checks"));
//		//w.clear();		
//		w.click();
		List<WebElement> element=d.findElements(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
        for(WebElement w:element)
        {
        	System.out.println(w.getText());
        	//System.out.println(w.getText());
        	//w.sendKeys("Supriya");
        	
        }
        try
        {
        	Thread.sleep(5000);
        }
        catch(Exception e)
        {
        	
        }
        //element.get(0).sendKeys("Supriya");
        
		
		// w.get(0).sendKeys("s");
		//int size=ls.size();
//		System.out.println(size);
		//ls.get(1).sendKeys("Supriya");
		//ls.get(1).sendKeys("Jadhav");
		//d.close();
	}

}
