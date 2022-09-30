package seleniumClassTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelRead {

	
        //FileInputStream f = new FileInputStream("C:\\Users\\SUPRIYA\\Desktop\\test.xlsx");
		
        public static FileInputStream fis;
    	public static XSSFWorkbook wb;
    	public static XSSFSheet sheet;
    	public static String row;
    	public static XSSFCell cell;

    	public static void main(String[] args) throws IOException 
    	{

    		getCellData();
    	}

    	public static void getCellData() throws IOException
    	{
    		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\seleniumClassTest\\src\\seleniumClassTest\\utility\\chromedriver_win32\\chromedriver.exe");
    		WebDriver d=new ChromeDriver();
    		
    		d.get("https://demo.automationtesting.in/Register.html");
    		d.manage().window().maximize();
    		fis=new FileInputStream("C:\\Users\\SUPRIYA\\Desktop\\test.xlsx");
    		wb=new XSSFWorkbook(fis);
    		sheet=wb.getSheet("Demo");

    		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    		//Create a loop over all the rows of excel file to read it

    		for (int i = 0; i < rowCount+1; i++) {

    			Row row = sheet.getRow(i);

    			//Create a loop to print cell values in a row

    			for (int j = 0; j < row.getLastCellNum(); j++) {

    				//Print Excel data in console

    				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
    				d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
    			}

    			System.out.println();
    		}
    	}
    }