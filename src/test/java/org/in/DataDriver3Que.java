package org.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver3Que {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Elearn3\\Import\\Studentdetails1.xlsx");
		
	FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.createRow(11);
		Cell c=r.createCell(0);
		Cell c1=r.createCell(1);
		c.setCellValue("Chlm");
        c1.setCellValue("Nurse");
		FileOutputStream o=new FileOutputStream(f);
		w.write(o);
}

}
