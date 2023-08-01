package ReadDatafromExcel;

import lib.ExcelDataConfig;

public class ReadExcel {

	public static void main(String[] args) {
		ExcelDataConfig e=new ExcelDataConfig("C:\\Users\\DELL\\OneDrive\\Desktop\\Testdata.xlsx");
 String value= e.getData(0, 1, 1);
  System.out.println(value);
	}
		
}
