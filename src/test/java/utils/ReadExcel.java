package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class ReadExcel 
{
	//Return entire sheet as an object
	public Sheet readExcelFile(String SheetName) throws IOException
	{
	   FileInputStream fis = new FileInputStream(new File("src\\test\\resources\\DataFiles\\Test.xlsx"));
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   XSSFSheet sheet = wb.getSheet(SheetName);
	   return sheet;
	}
	
	public void readExcelRow(int rownum) throws IOException
	{
	   FileInputStream fis = new FileInputStream(new File("src\\test\\resources\\DataFiles\\Test.xlsx"));
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   XSSFSheet sheet = wb.getSheetAt(0);
	   String[] Listdata = null;
	   String username = sheet.getRow(rownum).getCell(0).getStringCellValue();
	   String password = sheet.getRow(rownum).getCell(1).getStringCellValue();
	   System.out.println(username);
	   System.out.println(password);
	}

}
