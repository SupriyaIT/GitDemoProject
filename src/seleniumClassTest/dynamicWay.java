package seleniumClassTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicWay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize();
		
		List<WebElement> g=d.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
        
		for(WebElement list:g)
		{
			if(list.getText().equals("FeMale"))
			{
				list.click();
			}
		}
	}

}
