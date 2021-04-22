package org.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver2Que {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\Studentdetails1.xlsx");
		
	FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		
			
	
	//To print all the rows values
		for (int i = 0; i <s.getPhysicalNumberOfRows() ; i++) {
		Row r=s.getRow(i);
		for (int j = 0; j <r.getPhysicalNumberOfCells() ; j++) {
			Cell c1=r.getCell(j);
		
			System.out.println(c1);
	
	}}
}}
