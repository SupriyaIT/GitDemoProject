package seleniumClassTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().fullscreen();
		
		Actions ac=new Actions(d);
        WebElement img=d.findElement(By.id("imagesrc"));
      //  ac.click(img).build().perform();
      //  ac.contextClick().build().perform();
        
       // ac.moveToElement(img).click();
        WebElement w=d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
        ac.moveToElement(w).build().perform();
        WebElement drag=d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
        ac.moveToElement(drag).build().perform();
        
        WebElement statics=d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
        ac.moveToElement(statics).build().perform();
        ac.click(statics).build().perform();
//        WebElement dynamic=d.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
//        ac.click(dynamic).build().perform();
        d.manage().window().fullscreen();
        //d.navigate().refresh();
        
        WebElement src=d.findElement(By.id("angular"));
        WebElement dest=d.findElement(By.id("droparea"));
        
        ac.dragAndDrop(src, dest).build().perform();
        
        
//        String textTo = dest.getText();
//        if(textTo.equals("Dropped!")) {
//        System.out.println("PASS: File is dropped to target as expected");
//        }else {
//        System.out.println("FAIL: File couldn't be dropped to target as expected");
//        }
        d.close();
	}

}
