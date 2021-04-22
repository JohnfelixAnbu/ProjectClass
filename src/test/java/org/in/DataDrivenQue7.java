package org.in;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenQue7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\createxcel4.xlsx");
		
	
	//To create a new Sheet
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("Data");
	//To create row
	Row r = s.createRow(0);
	//To create cell
	Cell c=r.createCell(0);
	c.setCellValue("johnanbu@gmail.com");
	Cell c1=r.createCell(1);
	c1.setCellValue("Anbu");
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	Thread.sleep(6000);
	System.out.println("write done");
	Cell cell1 = r.getCell(0);
	String ss = cell1.getStringCellValue();
	Cell cell2 = r.getCell(1);
	String RR = cell2.getStringCellValue();
	
	
	System.setProperty("webdriver.chrome.driver","\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize(); 
	
	
	WebElement txtEmail=driver.findElement(By.id("email"));
	txtEmail.sendKeys(ss);
	driver.findElement(By.name("pass")).sendKeys(RR);

	WebElement btnlogin=driver.findElement(By.name("login"));
	btnlogin.click();
	Thread.sleep(9000);
	WebElement gettext=driver.findElement(By.xpath("//div[@class='_9ay7']"));
	String a=gettext.getText();
	System.out.println(a); 
	}

}
