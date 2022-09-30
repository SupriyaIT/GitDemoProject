package seleniumClassTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectTask {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		WebElement year=d.findElement(By.id("yearbox"));
		Select s=new Select(year);
		s.selectByIndex(3);
		
        WebElement month=d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        Select s1=new Select(month);
        s1.selectByValue("August");
        
        WebElement day=d.findElement(By.id("daybox"));
        Select s2=new Select(day);
        s2.selectByVisibleText("3");
		
		List<WebElement> months=s1.getOptions();
		for(WebElement w:months)
		{
			System.out.println(w.getText());
		}
	}

}
