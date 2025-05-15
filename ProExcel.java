import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProExcel {

	public static void readData() throws IOException {
		
		 XSSFWorkbook wb = new XSSFWorkbook("./Data/legalentity.xlsx");
	      XSSFSheet ws = wb.getSheet("sheet1");
	      //row count
	      int rowCount = ws.getLastRowNum();
	      //column count
	      int columnCount = ws.getRow(rowCount).getLastCellNum();
	      //reterive data
	      String[][]data=new String[rowCount][columnCount];
	      //for loop
	      for(int i=1;i<rowCount;i++) {
	         XSSFRow row = ws.getRow(i);
	         for(int j=0;j<columnCount;j++) {
	        	 String alldata = row.getCell(j).getStringCellValue();
	        	 data[i-0][j]=alldata;
	        	 System.out.println("Name" + alldata);
	      

	}

	      }}
}