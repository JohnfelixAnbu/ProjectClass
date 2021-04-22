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

public class DataDrivenQue11 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\createxcel5.xlsx");
		
	
	//To create a new Sheet
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("Data");
	//To create row
	Row r = s.createRow(0);
	//To create cell
	Cell c=r.createCell(0);
	c.setCellValue("Anbarasi");
	Cell c1=r.createCell(1);
	c1.setCellValue("Anbarasi@john.com");
	Cell c2=r.createCell(2);
	c2.setCellValue("Love14845");
	Cell c3=r.createCell(3);
	c3.setCellValue("123456789");
	Cell c4=r.createCell(4);
	c4.setCellValue("vellore");
	Cell c5=r.createCell(5);
	c5.setCellValue("Tamil nadu");

	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	Thread.sleep(6000);
	System.out.println("write done");
	Cell cell1 = r.getCell(0);
	String ss = cell1.getStringCellValue();
	Cell cell2 = r.getCell(1);
	String RR = cell2.getStringCellValue();
	Cell cell3 = r.getCell(2);
	String tt = cell3.getStringCellValue();
	Cell cell4 = r.getCell(3);
	String vv = cell2.getStringCellValue();
	Cell cell5 = r.getCell(4);
	String ww = cell5.getStringCellValue();
	Cell cell6 = r.getCell(5);
	String ZZ = cell6.getStringCellValue();

	
	System.setProperty("webdriver.chrome.driver","\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://my.naukri.com/account/register/basicdetails");
	driver.manage().window().maximize(); 
	WebElement button=driver.findElement(By.xpath("//button[@type='button'][1]"));
	button.click();
	Thread.sleep(5000);
	WebElement text1=driver.findElement(By.name("fname"));
	text1.sendKeys(ss);
	WebElement text2=driver.findElement(By.name("email"));
	text2.sendKeys(RR);
	WebElement text3=driver.findElement(By.name("password"));
	text3.sendKeys(tt);
	WebElement text4=driver.findElement(By.name("number"));
	text4.sendKeys(vv);
	WebElement text5=driver.findElement(By.xpath("//input[@placeholder='Tell us about your current city']"));
	text5.sendKeys(ww);
	WebElement text6=driver.findElement(By.name("state"));
	text6.sendKeys(ZZ);
	
	WebElement text7=driver.findElement(By.name("basicDetailSubmit"));
	text7.click();
	
}
}