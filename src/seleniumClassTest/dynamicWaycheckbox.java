package seleniumClassTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicWaycheckbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
	   // List<WebElement> check=d.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[1]"));
        
		
	}

}
