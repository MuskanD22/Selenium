package POI;

import library.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] str) {
		ExcelDataConfig excel=new ExcelDataConfig("D:\\Selenium\\POI ExcelFile\\Testdata.xlsx");
		
		String data=excel.getData(0, 1, 1);
		System.out.println(data);
	}
}
