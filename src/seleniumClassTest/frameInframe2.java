package seleniumClassTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameInframe2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Software Testing\\\\\\\\Automation Testing\\\\\\\\seleniumClassTest\\\\\\\\src\\\\\\\\seleniumClassTest\\\\\\\\utility\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//        driver.manage().window().minimize();
//        Thread.sleep(2000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        WebElement w=driver.findElement(By.xpath("/html/frameset/frame[1]"));
//        driver.switchTo().frame(w);
//        driver.findElement(By.name("mytext1")).sendKeys("Supriya");
//        Thread.sleep(2000);
//        
        WebElement w1=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
        driver.switchTo().frame(w1);
        driver.findElement(By.name("mytext3")).sendKeys("Jadhav");
        Thread.sleep(2000);
        
        WebElement w2=driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(w2);
        
      //  driver.findElement(By.name("Switch account")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div")).click();
        driver.findElement(By.className("Clear selection")).click();
       // driver.findElement(By.tagName("Sign in to Google")).click();
        //driver.close();
	}

}
