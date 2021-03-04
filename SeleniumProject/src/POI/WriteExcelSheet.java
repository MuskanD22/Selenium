package POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {
	public static void main(String[] args) throws Exception{
	File src=new File("D:\\Selenium\\POI ExcelFile\\Testdata.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	sheet1.getRow(0).createCell(2).setCellValue("Pass");
	
	sheet1.getRow(1).createCell(2).setCellValue("fail");
	
	FileOutputStream out=new FileOutputStream(src);
	
	wb.write(out);
	
	wb.close();
	}
}
