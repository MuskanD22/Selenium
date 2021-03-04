package POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFiles {
	public static void main(String []args) throws Exception {
		File src=new File("D:\\Selenium\\POI ExcelFile\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		//XSSFWorkbook: Is a class representation of XLSX file. and HSSFSheet: Is a class representing a sheet in an XLS file.
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		// to load specfic sheet we 
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//row 
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		  
		System.out.println("Data from Excel is "+data0);
		
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		  
		System.out.println("Data from Excel is "+data1);
		
		wb.close();
	}
}
