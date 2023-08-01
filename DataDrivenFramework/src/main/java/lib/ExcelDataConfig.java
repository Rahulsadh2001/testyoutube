package lib;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
public class ExcelDataConfig {

	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath) {
	try {	
		File src =new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb =new XSSFWorkbook(fis);
		
		}
	
	catch(Exception e) {
		
		System.out.println(e.getMessage());
	}
		
	}

public String getData(int sheetnum,int row,int column)

{sheet1=wb.getSheetAt(sheetnum);
String data = sheet1.getRow(row).getCell(column).getStringCellValue();
return data;
}


}
