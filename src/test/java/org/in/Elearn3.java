package org.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Elearn3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\Book1a.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		//To get the particular row
		Row row = s.getRow(2);
		//To get the particular cell in a row
		Cell cell = row.getCell(1);
		String ss = cell.getStringCellValue();
		System.out.println(ss);
		//To Print  the PhysicalNumberOfRow
		int PhysicalNumberOfRows=s.getPhysicalNumberOfRows();
		System.out.println(PhysicalNumberOfRows);
		//To Print  the PhysicalNumberOfCell
		int PhysicalNumberOfCells=row.getPhysicalNumberOfCells();
		System.out.println(PhysicalNumberOfCells);
		//To Print  the particular row values
		for (int i = 0; i <PhysicalNumberOfCells ; i++) {
		Cell c=row.getCell(i);
			System.out.println(c);
			
		}
	//To print all the rows values
		for (int i = 0; i <PhysicalNumberOfRows ; i++) {
		Row r=s.getRow(i);
		for (int j = 0; j <PhysicalNumberOfCells ; j++) {
			Cell c1=r.getCell(j);
		
			System.out.println(c1);
	
	}}
}
}
