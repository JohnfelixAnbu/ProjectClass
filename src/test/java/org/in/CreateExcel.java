package org.in;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\createxcel.xlsx");
		
	
	//To create a new Sheet
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("Data");
	//To create row
	Row r = s.createRow(0);
	//To create cell
	Cell c=r.createCell(0);
	c.setCellValue("john");
	FileOutputStream o=new FileOutputStream(f);
	w.write(o);
	
	
	}
}


