package org.in;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenQue5 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\createxcel2.xlsx");
		
	
	//To create a new Sheet
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("Data");
	//To create row
	Row r = s.createRow(0);
	//To create cell
	Cell c=r.createCell(0);
	c.setCellValue("john");
	Cell c1=r.createCell(1);
	c1.setCellValue("Anbu");
	
	Cell c2=r.createCell(2);
	c2.setCellValue("Anbu");
	
	Cell c3=r.createCell(3);
	c3.setCellValue("john Felix");
	Cell c4=r.createCell(4);
	c4.setCellValue("johnfelixi@gmail");
	
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	System.out.println("write done");
	}
}

	


