package POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFiles2 {
	public static void main(String []args) throws Exception {
		File src=new File("D:\\Selenium\\POI ExcelFile\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		//XSSFWorkbook: Is a class representation of XLSX file. and HSSFSheet: Is a class representing a sheet in an XLS file.
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		// to load specfic sheet we 
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//row 
		int rowCount =sheet1.getLastRowNum();
		  
		System.out.println("Total rows in Excel is "+rowCount);
		
		for(int i=0;i<rowCount;i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from row is "+i+" Excel sheet "+data0);
		}
		wb.close();
	}
}
