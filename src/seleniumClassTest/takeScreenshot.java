package seleniumClassTest;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {

	public static void main(String[] args) throws IOException, Exception
	{
	 System.setProperty("webdriver.chrome.driver","D:\\\\Software Testing\\\\Automation Testing\\\\seleniumClassTest\\\\src\\\\seleniumClassTest\\\\utility\\\\chromedriver_win32\\\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     String act_title=driver.getTitle();
     String exp_title="Amazon";
     
     System.out.println("Actual Title : "+act_title);
     System.out.println("Expected Title : "+exp_title);
     
     if(act_title.equals(exp_title))
     {
    	 System.out.println("Pass");
     }
     else
     {
    	 
         TakesScreenshot ts=(TakesScreenshot)driver;          //convert webdriver object to takescreenshot
         File srcfile=ts.getScreenshotAs(OutputType.FILE);  //call getScreenshotAs method to create image file
         File target=new File("C:\\Users\\SUPRIYA\\Desktop\\screenshot\\"+"Supriya.jpeg");  //move file to desired location
         Thread.sleep(3000);
     
         org.openqa.selenium.io.FileHandler.copy(srcfile, target);    //copy file at destination
         System.out.println("Test Case Fail");
     }
     
     }
}
