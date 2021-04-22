package org.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver1Que {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\Studentdetails1.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		//To get the particular cell in a row
		Cell cell = r.getCell(0);
	
		int PhysicalNumberOfRows=s.getPhysicalNumberOfRows();
		System.out.println(PhysicalNumberOfRows);
		
		//To Print  the PhysicalNumberOfCell
		for (int i = 0; i <PhysicalNumberOfRows ; i++) {
			int PhysicalNumberOfCells=r.getPhysicalNumberOfCells();
			System.out.println(PhysicalNumberOfCells);
		}
		
	

	
	
	}
}
